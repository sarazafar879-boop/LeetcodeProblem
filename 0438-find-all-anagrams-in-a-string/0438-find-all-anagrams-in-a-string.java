class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        /*ArrayList<Integer> l=new ArrayList<>();

        char [] str=s.toLowerCase().toCharArray();
         char [] ptr=p.toLowerCase().toCharArray();
         Arrays.sort(ptr);
         char[] t=new char[p.length()];
         int k=p.length();
         for(int i=0;i<p.length();i++)
         {
            t[i]=str[i];

         }
         
         Arrays.sort(t);
         if(Arrays.equals(ptr,t))
         {
            l.add(0);

         }
         int j=3;
         int c=0;
         for(int i=k;i<s.length();i++)
         {
            if(c!=3)
            {
            t[i-k]=str[j-k+1];
            c++;
            j++;
            }
            else
            {
                c=0;
                 i=0;
                j--;
                 Arrays.sort(t);
                if(Arrays.equals(ptr,t))
                     { 
                      l.add((j-k+1)-2);

                     }
                     j++;

            }

            
         }
         return l;  */

        


        ArrayList<Integer> l = new ArrayList<>();

        char[] str = s.toLowerCase().toCharArray();
        char[] ptr = p.toLowerCase().toCharArray();

        // Sort pattern
        Arrays.sort(ptr);

        int k = p.length();

        // Check every window of size k
        for (int i = 0; i <= s.length() - k; i++) {

            char[] t = new char[k];

            // Copy current window
            for (int j = 0; j < k; j++) {
                t[j] = str[i + j];
            }

            // Sort current window
            Arrays.sort(t);

            // Compare with sorted pattern
            if (Arrays.equals(ptr, t)) {
                l.add(i);
            }
        }

        return l;
    }
}


    
