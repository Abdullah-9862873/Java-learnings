/*
 * Properties of Modulo
 * -------------------> (a + b) % m = ((a % m) + (b % m)) % m
 * -------------------> (a - b) % m = ((a % m) - (b % m) + m) % m
 * -------------------> (a * b) % m = ((a % m) * (b % m)) % m
 * -------------------> (a / b) % m = ((a % m) * (b(inverse) % m)) % m
 * -------------------> (a % m) % m = (a % m)
 * (m % m) = 0 ------> This is true for all x belonging to positiveintegers
 * 
 * 
 * 
 * b(inverse) % m-----------> Multiplicative modulo inverse (MMI)
 * 
 * 
 * co-primes------------> a is a co-prime of b if they have nothing else common
 * in their factors except 1
 * 
 * Example--------------> (6 * y) % 7 = 1
 * ---------------------> Here (y = 6) because ((6*6)%7 = 1)
 * ---------------------> y = Multiplicative modulo inverse for 6
 * 
 * ---------------------> MMI = b(inverse) % m
 * ---------------------> This means that b and m are co-primes
 * 
 * 
 * 
 * Extra Information-----------> If "p" is a prime number which is not a divisor
 * of "b" then (a*((b)^(p-1)) %p) = (a % p) due to Fermet's Little Theorem
 * 
 */