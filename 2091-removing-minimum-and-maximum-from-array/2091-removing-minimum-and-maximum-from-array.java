class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n<=2)
        {
            return n;
        }
        int minindx=0; int maxindx=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<nums[minindx])
            {
                minindx=i;
            }
            if(nums[i]>nums[maxindx])
            {
                maxindx=i;
            }
        }
        int l=Math.min(minindx,maxindx);
        int r=Math.max(minindx,maxindx);
         int f = r + 1;
        int b= n - l;
        int both = (l+ 1) + (n - r);

        return Math.min(f, Math.min(b, both));
        
    }
}