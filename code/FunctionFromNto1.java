
public class FunctionFromNto1{
    public static void main(String[] args){
        int n = 5;
        recBoth(n);
    }

    static void recursiveFunction(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursiveFunction(n-1);
    }

    static void recBoth(int n){
        if(n==0){
            return;   
        }

        System.out.println(n);
        recBoth(n-1);
        System.out.println(n);
    }
}