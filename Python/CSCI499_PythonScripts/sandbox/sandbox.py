#! usr/bin/env python

__author__ = 'rahkeemg'

# THIS AREA, SANDBOX, IS WHERE TESTING OF NEW IDEAS ARE PERFORMED AND RECORDED.
# ONCE TESTING IS COMPLETE, INTEGRATE INTO mainScript.py of project folder
# Purpose of this script: run Gitpy and Antlr4 parser on files from Git


import os, os.path, git

git_dir = "/home/rahkeemg/Documents/GitRepositories/WhereHows"
g = git.cmd.Git(git_dir)

from git import Repo

# join = os.path.join(git_dir)

# make an instance of the repository from specified path
repo = Repo(path=git_dir)

heads = repo.heads  # obtain the differnet repositories
master = heads.master  # get the master repository

# print master.commit.hexsha, '\n', master.commit.author, '\n', master.commit.message

# get all of the commits on the master branch
commits = list(repo.iter_commits('master'))
# print commits[0].tree[3].name

# print commits[0].message
# for item in commits[0].tree:
#     print item.abspath

############################################################################
# Calling external system commands on commit and tree objects from python
# Future extensions will include calling Antlr4 parser on the specific
# Path returned to get the parser to run on the file
# Also learning how to use trees in GitPython
############################################################################

# dir_file = '/home/rahkeemg/workspace/sandbox2/src/java_gram/ProgramListener.java'

# subprocess.check_output(os_command,shell=True)
# format is used to insert file name into string command
# subprocess.check_output('cloc --by-file {variable}'.format(variable=dir_file))

# external command to run Antlr4 parser on files.  This is the full command used in terminal
# command = "java -classpath /home/rahkeemg/workspace/sandbox2/bin/:/usr/local/lib/*: java_gram.mainJava < /home/rahkeemg/Desktop/Antlr_scripts/Hello/HelloLexer.java"

# this is the abridged command to use in python
# command = "java -classpath /home/rahkeemg/workspace/sandbox2/bin/:/usr/local/lib/*: java_gram.mainJava < "

# os.system("java -classpath /home/rahkeemg/workspace/sandbox2/bin/:/usr/local/lib/*: java_gram.mainJava < /home/rahkeemg/workspace/sandbox2/src/java_gram/ProgramListener.java")

###########################################################
# 2nd method.  USE THIS ONE TO GET OUTPUT FROM JAVA PARSER
###########################################################

# os_command = "java -classpath /home/rahkeemg/workspace/sandbox2/bin/:/usr/local/lib/*: java_gram.mainJava < /home/rahkeemg/Desktop/Antlr_scripts/Hello/HelloLexer.java"
# j_response = subprocess.check_output(os_command,shell=True)

#############################################
# End of calling external files from python #
#############################################

# need to find out how to get all the files in the tree
# Idea:  Use the type function on Git Objects to
#       get the object type.  If the object is a tree,
#       continue to recursively call tree traversal.
#       End if object found is a blob, then return path and name

#####################################################
# Obtainning all the files of the tree observerd #
#####################################################

# tree = commits[0].tree
#
# for entry in tree.blobs: #get the blob files directly under tree
#     print entry.abspath, ' ', entry.type
#     # os.system('cloc --by-file ' + entry.abspath)
#     # print '\n\n\n'
#
# for entry in tree.trees: #get blob files of all subdirectories
#     for b in entry.blobs:
#         print b.abspath, '', b.type
#     for t in entry.trees:
#         print t.abspath, ' ', t.type
#################################################
# End of method to get all files in commit tree #
#################################################

# for file in commits[0].tree.trees:
#     print file.name

# print commits[0].tree[0].abspath
# dir_file = commits[0].tree[0].abspath

# format is used to insert file name into string command
# os.system('cloc --by-file {variable}'.format(variable=dir_file))

# os.system('java /home/rahkeemg/workspace/sandbox2/bin/java_gram/mainJava.java {variable}'.format(variable=dir_file))

##################################################################################
# End of calling commit & tree objects then running external commands via python #
#################################################################################

