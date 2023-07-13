package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
    int y = 0;
for(int max = 1;max<=first;max++) {
if((first%max == 0) && (second%max == 0)) {
     y = max;
    }
}
System.out.print(y);
    }
}
