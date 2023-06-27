import java.util.Arrays;

public class Question5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int option2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(option1, option2);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        Question5 solution = new Question5();
        int maxProduct = solution.maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }
}
