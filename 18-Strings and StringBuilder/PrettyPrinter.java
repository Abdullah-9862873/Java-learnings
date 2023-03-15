public class PrettyPrinter {
    public static void main(String[] args) {
        float a = 453.1284f;
        System.out.println(a);
        System.out.printf("Formatted String is: %.2f", a);
        System.out.println();

        System.out.println(Math.PI);
        System.out.printf("%.4f", Math.PI);
        System.out.println();

        System.out.printf("Hello my name is %s and I am %s", "Abdullah", "not cool");

    }
}

/*
 * This is used to make the long float value to get rounded off and give you the
 * value upto a ceratin amount of digits
 * 
 * There are many format specifiers we can use. Here are some common ones:
 * 
 * %c - Character
 * %d - Decimal number (base 10)
 * %e - Exponential floating-point number
 * %f - Floating-point number
 * %i - Integer (base 10)
 * %o - Octal number (base 8)
 * %s - String
 * %u - Unsigned decimal (integer) number
 * %x - Hexadecimal number (base 16)
 * %t - Date/time
 * %n - Newline
 */
