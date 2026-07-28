class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        int f=0;
        int res=0;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(nums[m]==target)
            {
                f=1;
                res=m;
                break;

            }
            else if(nums[m]>target)
            {
                e=m-1;
                

            }
            else
            {
                s=m+1;
            }
        }
        if(f==1)
        {
            return res;
        }
        else
        {
            return -1;
        }
        
    }
}