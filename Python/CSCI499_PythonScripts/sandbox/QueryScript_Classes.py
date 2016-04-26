#! use/bin/env python

from MongoConnection.connection import MongoConnection
from git import *
# import plotly as py
# import plotly.graph_objs as go

git_dir  = '/home/rahkeemg/Documents/GitRepositories/Good_Bad/Good/json-simple'
con = MongoConnection('json-simple','commits')

 # make an instance of the repository from specified pathlines
repo = Repo(path=git_dir)
g = repo.git # variable to use git directly

heads = repo.heads  # obtain the differnet repositories
master = heads.master  # get the master repository

list_of_commits = list(repo.iter_commits(master)) # get all of the commits on the master branch
limit = len(list_of_commits) - 1  #variable to determine which commit to go to

commits = []
for i in range(0, limit):
    cursor = con.Query({'commit_num': i})
    types_info = {}


    #This loop goes through the files in each commit_num
    for document in cursor:


        #This loop get specific file_items of a document
        for item in document['file_items']:
            t = item['type']

            #Conditional to count and check number of types
            if types_info.__contains__(t):
                for key in item['metrics']:
                    types_info[t][key] += item['metrics'][key]
            else: types_info[t] = item['metrics']

    print types_info
    commits.append(types_info)