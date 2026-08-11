class Solution {
    public boolean isAnagram(String s, String t) {
    
    char ch[]=s.toCharArray();
    Arrays.sort(ch);
    char chr[]=t.toCharArray();
    Arrays.sort(chr);
   /* HashSet<String> h1=new HashSet<String>();
    for(String st=ch)
    {
        h1.add(st);
    }
    HashSet<String> h2=new HashSet<String>();
    for(String str=chr)
    {
        h2.add(st);
        
    }*/
    String snew=new String(ch);
    String snews=new  String(chr);
    if (snew.equals(snews))
    {
        return true;
    }
    else
    {
        return false;
    }

    }
}