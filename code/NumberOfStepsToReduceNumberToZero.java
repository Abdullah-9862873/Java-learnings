public class NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int n = 14;
        int ans = countSteps(n, 0);
        System.out.println(ans);
    }

    static int countSteps(int n, int steps){
        if(n == 0){
            return steps;
        }

        if((n & 1) == 0){
            // It is even
            return countSteps(n/2, steps+1);
        }
        return countSteps(n-1, steps+1);
    }
}
