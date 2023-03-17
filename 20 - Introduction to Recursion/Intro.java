/*
 * How does function call works internally??
 * 
 * 1- While the function is not finished executing, it will remain in
 * stack.... So "main" function is the first function that will go into the
 * stack and is the last function to come out of the stack
 * 
 * 2- When a function finishes executing then it is removed from the stack and
 * the flow of program is restored from where the function was called
 * 
 * 3- Base condition in recursion, the condition where our recursion will stop
 * making new calls
 * 
 * 4- If you are calling a function again and again then it will be in the
 * memory (Stack) seperately... Every function call will have the space in the
 * stack seperately
 * 
 * 5- No base condition------->Function call will keep happening, stack will be
 * filled again and again--------> Memory of computer will exceed the
 * limit-----> Stack overflow error
 * ____________________________________________________________________________
 * What is Recursion?
 * 
 * Recrusion is basically a function calling itself
 * ____________________________________________________________________________
 * Why Recursion ?
 * 
 * ---------> It helps us in solving bigger and complex problems in a simple way
 * ---------> You can convert recursion solution to iteration(Loops) and vice
 * versa... First solve complex problems using recursion and then try to solve
 * it using the iteration because directly solving it will be difficult
 * ---------> Space complexity is not constant because of the recursion calls as
 * every call will take space in the stack itself... Whereas the simple
 * iteration has a constant space complexity, it just prints the numbers in the
 * console if we take printing example
 * ---------> It helps us in breaking down the bigger problems into smaller
 * problems
 * 
 * ____________________________________________________________________________
 * Visualizing Recursion
 * 
 * print(5)<---print(4)<---print(3)<---print(2)<---print(1)<---main()
 * |
 * V
 * print(4)--->print(3)--->print(2)--->print(1)---> main()---->Program ends
 * 
 * ___________________________________________________________________________
 * How to know if a question can be solved using recursion?
 * 
 * When a bigger problem can be divided into smaller problems then it is a
 * signal that you can apply recursion like in this question of fibonacci
 * numbers where fib(n)=fib(n-1)+fib(n-2)
 * 
 * ___________________________________________________________________________
 * Recurrence Relation:
 * --------------> When a formula is written for recursion then it is called
 * recurrence relation
 * 
 * ___________________________________________________________________________
 * Last function call is called the tail recursion
 * 
 * ___________________________________________________________________________
 * How to understand and approach a problem??
 * --------> 1- Identify if you can break the problem into smaller problems
 * --------> 2- Write the recurrence relation if needed
 * --------> 3- Base condition
 * --------> 4- Draw the recursion tree
 * About the tree:
 * ---------------------->See the flow of functions how they are getting into
 * stack
 * ----------------------> Identify and focus on left tree calls and right tree
 * calls
 * ----------------------> Draw the tree and pointers again and again using pen
 * and paper
 * ----------------------> Use the debugger to see the flow
 * 
 * 5- See how to values are returned at each step
 * 6- See where the function call is coming out of and in the end you will come
 * out of the main function
 * 
 * ___________________________________________________________________________
 * Types of Recurrence Relation:
 * ---------> 1- Linear Recurrence Relation -----> Example--> Fibonacci Seies
 * ---------> 2- Divide and Conquer Recurrence Relation ------> Example-->
 * Binary Search
 * 
 * ___________________________________________________________________________
 * 
 * Whenever you have a function call which has a return type then make sure you
 * return it----> See in the Binary Search file
 */