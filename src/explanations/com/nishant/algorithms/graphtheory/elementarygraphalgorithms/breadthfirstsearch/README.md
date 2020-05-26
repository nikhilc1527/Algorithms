Breadth First Search is one two main searching algorithms. It is useful when you are trying to find the distance between two vertices, not using weights. There are
also many other uses for breadth first search. Breadth first search is as follows: start at any vertex, print it, then print all of it's neighbors. Once you are done,
then go to every neighbor one by one and do the same procedure. To avoid looping forever in cycles, we introduce a concept call colors. White means it's not visited
yet, grey means visited but didn't visit all of it's neighbors, and black means that that vertex and all of it's neighbors are visited. When adding neighbors to
visit, we check if there color is white.

To implement breadth first, we can use a queue. For the first vertex, we push it into the queue. Then we loop until the queue is empty. Every iteration, we pop the
top element from the queue and check all of it's neighbors. Using queue avoid accidentally visiting all the neighbors of a neighboring vertex before finishing
visiting all of the other neighbors.

One useful property of breadth first search is that once you get to a vertex, you know it's the shortest path from the starting node because you if it wasn't you
would have arrived at that vertex before.