/*

Pattern1
*
**
***
***

Pattern 2
****
***
**
*

*/

public class Pattern1{
    public static void main(String[] args) {
        int n = 4;
        printPattern2(n, 0);
    }

    static void printPattern1(int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){
            printPattern1(r, c+1);
            System.out.print("*" + " ");
        }else{
            printPattern1(r-1, 0);
            if(r!=1){
                System.out.println();
            }
        }
    }

    static void printPattern2(int r, int c){
        if(r==0){
            return;
        }

        if(c < r){
            System.out.print("*" + " ");
            printPattern2(r, c+1);
        }else{
            System.out.println();
            printPattern2(r-1, 0);
        }
    }
}
