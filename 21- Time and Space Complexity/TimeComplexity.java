/*
 * What is time complexity??
 * -------> Time complexity is not equal to the time taken
 * 
 * -------> Time complexity is basically a function that gives us relationship
 * about how the time will grow as the input grows
 * 
 * ___________________________________________________________________________
 * Why this relationship is important??
 * 
 * -----> If we take the (size of array) as X-axis and (Time taken) as the
 * Y-axis then for the fixed size of array, the time taken for the O(log(n))
 * would be less than the time taken for the O(n)...
 * 
 * -----> For the fixed size of array, the constant time complexity will be a
 * straight line parallel to the X-axis... Whereas the linear time complexity
 * and log(n) time complexity have their curves tooo... Then for the fixed size
 * of array
 * 
 * O(1) < O(log(n)) < O(n)
 * 
 * Constant takes the less time than log(n) which takes the less time then O(n)
 * 
 * ___________________________________________________________________________
 * What do we need to consider when thinking about the complexity??
 * 
 * -----> 1- Always look for worst case time complexity... Let's say you have a
 * website now what should you worry about, 10 people using your website or 2
 * million people using your website... Of course 2 million which is a worst
 * case
 * 
 * ------> 2- Always look for complexity of large data...
 * The above relation is true for only after a particular amount of time because
 * when the code has just started executing then the constant is taking the most
 * time and the log(n) will be taking time and then there comes the linear time
 * complexity and even though they fluctuates in the overall execution but after
 * a certain point this relation is true indefinately...
 * 
 * Relation is basically in linear search is y=kx, Where x is the size of array
 * and k is the constant which is defining the slope of the graph...... But as
 * the relationship is linear the overall time complexity will be O(n)...
 * 
 * Even though the value of actual time is different the graph is growing
 * linearly...
 * _______________________Why_Constants_Are_Removed?_________________________
 * 
 * -------> 3- We don't care about the actual time because that will vary from
 * machine to machine... We only care about the relationship of how the time is
 * increasing as the input grows... This is why the constant are ignored because
 * the only thing we care about is the relationship of growing line not the
 * actaul values
 * 
 * -------> Always ignore less dominant terms...
 * This is because lets say we have a case where the time complexity is
 * 
 * O(N^3 + log(N)) ...... Where the N is 1 million then it will be
 * O((1000000)^3sec + log(1000000)sec) ---------> O((1000000)^3sec + 6sec)
 * 
 * Does this 6 sec has any significance as compared to the 1million three
 * times... The answer is no so we don't care about the less dominating terms
 * and we ignore them... Derived from point no 2
 * 
 * 
 * _______________________________________________________________________________
 * Following is the relationship
 * 
 * O(1) < O(log(n)) < O(n) < O(2^N)
 * 
 * The O(2^N) is the exponential time complexity which is the worse time
 * complexity of all of them... If I plot a graph for the fixed size of array
 * then the smallest will be the constant one, then there will be the log(n)
 * then there will be the linear one and at the very top of all of them there
 * will be exponential time complexity which we have seen in the case of the
 * fibonacci numbers recurrence relation fib(n) = fib(n-1) + fib(n-2)... If we
 * run it for even n=50 then it will take a lot time... Even though the input is
 * so small... The time compelxity of this fib recurrence relation is (Golden
 * Ration)^n---------> ((sqrt(5)+1)/2)^n
 * 
 * 
 * 
 * ________________________________________________________________________________
 * Big O Notation
 * ---------> If I wrtie O(n^3) then it means that it is the (UPPER BOUND)...
 * Which means that the time complexity cannot exceed this... The algorithm may
 * be solved in N^2 or log(n) but it cannot exceed the O(n^3) time complexity...
 * This is what the big O notation represents i-e upper bound...
 * 
 * If the time complexity of algorithm is-------> f(n) = O(g(n))
 * The it means that:
 * ----------------------------> limit(n->infinity) (f(n)/g(n)) < infinity
 * 
 * ________________________________________________________________________________
 * Big Omega Notation
 * ----------> It is basically (LOWER BOUND)... If the time complexity is Ω(N^3)
 * then it means that the time complexity will atleast be N^3 but it can exceed
 * too but it will never be less than N^3....
 * ----------> We actually care about the worst case so we care about the Big O
 * notation more than the Big Omega
 * 
 * limit(N->infinity) f(n)/g(n) > zero
 * 
 * ________________________________________________________________________________
 * Theta Notation
 * 
 * What if the lower and upper bound are both N^2???
 * -----------> This can be represented as O(N^2) & Ω(N^2)
 * ----------- As this is very repetetive so we can write like in the Theta
 * notation Θ(N^2) -----> Both upper and lower bounds are N^2
 * 
 * -----------> It means-----> zero < limit(N->Infinity) f(n)/g(n) < infinity
 * 
 * ________________________________________________________________________________
 * Little O notation
 * 
 * ------> It is also upper bound but it is loose upper bound
 * 
 * In the Big O notation---------> The growth of (f) is slower than or equal to
 * (g)
 * ------------------------------> f <= O(g)
 * In the Little O notation------> The growth of (f) is strictly slower than (g)
 * ------------------------------> f < O(g)
 * 
 * Mathematically-------------> Limit(n->Infinity) f(n)/g(n) = 0
 * 
 * For Example, if f(n) is N^3 and g(n) is N^2 then
 * ---------------------------> Limit(N->Infinity) N^2/N^3
 * ---------------------------> Limit(N->Infinity) 1/N^3
 * ---------------------------> 1/Infinity = 0
 * 
 * ________________________________________________________________________________
 * Little Omega Notation
 * 
 * -------> It is also lower bound but it is loose lower bound
 * 
 * In the Big Omega notation----------> The growth of (f) is greater than or
 * equal to (g)
 * -----------------------------------> f >= Ω(g)
 * In the Little Omeaga Notation-------> The growth of (f) is strictly greater
 * than (g)
 * -------------------------------------> f > Ω(g)
 * 
 * Mathematically-------------> Limit(n->Infinity) f(N)/g(n) = Infinity
 * 
 * For Example, if f(n) is N^3 and g(n) is N^2 then
 * ----------------------------> Limit(N->Infinity) N^3/N^2
 * ----------------------------> Limit(N->Infinity) N/1
 * ----------------------------> Limit(N->Infinity) N
 * ----------------------------> = Infinity
 * 
 */
