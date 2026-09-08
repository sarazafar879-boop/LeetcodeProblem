class Solution {
    public int countCommas(int n) {
        
        if(Math.abs(n)<=999)
        {
            return 0;
        }
        else
        {
            return ( n-1000)+1;
        }
    }
}