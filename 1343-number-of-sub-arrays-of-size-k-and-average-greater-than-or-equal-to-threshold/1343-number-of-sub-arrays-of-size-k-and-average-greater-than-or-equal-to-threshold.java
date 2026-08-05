class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        
        int c=0;
     double sum=0;
    double maxavg=0;
    double avg=0;
    for(int i=0;i<k;i++)
    {
        sum+=nums[i];
        avg=sum/k;
    }
    if(avg>=threshold)
       {
        c++;
       }
    

    for(int i=k;i<nums.length;i++)
    {
        sum+=nums[i]-nums[i-k];
        avg=sum/k;

       if(avg>=threshold)
       {
        c++;
       }
    }
    return c;
        

        
    }
}