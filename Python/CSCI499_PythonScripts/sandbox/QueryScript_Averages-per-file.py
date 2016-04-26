#! usr/bin/env python
from __future__ import division
from MongoConnection.connection import MongoConnection

# con = MongoConnection('slidingmenu','commits')

# cursor = con.Query({})
# cursor.sort('commit_num')

# Code to get som of all metrics in repository

# metrics = {}; file_info_count = {};
# count = 0; commit_num = 0; commit_count = 0;
# for document in cursor:
#     # print document
#     # count += 1
#
#     # Idea: Use this type of loop to get sum of different metrics
#     for key in document['metrics']:
#         if metrics.__contains__(key): #initalize dictionary with key and value if doesn't exit
#             metrics[key] += document['metrics'][key]
#         else: metrics[key] = document['metrics'][key] #increment value associated to key
#
#         # Getting number of commits recorded in this repository
#         if commit_num != document['commit_num']:
#             commit_num = document['commit_num']
#             commit_count += 1
#
#     # Getting number of CLASSES, METHODS,
#     if type_count.__contains__()
#
# print "TOTAL # FILES IN REPOSITORY: ", cursor.count()
# print "TOTAL RECORDED COMMITS IN DATABASE: ",  commit_count
# print "AVERAGE # FILES PER COMMIT: ", float(cursor.count()/commit_count), '\n'
#
# print "SUM OF ALL COMMIT'S METRICS IN REPOSITORY"
# for key in metrics:
#     print key, '\t', metrics[key]
#
# print "\nAVERAGE STATS OF REPOSITORY PER FILE\n"
# for key in metrics:
#     print key, '\t', float(metrics[key]/cursor.count())
#
# print "\nAVERAGE STATS PER COMMIT\n"
# for key in metrics:
#     print key, '\t', float(metrics[key]/commit_count)
#
#
# print"\nTOTAL NUMBER OF METHODS:"



# con = MongoConnection('jasminserver','commits')
#
# #Loop to get the count of types in Database
# cursor = con.Query({})
# for document in cursor:
#     for i in range(0, len(document['file_items']) - 1):
#         t = document['file_items'][i]['type']
#         if type_count.__contains__(t):
#             type_count[t] += 1
#         else: type_count[t] = 0
# print type_count


#Use this chunk of code to get number of files per commit,
#Classes and other types per commit,

from git import *

git_dir = '/home/rahkeemg/Documents/GitRepositories/Good_Bad/Other/Catacomb-Snatch'

con = MongoConnection('Catacomb-Snatch','commits')

# make an instance of the repository from specified pathlines
repo = Repo(path=git_dir)

g = repo.git # variable to use git directly

heads = repo.heads  # obtain the differnet repositories
master = heads.master  # get the master repository

commits = list(repo.iter_commits(master)) # get all of the commits on the master branch
print len(commits)

commit_info = []
commit_classes_info = []

limit = len(commits)-1  #variable to determine which commit to go to

### This loops gets the total statistics per commit ###

# for i in range(0, len(commits)-1):
for i in range(0,limit):
    cursor = con.Query({'commit_num': i})
    file_info = {} # Gets the totals for info in files

    file_info['commit_num'] = i #Add commit number as a field in dictionary
    file_info['files_in_commit'] = cursor.count()

    class_info = {}

    for document in cursor:  #This loop gets the files per commit_num
        for j in range(0,len(document['file_items'])): #This is to get types per commit
            if file_info.__contains__(document['file_items'][j]['type']):
                file_info[document['file_items'][j]['type']] += 1 #increment type for specific file if in dictionary
            else: file_info[document['file_items'][j]['type']] = 0 #initialize if not in specified dictionary

        # Idea: Use this type of loop to get sum of different metrics
        # This nested loop gets the sum of the metrics for each commit
        for key in document['metrics']:
            #THIS IS ONE UNIFIED LIST OF ALL STATS & METRICS
            if file_info.__contains__(key): #initalize dictionary with key and value if doesn't exit
                file_info[key] += document['metrics'][key]
            else: file_info[key] = document['metrics'][key] #increment value associated to key

    print i, file_info, 'Number of files in commit:{count}'.format(count=cursor.count())
    commit_info.append(file_info)

import plotly as py
# print plotly.__version__  # version >1.9.4 required

# from plotly.graph_objs import Scatter, Layout
import plotly.graph_objs as go


#Idea to get specific entries out of dictionary
y_info = {'files_in_commit':[], 'total lines':[], 'comments': [], 'loc': [], 'CLASS':[], 'ENUM': [],
          'ANNOTATION':[], 'CONSTRUCTOR':[], 'METHOD':[], 'INTERFACE': [],
          'if':[], 'else':[], 'try':[],'catch':[], 'do': [], 'while': [],
          'for':[], 'switch':[], 'case': [],'import': [], 'package': [], }

