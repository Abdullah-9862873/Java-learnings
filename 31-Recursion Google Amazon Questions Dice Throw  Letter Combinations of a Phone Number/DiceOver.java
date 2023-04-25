public class DiceOver {
    public static void main(String[] args) {
        findDiceCombinations("", 4);
    }

    static void findDiceCombinations(String processed, int unProcessed){
        if(unProcessed==0){
            System.out.println(processed);
            return;
        }
        
        for(int i=1; i<=6 && i<=unProcessed; i++){
            findDiceCombinations(processed+i, unProcessed-i);
        }
        return;
    }
}
