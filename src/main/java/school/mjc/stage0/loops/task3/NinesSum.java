package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
       int p = 9;
        int sum = 0;
        if (lengthOfLastNumber > 0) {
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                sum += p;
                p = (p * 10) + 9;
            }
        } else {
            System.out.println("Write new number");
        }
        System.out.print(sum);
    }
}
