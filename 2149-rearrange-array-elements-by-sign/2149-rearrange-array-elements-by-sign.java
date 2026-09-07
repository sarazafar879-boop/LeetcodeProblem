class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n[]=new int[nums.length/2];
        int p[]=new int[nums.length/2];
        int e=0,o=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                p[o]=nums[i];
                o++;

            }
            else
            {
                n[e]=nums[i];
                e++;
            }
            
        }
        int j=0,k=0;
        for(int x=0;x<nums.length;x++)
        {
            if(x%2==0)
            {
            nums[x]=p[j];
            j++;
            }
            else
            {
                nums[x]=n[k];
                k++;
            }

        }
        return nums;
        
    }
}