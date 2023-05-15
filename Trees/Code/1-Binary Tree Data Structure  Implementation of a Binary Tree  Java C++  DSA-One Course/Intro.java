/*
___________________________________________________________________________________________
Binary Tree

----> A tree with each node having at most two children is called Binary Tree
----> Maximum number of nodes at level i is 2^i
----> Maximum number of nodes in a tree with height h is 2^h - 1
___________________________________________________________________________________________
Storing binary tree

----> You can store a tree in the from of an array like the following tree

                                        2
                                       / \
                                      4   1
                                     / \  /   
                                    7  10 4
                                   /
                                  6
----> {null, 2, 4, 1, 7, 10, 4, null, 6} 

----> Here the left chilren is 2*i
----> Here the right children is 2*i + 1

Where i is the index
___________________________________________________________________________________________

 */