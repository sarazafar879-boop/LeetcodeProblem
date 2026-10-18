class Solution {
    public int majorityElement(int[] nums) {
        /* for only 2 types of numbers present in an array
        int fc=1; // count no. of first no. i.e 3
        int sc=0; // count no. of another  no. i.e 2
        int scnd=0; // to store another 2nd no. i.e 2
        // first no. we will get from nums[0]
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[0]==nums[i])
            {
                fc++;
            }
            else
            {
                scnd=nums[i];
            }
           
        }
        sc=n-fc;
        if(fc>sc)
        {
           return nums[0];
        }
        else
        {
            return scnd;
        }
        
        int arr[]=new int [500000];
        for(int i=0;i<500000;i++)
        {
            arr[i]=0;
        }
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++)
        {
            x=Math.abs(nums[i]);
            arr[x]++;
        }
        int max=0;
        int ele=0;
        for(int i=0;i<500000;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                ele=i;
            }

        }
        return ele;
       
        
    }
}*/
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
