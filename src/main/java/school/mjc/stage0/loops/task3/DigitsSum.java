package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int sum = 0;
        char nums[] = new char[Integer.toString(number).length()];
        for (int i = 0; i < Integer.toString(number).length(); i++)
        {
            nums[i] = Integer.toString(number).charAt(i);
            sum = sum + (nums[i] - '0');
        }
        System.out.println(sum);
    }
}