#############################################################
# Getting list of commits and their metadata with GitPython #
#############################################################

# iterate through commit list to obtain individ. commit & print out metadata
# for c in commits:
#     print c.hexsha
#     print c.author.name, "<",c.author.email,">"
#     print "\n", c.message , "\n"
#     # print c.stats.total
#     for i in c.stats.files:
#         print "\t", i
#     print "\n"

#############################
# End of obtainning commits #
#############################


# log = master.log()
# log = g.log("--pretty=%h").split('\n')
# for i in log:
#     print i

# print g.log("--pretty=fuller","--name-only")

#####################################################
# Learning how to use git directly through GitPython #
####################################################


# git = repo.git
# print git.log("--numstat")  #using log and its flags

# print git.checkout('05b50325a84a81879933e41c92e66cc72f207cdc')
# print git.ls_files() #for commands such as ls-files, you must use '_' in place of '-'


# print git.branch("-a")  #using branch and -a flag to list remote & local branches

# End of learning how to use git directly through GitPython
##########################################


###############################
# Using JSON in python
###############################
# import json
#
# # This is just a specific commit.
# # For this example. we are using the very first commit added to repository
#
# print commits[len(commits)-1].hexsha, \
#     '\n', commits[len(commits)-1].author, \
#     '\n', commits[len(commits)-1].author.email;
#
# # example of getting information out of gitpy commit object and putting it into json object.
# # For some reason, this seems to be the only way to get information directly into json encode format
# author = '{author}'.format(author=commits[len(commits)-1].author)
# author_email = '{email}'.format(email=commits[len(commits)-1].author.email)
# commit = '{hexsha}'.format(hexsha=commits[len(commits)-1].hexsha)
# repo = '{repo}'.format(repo=commits[len(commits)-1].repo)
#
# #encoding json information in Python
# print json.dumps({'repo': repo, 'author': author, 'email': author_email, 'commit': commit})
#
# # example decoding json information from Python.  This returns a dictionary.  Therefore, d = dict[info]
# d = json.loads('{"FILE_NAME.JAVA":{"abs_path":"Path\/to\/file","metrics":{"package":1,"comments":32,"import":2,"else":4,"for":1,"try":0,"catch":0,"do":0,"while":0,"if":7,"total lines":215,"switch":1},"repository":"MyRepository","commit_id":"aid82n384@asd","rel_path":"\/rel_path","file_items":[{"Stats":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":199,"switch":0}},{"Stats()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":2,"switch":0}},{"Stats(TokenStreamtstream)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"Stats(TokenStreamtstream,Tokent1,Tokent2)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":5,"switch":0}},{"setStart(Tokent1)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"setStop(Tokent2)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getStart()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getStop()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"count()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":49,"switch":0}},{"getLoc()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getComments()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getBlank()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"totalLines()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":5,"switch":0}},{"identifyToken(Tokent)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":40,"switch":0}},{"getImport()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getPackage()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getSwitch()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getCase()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getTry()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getCatch()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getIf()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getElse()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getFor()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getDo()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}},{"getWhile()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":3,"switch":0}}]}}')


##################################################
# Adding repository specifi information to files.#
##################################################

#     # test_file = '/home/rahkeemg/Desktop/Antlr_scripts/lang_Gram/Java/java/JavaParser.java'
#     # test_file = '/home/rahkeemg/Desktop/GitRepositories/ant/src/main/org/apache/tools/ant/FileScanner.java'
#
#     print entry.abspath
#
#     test_file = entry.abspath
#     os_command = 'java -classpath /home/rahkeemg/workspace/sandbox2/bin/:/usr/local/lib/*: java_gram.mainJava {file}'.format(file=test_file)
#     # s = os.system(os_command)
#
#     j_response = subprocess.check_output(os_command,shell=True)
#     # used json.loads(j_response)['null'] to get the content of the object that doesn't have a name for key
#     dictionary = {test_file: json.loads(j_response)['null']}
#     print dictionary

