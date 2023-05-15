import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        createTree();
    }

    public static Node createTree(){
        Node root = null;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter data: ");
        int data = input.nextInt();

        if(data == -1){
            return null;
        }

        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    public static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data = data;
        }
    }
}
