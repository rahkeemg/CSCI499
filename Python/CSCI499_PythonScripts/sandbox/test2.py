#! usr/bin/env python

# Using this program to test another way of getting information from
# Git with GitPython.

__author__ = 'rahkeemg'

from BlobRetrieval import BlobRetrieval
from MongoConnection.connection import MongoConnection
from git import *
import git, json, subprocess, re

# import os.path

git_dir = '/home/rahkeemg/Documents/GitRepositories/WhereHows'
# g = git.cmd.Git(git_dir)

# make an instance of the repository from specified path
repo = Repo(path=git_dir)

# variable to use git directly
g = repo.git

heads = repo.heads  # obtain the differnet repositories
master = heads.master  # get the master repository


# get all of the commits on the master branch
commits = list(repo.iter_commits(master))

cmd = ['java', '-classpath', '/home/rahkeemg/workspace/CSCI499_Java/bin/:/usr/local/lib/*:', 'java_gram.mainJava']

for i in range(len(commits) - 1, 0, -1):

    g.checkout(commits[i])

    commit_files = g.ls_files().split('\n')
    commit_num = len(commits) -1 -i

    print 'value of i: ', i, '\tcommit number:', commit_num

    print '\n', commits[i],'\t', commit_num, '\n\n', commit_files

    for current_file in commit_files:
        if re.search(r'\.java', current_file):
            cmd.append('{repo}/{file}'.format(repo=git_dir, file=current_file))

            print current_file

            j_response = subprocess.check_output(cmd, stderr=subprocess.STDOUT, shell=False)
            resp = j_response.split('\n')

            try:
                for e in resp:
                    if re.search(r'\"null\"', e):
                        c_file = json.loads(e)['null']
                        break
            except:
                pass

            # c_file = json.loads(j_response)['null']
            c_file['commit_id'] = commits[i].hexsha
            c_file['author'] = commits[i].author.name
            c_file['author_email'] = commits[i].author.email
            c_file['name'] = current_file
            c_file['abs_path'] = '{repo}/{file}'.format(repo=git_dir,file=current_file)
            c_file['repo'] = git_dir
            # c_file['commit_num'] = commit_num

            print c_file, '\n'

            if len(c_file) > 0:
                con = MongoConnection('Files','files')
                con.Insert_ONE(c_file)

            cmd.pop()
