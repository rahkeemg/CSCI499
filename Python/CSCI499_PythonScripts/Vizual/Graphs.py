#! use/bin/env python

class Graph:
    def __init__(self):
        return 0
    def scatter_plot(self,data):
        return 0
    def bar_plot(self,data):
        return 0


####################################
#Plotly example for scattered plots#
####################################
# import plotly
# print plotly.__version__  # version >1.9.4 required
# from plotly.graph_objs import Scatter, Layout
# plotly.offline.plot({
# "data": [
#     Scatter(x=[1, 2, 3, 4], y=[4, 1, 3, 7])
# ],
# "layout": Layout(
#     title="hello world"
# )
# })

#######################################################
# Use this to show the differences in commits, and size of repository
##############################################

# import plotly as py
# # import plotly.plotly as py
# import plotly.graph_objs as go
#
# data = [
#     go.Bar(
#         x=['JazminServer', 'Hystrix', 'json-simple', 'Catacomb-Snatch'],
#         y=[20, 14, 23, 230]
#     )
# ]
# py.offline.plot(data, filename='Repositories.html')