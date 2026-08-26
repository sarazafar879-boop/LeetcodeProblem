class Solution {
    public int subarraySum(int[] nums, int k) {
       /* int c=0;
        int s=0;
    

         for(int i = 0; i < nums.length; i++) {
          s = 0;

         for(int j = i; j < nums.length; j++) {
         s = s + nums[j];

        if(s == k) {
            c++;
        }
    }
}

return c;*/
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int x : nums) {
            sum += x;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
        
    
