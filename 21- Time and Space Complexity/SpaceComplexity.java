/*
 * Space Complexity is basically ------> Input Space + Auxilary Space
 * 
 * Auxilary Space--------> It is the extra space or temporary space used by the
 * algorithm
 * 
 * _________________________________________________________________________________________________________
 * Example-------->
 * for(int i=1; i<=n){
 * for(int j=1; j<=k; j++){
 * // Some operation that is taking t time
 * }
 * i=i+k;
 * }
 * 
 * 
 * The time complexity of the above operaion is--------> O(time that inner loop
 * is taking * time that outer loop is taking)
 * ----------------------------------------------------> O(kt * time that outer
 * loop is taking)
 * 
 * Outer loop time------------> 1 + 1+2k + 1+3k + 1+4k +... + 1+xk
 * Overall condition should satisfy---------> 1+xk <= n
 * -----------------------------------------> xk <= n-1
 * -----------------------------------------> x = (n-1)/k
 * 
 * -------------------------------------------------------> O(kt * (n-1)/k)
 * -------------------------------------------------------> O(t * (n-1))
 * Constants are ignored----------------------------------> O(t * n)
 * 
 * _________________________________________________________________________________________________________
 */