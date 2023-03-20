/*
 * Number systems is a system used to represent or express numbers...
 * Base means the number of digits or the combination of digits used by the
 * counting system to represent numbers...
 * 
 * Decimal number system is the number system with base 10...
 * Octal number system is the number system with base 8...
 * Binary number system is the number system with base 2...
 * Hexadecimal number system is the number system with base 16...
 * 
 * >>>>>>>>>>>>>>>>>>>>Bitwise_Mainpulation_Operators<<<<<<<<<<<<<<<<<<<<<<<<<
 * 
 * _________________________________________________________________________________________
 * 
 * Least Significant Bit-------------> The last digit is known as the least
 * significant bit
 * Most Significant Bit-------------> The First digit is known as the Most
 * significant bit
 * _________________________________________________________________________________________
 * 
 * And(&)---------> If both are true then true
 * 
 * -------------------------------> Observations of And:
 * -------------------------------> If you do And operartion of a number with
 * 1's then the answer is that number itself
 * -------------------------------> Example (1011001)&(1111111) = (1011001)
 * 
 * _________________________________________________________________________________________
 * 
 * Or(||)----------> If any is true then true
 * 
 * _________________________________________________________________________________________
 * 
 * XOR(^)(If and only if)---------> If and only if one is true then true
 * otherwise false
 * 
 * -------------------------------> Observations of XOR:
 * -------------------------------> a^1 = compliment of a
 * -------------------------------> a^0 = a
 * -------------------------------> a ^ a = 0
 * 
 * _________________________________________________________________________________________
 * 
 * Left Shift Operator (<<) -----------> Left shift operator shifts the binary
 * numbers to one place left
 * Example-----------------------------> (10)[base 10] Let this is given
 * ------------------------------------> 10 << 1
 * ------------------------------------> Step 1 is that it will convert it into
 * binary
 * ------------------------------------> (1010)[base 2]
 * ------------------------------------> Step 2 is that it will move each entity
 * to one place left and as after moving there will be a vacant space at the end
 * so it will add 0 over there so the answer will be
 * ------------------------------------> (10100)[base 2]
 * ------------------------------------> Which is equal to (20)[base 10]
 * 
 * -------------------------------> Observations of Left Shift Operator:
 * --------------------------------> a << 1 = 2a
 * --------------------------------> a << b = (a)(2^b)
 * _________________________________________________________________________________________
 * 
 * Right Shift Operator(>>) ------------> Right shift operator shift the binary
 * number to right
 * Example------------------------------> (10)[base 10] let this is given
 * -------------------------------------> 10 >> 1
 * -------------------------------------> Step 1 is that it will convert it into
 * binary
 * ------------------------------------> (1010)[base 2]
 * ------------------------------------> Step 2 is that it will move each entity
 * to one place right and this will ignore the most right entity
 * ------------------------------------> (101)[base 2]
 * ------------------------------------> Which is equal to (3)[base 10]
 * 
 * -------------------------------> Observations of Right Shift Operator:
 * -------------------------------> a >> b = a / 2^b
 * _________________________________________________________________________________________
 * 
 * Compliment(~)----------> Making the number opposite i-e converting 1 to 0 and
 * 0 to 1
 * 
 * _________________________________________________________________________________________
 * 
 * Decimal numbers ------> 0,1,2,3,4,5,6,7,8,9
 * ----------------------> They have base 10
 * ----------------------> (310)[Base 10] is written as 310
 * 
 * Binary numbers--------> 0,1
 * ----------------------> They have base 2
 * ----------------------> (7)[Base 10] is written as (111)[Base 2] in binary
 * 
 * Octal numbers---------> 0,1,2,3,4,5,6,7
 * ----------------------> They have base 8
 * ----------------------> (310)[Base 10] is written as (466)[Base 8]
 * 
 * Hexadecinal numbers-----> 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
 * ------------------------> They have base 16
 * ------------------------> (10)[Base 10] is written as (A)[Base 16]
 * 
 * _________________________________________________________________________________________
 * 
 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>__Conversions__<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 * Two types of conversions
 * 1-----------> Conversion from decimal to base b
 * 2-----------> Conversion from base b to decimal
 * 
 * 
 * Decimal to base b---------> Keep dividing the number with the b and take the
 * remainders, write the remainders in opposite
 * 
 * 
 * Base b to Decimal---------> Multiply and add the power of base with digits
 * example-------------------> (10001)[base 2] to decimal looks like
 * --------------------------> 1*2^4 + 0*2^3 + 0*2^2 + 0*2^1 + 1*2^0
 * --------------------------> 16 + 0 + 0 + 0 + 1 = (17)[base 10]
 * 
 * _________________________________________________________________________________________
 * 2's compliment------------------> It gives negative of a number
 * 
 * --------------------------------> Step 1------> Take 1's compliment
 * --------------------------------> Step 2------> Add 1 to the answer
 * 
 * _________________________________________________________________________________________
 * How is it giving negative of a number??
 * 
 * A negative of a number can be obtained by subtracting it from 0
 * Example------> Negative of 10 would be------------> 0 - 10
 * 
 * In 1 byte there are 8 bits and if I am storing (10)[base 10] in bits then it
 * would be like the following
 * -------------> 00001010
 * If I subtract it from 0 then I should get the negative 10
 * -------------> 00000000 - 00001010
 * 
 * Now a thing to notice over here is that if I add one more bit in place of
 * most significant bit in 0's then it would be neglected as only the first 8
 * bits will be counted so I can write the above as
 * -------------> 100000000 - 00001010
 * 
 * Now a thing to notice over here is (1000 = 111 + 1) in binary... Similarly
 * (100 = 11 + 1)
 * So the above statement can be written as
 * -------------> 11111111 + 1 - 00001010
 * 
 * If I rearrange the above equation then it would be
 * -------------> 11111111 - 00001010 + 1
 * 
 * Now look at (11111111 - 00001010) isn't this the compliment of the initial
 * number
 * (11111111 - 00001010 = 11110101)
 * 
 * And If I add 1 to it then it would become
 * --------------> 11110110
 * 
 * Which is basically the 2's compliment
 * 
 * _________________________________________________________________________________________
 * The most significant bit gives that the number is positive or negative
 * If 1-------------> Number is negative
 * If 0-------------> Number is positive
 * 
 * (Pehle positivity ayi phir negativity)
 * 
 * _________________________________________________________________________________________
 * Range formula for n bits
 * 
 * -----------------> -2^(n-1) to 2^(n-1) - 1
 */