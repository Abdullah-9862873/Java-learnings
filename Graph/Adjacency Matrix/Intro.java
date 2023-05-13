/*
____________________________________________________________________________________________________________
----> Adjacency matrix is also a type of representation of graph like the adjacency list... But in the adjacency matrix, the graph is stored in the form of 2D array... It has rows and columns...

----> So for example, you want to find whether an edge exist between vertex 2 and 3 then you will simple check the value of graph[2][3]... If it is 1 then that means that the edge exists and if it is 0 then edge does not exist

----> So the values of the matrix can either be 1 or 0... 1 means that the edge exist and 0 means it doesn't...

---> But that case is only for the UNWEIGHTED GRAPH... In case of the weighted graph the weights are stored rather than the 0 and 1 in the adjacency matrix...
____________________________________________________________________________________________________________

----> Adjacency matrix is not used very commonly because it takes extra space... As for example, there is only a node between 2 and 1 but it will store the value 0 for every other vertex for 2 in the memory... Which takes a alot of space... Plus finding the neighbor takes O(No_of_Vertex) time complexity rather than the O(x) which was in case of adjacency list where the "x" is the number of lists in that vertex...

____________________________________________________________________________________________________________
 */