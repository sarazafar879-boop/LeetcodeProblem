class Solution {
    
    int max(int ar[],int cmax)
    {
        int mx=0;
        for(int i=0;i<=cmax;i++)
        {
            if(ar[i]>mx)
            {
                mx=ar[i];
            }
        }
        return mx;

    }
    int min(int ar[],int cmin)
    {
        
        int mn=ar[ar.length-1];
         for(int i=ar.length-1;i>=cmin;i--)
        {
            if(ar[i]<mn)
            {
                mn=ar[i];
            }
        }
        return mn;


    }
    public int firstStableIndex(int[] nums, int k) {
        int gr8=0;
        int sml=0;
        int cmax=0;
        int cmin=0;
        for(int x=0;x<nums.length;x++)
        {
            gr8=max(nums,cmax);
            sml=min(nums,cmin);
            cmin++;
            cmax++;
            if(gr8-sml<=k)
            {
                return x;
            }
            
        }
        return -1;
        
        
    }
}