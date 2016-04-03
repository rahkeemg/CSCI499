#! usr/bin/env python

__author__ = 'rahkeemg'

from BlobRetrieval import BlobRetrieval
from MongoConnection.connection import MongoConnection
from git import Repo
import git, json, subprocess, re

git_dir = '/home/rahkeemg/Documents/GitRepositories/NineGridImageView'
# g = git.cmd.Git(git_dir)



# make an instance of the repository from specified path
repo = Repo(path=git_dir)

heads = repo.heads  # obtain the differnet repositories
master = heads.master  # get the master repository

# get all of the commits on the master branch
commits = list(repo.iter_commits('master'))

commit_files = []
cmd = ["java","-classpath","/home/rahkeemg/workspace/CSCI499_Java/bin/:/usr/local/lib/*:","java_gram.mainJava"]

# cmd = ['java','-classpath','/home/rahkeemg/workspace/CSCI499_Java/bin/:/usr/local/lib/*:','java_gram.mainJava']

con = MongoConnection('Files', 'files')

# for commit in commits:
# for i in range(37, len(commits)-1):
for i in range(len(commits)-1, 0, -1):
    commit = commits[i]
    commit_num = len(commits)-1 -i
    print commit_num, ": ", commit.hexsha, '\n', commit.message, '\n'
    for entry in commit.tree.traverse():
        if re.search(r'\.java', entry.path):

            print entry.abspath
            current_file = entry.abspath.strip()
            cmd.append(current_file)

            j_response = subprocess.check_output(cmd,stderr= subprocess.STDOUT, shell=False)

            c_file = json.loads(j_response)['null']
            c_file['commit_id'] = commit.hexsha
            c_file['author'] = commit.author.name
            c_file['author_email'] = commit.author.email
            c_file['name'] = entry.path
            c_file['abs_path'] = entry.abspath
            c_file['repo'] = git_dir
            c_file['commit_num'] = commit_num
            # print c_file
            # commit_files.append(c_file)

            # The below block of code stores files one by one
            if len(c_file) > 0:
                # Instance of Mongo database connection and collection to store info in
                con.Insert_ONE(c_file)

            cmd.pop()
    print '\n'

    # if len(commit_files) > 0:
    #     con = MongoConnection('Files','files')
    #     con.Insert(commit_files)
    print '\n'