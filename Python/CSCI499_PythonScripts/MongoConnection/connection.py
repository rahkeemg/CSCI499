#! usr/bin/env/python

from pymongo import MongoClient

class MongoConnection:
    def __init__(self, db, col1):
        self.client = MongoClient()
        self.db = self.client[db]
        self.collection = self.db[col1]
        self.cursor = self.collection.find()

    def Find(self):
        for document in self.cursor:
            print (document)

    def Insert(self, info):
        self.collection.insert_many(info)
        # insert ionformation into a collection.  Note: Key names can't contain '.' Maybe add a field: file type: java
        # collection.insert(
        #     [
        #         {"DatabaseWriter":{"metrics":{"package":1,"comments":18,"import":8,"else":0,"for":1,"try":1,"catch":1,"do":0,"while":0,"if":1,"total lines":84,"switch":0},"file_items":[{"DatabaseWriter":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":56,"switch":0}},{"DatabaseWriter(JdbcTemplatejdbcTemplate,StringtableName)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":4,"switch":0}},{"DatabaseWriter(DataSourcedataSource,StringtableName)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":4,"switch":0}},{"DatabaseWriter(StringconnectionUrl,StringtableName)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":5,"switch":0}},{"flush()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":24,"switch":0}},{"close()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":4,"switch":0}}]}},
        #         {"Constant":{"metrics":{"package":1,"comments":70,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":172,"switch":0},"file_items":[{"Constant":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":154,"switch":0}}]}}
        #     ]
        # )
    def Insert_ONE(self,info):
        self.collection.insert_one(info)

    def Query(self, query):
        return None

    def setCollection(self, col):
        self.collection = col

    def setDB(self, db):
        self.db = db


# client = MongoClient()
#
# # db = client.Files # can access Mongo databases in this fashion
# db = client['Files']  # can also access Mongo databases in dictionary like fashion dict['database_name'].  Consider using this
#
# collection = db['files']
#
# # cursor = db.files.find() # print information in a collection
# cursor = db['files'].find() #can also access collections in dictionary fashion dict['collection_name']
#
# cursor = collection.find()
# for document in cursor:
#     print(document)
#
#     # insert ionformation into a collection.  Note: Key names can't contain '.' Maybe add a field: file type: java
# collection.insert(
#         [
#             {"DatabaseWriter":{"metrics":{"package":1,"comments":18,"import":8,"else":0,"for":1,"try":1,"catch":1,"do":0,"while":0,"if":1,"total lines":84,"switch":0},"file_items":[{"DatabaseWriter":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":56,"switch":0}},{"DatabaseWriter(JdbcTemplatejdbcTemplate,StringtableName)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":4,"switch":0}},{"DatabaseWriter(DataSourcedataSource,StringtableName)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":4,"switch":0}},{"DatabaseWriter(StringconnectionUrl,StringtableName)":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":5,"switch":0}},{"flush()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":24,"switch":0}},{"close()":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":4,"switch":0}}]}},
#             {"Constant":{"metrics":{"package":1,"comments":70,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":172,"switch":0},"file_items":[{"Constant":{"package":0,"comments":0,"import":0,"else":0,"for":0,"try":0,"catch":0,"do":0,"while":0,"if":0,"total lines":154,"switch":0}}]}}
#          ]
#     )


# Using class instance of this program to query files
# con = MongoConnection('Files','files')
# con.Find()


