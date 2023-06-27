import java.util.HashMap;

public class Question3 {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxLength = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(num + 1)) {
                int currentLength = frequencyMap.get(num) + frequencyMap.get(num + 1);
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
        Question3 solution = new Question3();
        int maxSubsequenceLength = solution.findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + maxSubsequenceLength);
    }
}
