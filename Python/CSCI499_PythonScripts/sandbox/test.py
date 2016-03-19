#! usr/bin/env python

__author__ = 'rahkeemg'

from BlobRetrieval import BlobRetrieval
from MongoConnection.connection import MongoConnection
import git, json, subprocess, re

git_dir = "/home/rahkeemg/Documents/GitRepositories/WhereHows"
# g = git.cmd.Git(git_dir)

from git import Repo

# make an instance of the repository from specified path
repo = Repo(path=git_dir)

heads = repo.heads  # obtain the differnet repositories
master = heads.master  # get the master repository

# get all of the commits on the master branch
commits = list(repo.iter_commits('master'))

for commit in commits:
    # commit = commits[0]  # picks a specific commit
    tree = commit.tree  # get the tree for that commit
    print commit.hexsha
    # import personal class to retrieve all blobs in repository
    # from BlobRetrieval import BlobRetrieval

    retrieval = BlobRetrieval()
    retrieval.findFILE(tree)

    commit_files = []  # list to hold json responses from Antlr4 parser

    for blob in retrieval.getBlobs():

        search = re.search(r'\.java',blob.path)
        if search:
            print blob.path
            os_command = 'java -classpath /home/rahkeemg/workspace/sandbox2/bin/:/usr/local/lib/*: java_gram.mainJava {file}'.format(file=blob.abspath)
            j_response = subprocess.check_output(os_command, shell=True)

            # Use these next two lines to help translate information into MySQL format.  They turn info into a Python dictionary first
            # used json.loads(j_response)['null'] to get the content of the object that doesn't have a name for key
            # dictionary = {blob.path: json.loads(j_response)['null']}

            c_file = json.loads(j_response)['null']
            c_file['commit_id'] = commit.hexsha
            c_file['author'] = commit.author.name
            c_file['author_email'] = commit.author.email
            c_file['name'] = blob.path
            c_file['abs_path'] =  blob.abspath
            c_file['repo'] = git_dir

            # commit_files.append(c_file)

            # The below block of code stores files one by one
            if len(c_file) > 0:
                # Instance of Mongo database connection and collection to store info in
                con = MongoConnection('Files', 'files')
                con.Insert_ONE(c_file)

    # print commit_files

    # if len(commit_files) > 0:
    #     # Testing to store information into MongoDB
    #     # from MongoConnection.connection import MongoConnection
    #     con = MongoConnection('Files', 'files')
    #     print commit.hexsha
    #     con.Insert(commit_files)
    #     con.Find()
