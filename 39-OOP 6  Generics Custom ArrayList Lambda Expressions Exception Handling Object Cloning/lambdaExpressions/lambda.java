package lambdaExpressions;
import java.util.ArrayList;

public class lambda {
    public static void main(String[] args) {
        //_______________________________________________________FROM
        // ArrayList<Integer> list = new ArrayList<>();

        // for(int i=1; i<=5; i++){
        //     list.add(i);
        // }

        // list.forEach((item) -> System.out.println(item*2));
        //_______________________________________________________TO
        //_______________________________________________________FROM
            Operation sum = ((a, b) -> a+b);
            Operation subtract = ((a, b) -> a-b);
            Operation product = ((a, b) -> a*b);

            lambda func = new lambda();
            System.out.println(func.operate(3, 5, sum));
            System.out.println(func.operate(3, 5, product));
            System.out.println(func.operate(3, 5, subtract));
        //_______________________________________________________TO
    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a, int b);
}


/*
______________________________________________________________________________
----> lambda expression is basically a one line expression in which you can specify what you have specified in the more than one line of code... So basically shortening the code to one line expression is the work and that final expression will be called as lambda expression...
______________________________________________________________________________


 */