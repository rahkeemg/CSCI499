#! usr/bin/env/ python

class Utilities:
    def __init__(self):
        return None

    def formattMongoFileName(self, m_file):
        return m_file

    def dotReplaceMongo(self, info):
        for keys in info['file_items']:
            print keys