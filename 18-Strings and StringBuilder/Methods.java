import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Abdullah Sultan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("S"));
        System.out.println(name.charAt(9));
        System.out.println(name.trim());
        // Strip is used to remove the whitespaces for non asciii values but the trim is
        // used to remove the whitespaces for <=32 ASCII values

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
