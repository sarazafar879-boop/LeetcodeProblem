
class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        solve(nums, 0, result);

        return result;
    }

    public void solve(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }

            result.add(list);
            return;
        }

        for (int i = index; i < nums.length; i++) {

            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            solve(nums, index + 1, result);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}