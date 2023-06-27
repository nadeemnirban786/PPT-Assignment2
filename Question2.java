import java.util.HashSet;

public class Question2 {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int maxCandies = n / 2;
        HashSet<Integer> candySet = new HashSet<>();

        for (int candy : candyType) {
            candySet.add(candy);
        }

        return Math.min(maxCandies, candySet.size());
    }

    public static void main(String[] args) {
        int[] candyType = { 1, 1, 2, 2, 3, 3 };
        Question2 solution = new Question2();
        int maxNumTypes = solution.distributeCandies(candyType);
        System.out.println("Maximum number of different types of candies: " + maxNumTypes);
    }
}