# Here is where the remainder of file information is added to
# JSON object, now converted to a dictionary.
# File_name, repository, file_path, commit_id, date, author
# dictionary['FILE_NAME.JAVA']['commit_id'] = commits[len(commits)-1].hexsha
# dictionary['FILE_NAME.JAVA']['repository'] = git_dir
# dictionary['FILE_NAME.JAVA']['author'] = commits[len(commits)-1].author.name
# dictionary['FILE_NAME.JAVA']['author_email'] = commits[len(commits)-1].author.email
# dictionary['FILE_NAME.JAVA']['date'] = commits[len(commits)-1].committed_date
# dictionary['FILE_NAME.JAVA']['abs_path'] = commits[len(commits)-1].abspath
# dictionary['FILE_NAME.JAVA']['rel_path'] = commits[len(commits)-1].path

# END OF SECTION
###########################

#############################
# Using regex to sub dot in key field to different character
###########################

# from BlobRetrieval import BlobRetrieval
# from MongoConnection.connection import MongoConnection
# import subprocess, re, json
#
# for commit in commits:
#
#     print commit.hexsha
#
#     # get blobs of commits
#     retrieval = BlobRetrieval()
#     retrieval.findFILE(commit.tree)
#
#     for blob in retrieval.getBlobs():
#
#         if re.search(r'\.java', blob.path):
#
#             print blob.path
#
# #             os_command = 'java -classpath /home/rahkeemg/workspace/sandbox2/bin/:/usr/local/lib/*: java_gram.mainJava {file}'.format(file=blob.abspath)
# #             j_response = subprocess.check_output(os_command, shell=True)
#
#
#             cmd = ["java","-classpath","/home/rahkeemg/workspace/CSCI499_Java/bin/:/usr/local/lib/*:","java_gram.mainJava"]
#             cmd.append(blob.abspath)
#             j_response = subprocess.check_output(cmd,stderr= subprocess.STDOUT, shell=False)
#
#             c_file = json.loads(j_response)
#             # c_file = json.loads(j_response)['null']
#             print c_file
#
#             c_file['commit_id'] = commit.hexsha
#             c_file['author'] = commit.author.name
#             c_file['author_email'] = commit.author.email
#             c_file['name'] = blob.path
#             c_file['abs_path'] = blob.abspath
#             c_file['repo'] = git_dir
#
#             # commit_files.append(c_file)
#
#             # The below block of code stores files one by one
#             if len(c_file) > 0:
#                 # Instance of Mongo database connection and collection to store info in
#                 con = MongoConnection('Files', 'files')
#                 con.Insert_ONE(c_file)

#####################################################
# Using traverse in GitPython instead of my own class#
#####################################################

from BlobRetrieval import BlobRetrieval
from MongoConnection.connection import MongoConnection
import re, subprocess, json

blobs = []

cmd = ["java","-classpath","/home/rahkeemg/workspace/sandbox2/bin/:/usr/local/lib/*:","java_gram.mainJava"]
for commit in commits:
    print commit.hexsha
    for entry in commit.tree.traverse():
        if re.search(r'\.java', entry.path):
            cmd.append(entry.abspath)
            # os_command = 'java -classpath /home/rahkeemg/workspace/sandbox2/bin/:/usr/local/lib/*: java_gram.mainJava {file}'.format(file=entry.abspath.strip())
            # j_response = subprocess.check_output(os_command, shell=True)
            j_response = subprocess.check_output(cmd,stderr= subprocess.STDOUT, shell=False)

            c_file = json.loads(j_response)['null']
            # c_file = json.loads(j_response)['null']
            print entry.path, " ", c_file

            c_file['commit_id'] = commit.hexsha
            c_file['author'] = commit.author.name
            c_file['author_email'] = commit.author.email
            c_file['name'] = entry.path
            c_file['abs_path'] = entry.abspath
            c_file['repo'] = git_dir

            # The below block of code stores files one by one
            if len(c_file) > 0:
                # Instance of Mongo database connection and collection to store info in
                con = MongoConnection('Files', 'files')
                con.Insert_ONE(c_file)