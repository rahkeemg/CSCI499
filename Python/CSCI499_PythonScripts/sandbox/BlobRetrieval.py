#! usr/bin/env/python

import git

class BlobRetrieval:
    def __init__(self):
        self.blobs = []

    def findFILE(self, item):

        # end statement
        if item.type == 'blob':
            # print item.abspath
            self.blobs.append(item)
            # return item
        else:
            for entry in item:
                self.findFILE(entry)

    def getBlobs(self):
        return self.blobs