for i in range(0,limit):
    c = commit_info[i]
    # y_info_total_files.append(commit_info[i]['files_in_commit'])
    y_info['files_in_commit'].append(c['files_in_commit'])

    if c.__contains__('total lines'):
        y_info['total lines'].append(c['total lines']/c['files_in_commit'])
    else: y_info['total lines'].append(0)

    if c.__contains__('comments'):
        y_info['comments'].append(c['comments']/c['files_in_commit'])
    else: y_info['comments'].append(0)

    if c.__contains__('loc'):
        y_info['loc'].append(c['loc']/c['files_in_commit'])
    else: y_info['loc'].append(0)

    if c.__contains__('CLASS'):
        y_info['CLASS'].append(c['CLASS']/c['files_in_commit'])
    else: y_info['CLASS'].append(0)

    if c.__contains__('INTERFACE'):
        y_info['INTERFACE'].append(c['INTERFACE']/c['files_in_commit'])
    else: y_info['INTERFACE'].append(0)

    if c.__contains__('METHOD'):
        y_info['METHOD'].append(c['METHOD']/c['files_in_commit'])
    else: y_info['METHOD'].append(0)

    if c.__contains__('CONSTRUCTOR'):
        y_info['CONSTRUCTOR'].append(c['CONSTRUCTOR']/c['files_in_commit'])
    else: y_info['CONSTRUCTOR'].append(0)

    if c.__contains__('ENUM'):
        y_info['ENUM'].append(c['ENUM']/c['files_in_commit'])
    else: y_info['ENUM'].append(0)

    if c.__contains__('ANNOTATION'):
        y_info['ANNOTATION'].append(c['ANNOTATION']/c['files_in_commit'])
    else: y_info['ANNOTATION'].append(0)

    if c.__contains__('if'):
        y_info['if'].append(c['if']/c['files_in_commit'])
    else: y_info['if'].append(0)

    if c.__contains__('else'):
        y_info['else'].append(c['else']/c['files_in_commit'])
    else: y_info['else'].append(0)

    if c.__contains__('switch'):
        y_info['switch'].append(c['switch']/c['files_in_commit'])
    else: y_info['switch'].append(0)

    if c.__contains__('case'):
        y_info['case'].append(c['case']/c['files_in_commit'])
    else: y_info['case'].append(0)

    if c.__contains__('for'):
        y_info['for'].append(c['for']/c['files_in_commit'])
    else: y_info['for'].append(0)

    if c.__contains__('while'):
        y_info['while'].append(c['while']/c['files_in_commit'])
    else: y_info['while'].append(0)

    if c.__contains__('do'):
        y_info['do'].append(c['do']/c['files_in_commit'])
    else: y_info['do'].append(0)

    if c.__contains__('package'):
        y_info['package'].append(c['package']/c['files_in_commit'])
    else: y_info['package'].append(0)

    if c.__contains__('import'):
        y_info['import'].append(c['import']/c['files_in_commit'])
    else: y_info['import'].append(0)

    if c.__contains__('try'):
        y_info['try'].append(c['try']/c['files_in_commit'])
    else: y_info['try'].append(0)

    if c.__contains__('catch'):
        y_info['catch'].append(c['catch']/c['files_in_commit'])
    else: y_info['catch'].append(0)

#Code to plot data in scatter plot
py.offline.plot({
    "data": [
        # Scatter(x=range(0,len(x_files_in_commits)-1), y=x_files_in_commits)
        # go.Scatter(x=range(0, limit), y=y_info['files_in_commit'], name='Files'),
        go.Scatter(x=range(0,limit), y=y_info['comments'], name='Comments'),
        go.Scatter(x=range(0,limit), y=y_info['total lines'], name='Total Lines'),
        go.Scatter(x=range(0,limit), y=y_info['loc'], name='L.O.C'),
        go.Scatter(x=range(0,limit), y=y_info['INTERFACE'], name='Interfaces'),
        go.Scatter(x=range(0,limit), y=y_info['CLASS'], name='Classes'),
        go.Scatter(x=range(0,limit), y=y_info['METHOD'], name='Methods'),
        go.Scatter(x=range(0,limit), y=y_info['CONSTRUCTOR'], name='Constructors'),
        go.Scatter(x=range(0,limit), y=y_info['ENUM'], name='Enums'),
        go.Scatter(x=range(0,limit), y=y_info['ANNOTATION'], name='Annotations'),
        go.Scatter(x=range(0,limit), y=y_info['if'], name='if'),
        go.Scatter(x=range(0,limit), y=y_info['else'], name='else'),
        go.Scatter(x=range(0,limit), y=y_info['switch'], name='switch'),
        go.Scatter(x=range(0,limit), y=y_info['case'], name='case'),
        go.Scatter(x=range(0,limit), y=y_info['for'], name='for'),
        go.Scatter(x=range(0,limit), y=y_info['do'], name='do'),
        go.Scatter(x=range(0,limit), y=y_info['while'], name='while'),
        go.Scatter(x=range(0,limit), y=y_info['try'], name='try'),
        go.Scatter(x=range(0,limit), y=y_info['catch'], name='catch'),
        go.Scatter(x=range(0,limit), y=y_info['import'], name='import'),
        go.Scatter(x=range(0,limit), y=y_info['package'], name='package'),
    ],
    "layout": go.Layout(
        title="Catacomb-Snatch Averages per file",
        xaxis = dict(title = 'Commit'),
        yaxis = dict(title = '#'),
    )
})