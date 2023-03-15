/*
 * String is basically a collection of characters...
 * 
 * There are two concepts in the string
 * 1-----------------> String pool
 * 2-----------------> Immutability
 * 
 * String pool---------------> It is basically a memory structure where the
 * values of strings are stored... So when
 * --------------------------> a = "Abdullah"
 * --------------------------> So it is stored like the reference variable is
 * stored in stack and the object is stored in the heap inside the pool....
 * --------------------------> So if you write b="Abdullah" then it will check
 * if the pool has that object or not... If it has then both the a and b will
 * point to that pool object
 * 
 * 
 * Immutablity--------------> If you change through one of the reference
 * varaible then it will not get reflected in the original. This is because the
 * strings are immutable
 * ___________________________________________________________________________________
 * String pool is made for the optimization pupose and the immutability is made
 * for the security reasons
 * 
 * *
 * ___________________________________________________________________________________
 * Why we can't modify String objects??
 * 
 * If person1, person2, person3, and person 4 have the same name "Abdullah" then
 * if person1 decided to change its name then the name of all the other persons
 * will be changed if the strings are mutable... That is why they are immutable
 * 
 * ___________________________________________________________________________________
 * Comparison of Strings------------->
 * There are two ways to compare-----------> Lets say if "a" and "b" are two
 * different objects then
 * ---------------------> (a->"Abdullah") and (b->"Abdullah") then if you do
 * sout(a==b) then it will give "false"
 * ---------------------> (a->"Abdullah" <-b) then if you do sout(a==b) then it
 * will give true
 * 
 * == checks if the reference variables are pointing to the same object
 * 
 * 
 * *
 * ___________________________________________________________________________________
 * How to create different objects for same value??
 * 
 * String a = new String("Abdullah");
 * String b = new String("Abdullah");
 * 
 * System.out.println(a == b);
 * 
 * String c = "Abdullah";
 * String d = "Abdullah";
 * 
 * System.out.println(c == d);
 * 
 * // This is the representation that the reference variables point to the same
 * object present in the pool by default
 * 
 * _______________________________________________________________________________
 * 
 * // If I only want to check the values
 * 
 * System.out.println(a.equals(b));
 * 
 * ___________________________________________________________________________________
 * Wrapper class means that if you want to use all the object oriented
 * programming principals with the integer then you have to use the wrapper
 * class...
 * Like:
 * ---------------->
 * int num = 42;
 * Integer integer = Integer.valueOf(num);
 * 
 */