class Solution {
    boolean isvowel(char ch)
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                return true;

            }
            else
            {
                return false;
            }
        }
    public int maxVowels(String s, int k) {
        char []str=s.toCharArray();
        int c=0;
        int max=0;
       


   
    for(int i=0;i<k;i++)
    {
        if(isvowel(str[i]))
        {
            c++;
        }
    }
    max=c;
    for(int i=k;i<str.length;i++)
    {
        if(isvowel(str[i-k]))
        {
            c--;
        }
        if(isvowel(str[i]))
        {
            c++;
        }
        max=Math.max(max,c);
    }
    return max;
}
}