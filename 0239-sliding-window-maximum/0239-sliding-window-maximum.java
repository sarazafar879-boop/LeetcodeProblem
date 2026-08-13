class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /*
        int a[]=new int[nums.length-k+1];
        int z=0;
     
         for (int i = 0; i <= nums.length - k; i++) {

            int [] t = new int [k];

            
            for (int j = 0; j < k; j++) {
                t[j] = nums[i + j];
            }
            
            int max=Integer.MIN_VALUE;
            
        for(int x=0;x<k;x++)
        {
            if(t[x]>max)
            {
            
                max=t[x];
                
                
            }
            
        }
        a[z]=max;
        z++;
    
        
        
    }
    return a;
    */

    int[] ans = new int[nums.length - k + 1];
        int z = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

        
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

    
            dq.addLast(i);

            
            if (i >= k - 1) {
                ans[z] = nums[dq.peekFirst()];
                z++;
            }
        }

        return ans;
    }


}

        
    
