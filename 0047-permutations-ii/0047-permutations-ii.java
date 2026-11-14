
import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        backtrack(nums, new ArrayList<>(), used, ans);

        return ans;
    }

    void backtrack(int[] nums, List<Integer> temp,
                   boolean[] used, List<List<Integer>> ans) {

        // Base case
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Already used element
            if (used[i]) {
                continue;
            }

            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]
                    && !used[i - 1]) {
                continue;
            }

            // Choose
            temp.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, temp, used, ans);

            // Backtrack
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
