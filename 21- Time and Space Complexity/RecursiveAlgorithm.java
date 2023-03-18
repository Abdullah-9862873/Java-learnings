/*
 * Point 1-------> At any particular point of time no two function calls at the
 * same level of recursion will be in the stack at the same time...
 * 
 * Point 2------> Only calls that are interlinked will be in the stack at the
 * same time
 * And this interlinking cannot be like-> If I take the case of tree of
 * fibonacci series in fib(n) = fib(n-1) + fib(n-2) then the tree that is made
 * will be the following
 * --------------------------------------------fib(4)
 * ------------------------------------------/----------\
 * --------------------------------------fib(3)---------fib(2)
 * -------------------------------------/------\--------/----\
 * --------------------------------fib(2)-----fib(1)--fib(1)--fib(0)
 * --------------------------------/-----\
 * -----------------------------fib(1)---fib(0)
 * 
 * In the above tree the interlinked will be the ones that are executed in the
 * ascending order so like first the execution of the root is done then the left
 * side then the right side so this is the flow so at the third level..... The
 * fib(2) and the fib(0) will not exist in the stack at the same time
 * 
 * Whereas in the most left side of the tree the functions fib(4),fib(3),fib(2)
 * and fib(1) will exist in the stack at the same time and they have a height of
 * 4 so the space complexity will be O(4) which is O(n)
 * 
 * Space complexity in this case is equal to the height of the recursive tree...
 * In case of fibonacci numbers, the function fib(4) was given and the height of
 * the tree with the value 4 will be 4 so the space complexity will be O(4)
 * which is------------> O(n)
 * 
 * __________________________________________________________________________________________________________
 * There are two types of recurrence relations:
 * --------------> Linear recurrence relation-------> Example(Linear Search)
 * --------------> Divide and Conquer recurrence relation-------> Example(Binary
 * Search)
 * 
 * __________________________________________________________________________________________________________
 * How to know that the recurrence relation belongs to linear or divide and
 * conquer????
 * 
 * We know it by looking at the form of the recurrence relation
 * __________________________________________________________________________________________________________
 * Form of Divide and Conquer:
 * 
 * T(N) = a1 T(b1(x) + Σ(x)) + a2 T(b2(x) + Σ(x)) + .... + ak T(bk(x) + Σ(x)) +
 * g(x)
 * 
 * ---------> Here the x >= x(not) -----------. Where the x not is basically
 * some constant
 * 
 * ----------> What this g(x) is representing is that when a particular
 * operation is over then what time is it taking to perform some operations on
 * it
 * Exmaple in case of binary search------------> T(N) = T(N/2) + O(1)
 * Here the function that is basically doing is dividing the array of size n in
 * half and then performing the comparison to see if it is greater, equal or
 * less which is taking the constant time
 * 
 * ----------> Exanple 2-----> Merge sort
 * The recurrence relation is -----> T(N) = T(N/2) + T(N/2) + O(N-1)
 * This is basically dividing the first half and the second half and then
 * sorting them and merging them
 * 
 * __________________________________________________________________________________________________________
 * There are three ways to solve this recurrence relation for the complexity
 * --------> Plug and Chug
 * --------> Masters Theorem
 * --------> Akra Bazzi Formula(1996)
 * __________________________________________________________________________________________________________
 * ##########################>>>>>>>>>>Akra-Bazzi
 * Formula<<<<<<<<<<<<<<<<<###############################
 * -------> T(x) = θ(x^p + x^p(∫[1,x] (g(u)/u^(p+1)))du)
 * 
 * What is the value of p??
 * -------> Σ[i=1 to k] a(base(i)) b(base(i))^p = 1
 * 
 * __________________________________________________________________________________________________________
 * What if you couldn't find the value of p???
 * 
 * Note the range of the p like in the following question
 * ------------> T(x) = 3T(x/3) + 4T(x/4) + x^2
 * 
 * Here if we put the value of p as 1 in the following
 * ------------> (3)(1/3)^1 + 4(1/4)^1 = 1
 * ------------> 1+1 = 1
 * ------------> 2!=1
 * 
 * So here one thing is clear that I need to increase the denominator value
 * because I have to make the 2 lesser so to increase the denominator value the
 * value of p should be greater so the conclusion is
 * -----------> p >1
 * Here if we put the value of p as 2 in the following
 * ------------> (3)(1/3)^2 + 4(1/4)^2 = 1
 * ------------> 3(1/9) + 4(1/16) = 1
 * ------------> 1/3 + 1/4 = 1
 * ------------> 7/12 < 1
 * 
 * So here one thing is clear that I need to increase the numerator fractions or
 * values because I have to make the 7/12 greater so to increase the values the
 * value of p should be lesser than 2
 * ------------> p<2
 * 
 * Here p lies in between 1 and 2
 * 
 * So I couldn't find the value of exact p right, so I need to check one
 * condition
 * <------CONDITION--------> If (value of p) < power of g(x) then the answer =
 * g(x)
 * 
 * So here the answer is O(g(x))
 * O(x^2)
 * 
 * No need to do integration
 * 
 * __________________________________________________________________________________________________________
 * Mathematical Derivation of the above condition statement------------>
 * 
 * T(x) = 3T(x/3) + 4T(x/4) + x^2
 * --------------> Using Akra-Bazzi Formula
 * --------------> θ(x^p + x^p ∫[1,x](g(u)/u^(p+1))du)
 * --------------> θ(x^p + x^p ∫[1,x](x^2)/x^(p+1)du)
 * --------------> θ(x^p + x^p ∫[1,x](x^(1-p))dx)
 * --------------> θ(x^p + x^2)
 * As we know that p is less than 2 which makes the x^p the less dominating term
 * so we ignore it
 * --------------> θ(x^2)
 * 
 * __________________________________________________________________________________________________________
 * ###########>>>>>>>Linear_Recurrence_Relation_Formula<<<<<<<<<<<<<<<<<########
 * 
 * >>>>Homogeneous Equation<<<<<
 * The linear recurrence relation equation where the g(x) is not present
 * 
 * Homogeneous Form-----> a1 f(x-1) + a2 f(x-2) + a3 f(x-3) + ... + an f(x-n)
 * ---------------> Σ[i-1 to n] ai f(x-i)
 * Here a(i) and n are fixed and the
 * n--------> order of reccurence
 * 
 * >>>>Non-Homogeneous Equation<<<<<
 * The linear recurrence relation equation where the g(x) is present
 * 
 * Non-Homogeneous Form----> a1 f(x-1) + a2 f(x-2) + a3 f(x-3) + ... + an f(x-n)
 * +
 * g(x)
 * 
 * Here a(i) and n are fixed and the
 * n--------> Order of recurrence
 * 
 * __________________________________________________________________________________________________________
 * Homogeneous Linear Recurrence Relation Example
 * For the fibonacci series:
 * 
 * fib(n) = fib(n-1) + fib(n-2)
 * 
 * Step1------> Put f(n) = α^n for some value of constant α(alpha)
 * 
 * ------------> α^n = α^(n-1) + α^(n-2)
 * ------------> α^n - α^(n-1) - α^(n-2) = 0
 * ------------> Dividing by α^(n-2) on both sides
 * ------------> α^2 - α - 1 = 0
 * ------------> Applying quadratic formula (-b +- sqrt((b^2 -4ac)))/2a
 * ------------> = (1 +- sqrt(5))/2
 * ------------> So I have two roots ((1 + sqrt(5))/2) and ((1 - sqrt(5))/2)
 * ------------> α1 = (1 + sqrt(5))/2 , α2 = (1 - sqrt(5))/2
 * 
 * Step2------> The number of roots you have, multiply each with a constant and
 * add them all, this will be equal to the same as the initial equation
 * 
 * ------------> f(n) = c1 (α1)^n + c2 (α2)^n -------------------(2)
 * ------------> This is equal to f(n) = f(n-1) + f(n-2)
 * 
 * Step3-------> This is a fact that the number of roots is equal to the number
 * of answers you will get at the end
 * 
 * Step4--------> Find the values of constants c
 * -------------> For the given values of:
 * -------------> Given that f(0) = 0
 * -------------> 0 = c1 (α1)^0 + c2 (α2)^0
 * -------------> 0 = c1 + c2
 * -------------> c1 = - c2 --------------------(3)
 * 
 * -------------> Given that f(1) = 1
 * -------------> 1 = c1 (α1)^1 + c2 (α2)^1
 * -------------> 1 = c1 ((1 + sqrt(5))/2) + c2 ((1 - sqrt(5))/2)
 * -------------> From (3)
 * -------------> 1 = c1 (1 + sqrt(5))/2) - c1 ((1 - sqrt(5))/2))
 * -------------> c1 = 1/sqrt(5)
 * -------------> From (3)
 * -------------> c2 = -1/sqrt(5)
 * 
 * -------------> Putting values of c1 and c2 in eq(2)
 * f(n) = (1/sqrt(5)) ((1 + sqrt(5))/2)^n + (-1/sqrt(5))((1 - sqrt(5))/2)^n
 * -------------> Taking 1/sqrt(5) common
 * 1/sqrt(5) [(1 + sqrt(5))/2)^n - ((1 - sqrt(5))/2)^n]
 * 
 * --------------> Here the second value ((1 - sqrt(5))/2)^n) is the less
 * dominating term as the value of sqrt(5) is 2.2 and 1-2.2 gives negative
 * number so the less dominating value will get ignored also the constant that
 * we took common will also get ignored so the time complexity will be
 * 
 * ---------------> O((1+sqrt(5))/2)^n)
 * 
 * __________________________________________________________________________________________________________
 * Homogeneous Linear Recurrence Relation Example
 * f(n) = 2f(n-1) + f(n-2)
 * 
 * Step1------> Putting f(n) = α^n
 * -----------> α^n = 2(α)^(n-1) + (α)^(n-2)
 * -----------> α^n - 2(α)^(n-1) - (α)^(n-2) = 0
 * -----------> Diving both sides with (α)^(n-2)
 * -----------> α^2 - 2α - 1 = 0
 * -----------> α = 1
 * 
 * Now here is the case that the answer here comes is one but in the initial
 * equation the number of answers expected were 2 as the α came 2 times in the
 * equation so in this case we take the following statement
 * -----------> If α is repeated r times then
 * (α^n),n(α^n),(n^2)α^(n),(n^3)α(n),.....,n^(r-1)α^n gives the same solution so
 * we take any of these as the second root
 * -----------> Taking 1 and n(α^n) as the two roots
 * 
 * Step2------> Multiplying with constant
 * -----------> f(n) = c1(α)^n + c2(n(α^n))^n
 * -----------> Putting the value of α
 * -----------> f(n) = c1 + c2n
 * 
 * Step4------> Finding the values of constant
 * -----------> Given that f(0)=0 and f(1)=1
 * -----------> f(0) = 0
 * -----------> c1 = 0
 * -----------> f(1) = 1 && c1=0 gives
 * -----------> c2 = 1
 * 
 * Step5-------> Putting in formula
 * ------------> f(n) = 0 + n
 * ------------> f(n) = n
 * 
 * So the time complexity will be O(n)
 * 
 * __________________________________________________________________________________________________________
 * Non homogeneous Linear Reccurence Equation Example
 * f(n) = 4f(n-1) + 3^n
 * 
 * Step1--------> Replace the g(x) with 0 and solve it like the homogeneous
 * equation
 * -------------> f(n) = 4f(n-1) + 0
 * -------------> f(n) = 4f(n-1)
 * 
 * -------------> Replacing f(n) with α^(n)
 * -------------> α^n = 4α^(n-1)
 * -------------> α^n - 4α^(n-1) = 0
 * -------------> α^(n-1)[α-4] = 0
 * -------------> α-4 = 0
 * -------------> α = 4
 * 
 * Step2--------> Multiplying it with the number of contants and giving it the
 * power n
 * -------------> f(n) = c(α)^n
 * -------------> Putting α = 4
 * -------------> f(n) = c(4)^n ------------(1)
 * This is my general solution
 * 
 * Step3--------> Find the particular solution
 * -------------> Guess the solution for the value of g(x)...MyGuess is c3^n
 * -------------> f(n) = c3^n -------------(2)
 * 
 * Step4---------> Find constant
 * --------------> Put the value of guess on one side of the original equation
 * --------------> From (2) in original equation
 * --------------> c3^n - 4c3^(n-1) = 3^n
 * 
 * --------------> taking c^3(n-1) as common
 * --------------> c^3(n-1)[3-4] = 3^n
 * -------------->c^3(n-1)(-1) = 3^n
 * --------------> -c = 3
 * --------------> c = -3
 * 
 * --------------> Putting it in (2)
 * --------------> f(n) = -3^(n+1) ------------(3)
 * 
 * Step5----------> Adding both solutions (1) and (3)
 * ---------------> f(n) = c(4)^n - 3^(n+1) -------------(4)
 * 
 * Step6----------> Find the constant
 * ---------------> Given that f(1) = 1
 * ---------------> 1 = c(4)^(1) - 3^(1+1)
 * ---------------> 1 = c4 - 3^(2)
 * ---------------> 1 = c4 - 9
 * ---------------> c4 = 10
 * ---------------> c = 5/2
 * 
 * Step7----------> Put in it sum of the solutions i-e (4)
 * ---------------> f(n) = (5/2)(2)^n - 3^(n+1)
 * 
 * __________________________________________________________________________________________________________
 * How do we guess a particular solution???
 * 
 * Step1------> If the g(x) is exponential, for example (2^n + 3^n)
 * -----------> Make the guess as (a2^n + b2^n)
 * 
 * Step2-------> If the g(x) is polynomial, for examaple (n^2 - 1)
 * ------------> Make a guess with the same degree like (an^2 + bn + c)
 * 
 * Example case-------> If you are given like (2^n + n)
 * -------------------> Note it has both exponential and polynomial so make the
 * guess as the following
 * -------------------> (a2n + bn + c)
 * 
 * Step3-------> If you guessed a2^n and it failed then increase the degree by
 * one and try again like make the new guess as the following
 * ------------> (an+b)2^n
 * ------------> If it still fails then keep increasing the degree and try again
 * like
 * ------------> (an^2 + bn + c)2^n
 * 
 * __________________________________________________________________________________________________________
 */
