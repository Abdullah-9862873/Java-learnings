public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        System.out.println(builder);
        System.out.println("The datatype of builder is: " + builder.getClass().getName());
        System.out.println(builder.toString());
        System.out.println("The datatype of builder is: " + builder.getClass().getName());

        builder.reverse();
        System.out.println(builder.toString());
    }
}
