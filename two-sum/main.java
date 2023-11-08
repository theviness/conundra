import java.util.HashMap;

class Elixir {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visitedNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int cur = target - nums[i];
            if (visitedNums.containsKey(cur)) {
                return new int[] { visitedNums.get(cur), i };
            } else {
                visitedNums.put(nums[i], i);
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
    }
}