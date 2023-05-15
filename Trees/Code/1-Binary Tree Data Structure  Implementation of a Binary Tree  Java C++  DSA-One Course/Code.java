import java.util.Scanner;

public class Code {

    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("InOrder traversal is: ");
        InOrderTraversal(root);
        System.out.println();

        System.out.println("PreOrder traversal is: ");
        PreOrderTraversal(root);
        System.out.println();

        System.out.println("PostOrder traversal is: ");
        PostOrderTraversal(root);
        System.out.println();
    }

    public static void InOrderTraversal(Node root){
        // Left Node Right

        if(root == null){
            return;
        }

        InOrderTraversal(root.left);
        System.out.print(root.data + " ");
        InOrderTraversal(root.right);
    }

    public static void PreOrderTraversal(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    public static void PostOrderTraversal(Node root){
        if(root == null){
            return;
        }

        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static Node createTree(){
        Node root = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        root = new Node(data);
        System.out.println("Enter left node for " + data);
        root.left = createTree();

        System.out.println("Enter right node for " + data);
        root.right = createTree();

        return root;
    }

    static class Node{
        Node left;
        Node right;

        int data;

        public Node(int data){
            this.data = data;
        }
    }
}

/*
InOrder traversal is:
6 1 2 9 7 10
PreOrder traversal is:
2 1 6 7 9 10
PostOrder traversal is:
6 1 9 10 7 2
 */