public class Strings {
    public static void main(String[] args) {
        String a = new String("Abdullah");
        String b = new String("Abdullah");

        System.out.println(a == b);

        String c = "Abdullah";
        String d = "Abdullah";

        System.out.println(c == d);

        // This is the representation that the reference variables point to the same
        // object present in the pool by default

        // If I only want to check the values

        System.out.println(a.equals(b));

        int num = 42;
        Integer integer = Integer.valueOf(num);

    }

}
