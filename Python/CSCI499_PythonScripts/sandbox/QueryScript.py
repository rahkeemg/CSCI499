#! usr/bin/env python

from MongoConnection.connection import MongoConnection

con = MongoConnection('Files','files')

cursor = con.Query({})
cursor.sort('commit_num')

# Code to get som of all metrics in repository
metrics = {}
count = 0; commit_num = 0; commit_count = 0;
for document in cursor:
    # print document
    count += 1

    # Idea: Use this type of loop to get
    for key in document['metrics']:
        if metrics.__contains__(key): #initalize dictionary with key and value if doesn't exit
            metrics[key] += document['metrics'][key]
        else: metrics[key] = document['metrics'][key] #increment value associated to key

        # Getting number of commits recorded in this repository
        if commit_num != document['commit_num']:
            commit_num = document['commit_num']
            commit_count += 1

print "TOTAL # FILES IN REPOSITORY: ", cursor.count()
print "TOTAL RECORDED COMMITS IN DATABASE: ",  commit_count
print "AVERAGE # FILES PER COMMIT: ", float(cursor.count()/commit_count), '\n'

print "SUM OF ALL COMMIT'S METRICS IN REPOSITORY"
for key in metrics:
    print key, '\t', metrics[key]

print "\nAVERAGE STATS OF REPOSITORY PER FILE\n"
for key in metrics:
    print key, '\t', float(metrics[key]/cursor.count())

print "\nAVERAGE STATS PER COMMIT\n"
for key in metrics:
    print key, '\t', float(metrics[key]/commit_count)