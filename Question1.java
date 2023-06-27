import java.util.Arrays;

public class Question1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 2 };
        Question1 solution = new Question1();
        int maxSum = solution.arrayPairSum(nums);
        System.out.println("Maximum possible sum: " + maxSum);
    }
}
