package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        if (numberToSkip<lastInRow){
            if(lastInRow>0){
                for (int i = 1; i < lastInRow; i++){
                    if (i == numberToSkip){
                        continue;
                    }
                    sum += i;
                }
                System.out.println("skipped sum is "+sum);
            }else{
                System.out.println("last number in row is negative");
            }
        }else{
            System.out.println("number to skip is bugger then the last");
        }
    }
}
