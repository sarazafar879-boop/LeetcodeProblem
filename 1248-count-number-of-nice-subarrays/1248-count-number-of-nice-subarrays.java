class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       /* int c=0; int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            c=0;
            for(int j=i;j<nums.length;j++)
            {
                
                if(nums[j]%2!=0)
                {
                    c++;
                }
                if(c==k)
                {
                    ans++;
                    
                
                }
            }

            
        }
        return ans;*/
         HashMap<Integer, Integer> map = new HashMap<>();
         map.put(0, 1);

         int oddsum = 0;
         int ans = 0;

         for (int n : nums) {
            if (n % 2 != 0) {
                oddsum++;
            }
            if (map.containsKey(oddsum - k)) {
                ans += map.get(oddsum - k);
            }

            map.put(oddsum, map.getOrDefault(oddsum, 0) + 1);
        }

        return ans;
        
    }
}