import java.util.Arrays;

public class Question8 {
    public int minDifference(int[] nums, int k) {
        if (nums.length <= 4) {
            return 0;
        }

        Arrays.sort(nums);

        int minScore = nums[nums.length - 1] - nums[0];

        for (int i = 0; i <= k; i++) {
            minScore = Math.min(minScore, nums[nums.length - 1 - i] - nums[i]);
        }

        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = { 1 };
        int k = 0;
        Question8 solution = new Question8();
        int minScore = solution.minDifference(nums, k);
        System.out.println("Minimum score: " + minScore);
    }
}
