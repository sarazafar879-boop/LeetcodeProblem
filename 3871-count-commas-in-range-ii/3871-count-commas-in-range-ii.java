class Solution {
       public long countCommas(long n) {
        long anss = 0;
        long threshold = 1000;

        while (threshold <= n) {
            anss += n - threshold +1;;

            if (threshold > n / 1000)
                break;

            threshold *= 1000;
        }

        return anss;
    }
}
        
        
    
