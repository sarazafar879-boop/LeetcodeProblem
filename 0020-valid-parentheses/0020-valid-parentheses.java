class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();
       char[] chrAry= s.toCharArray();
        for (char ch:chrAry)
        {
            if(ch=='('||ch=='['||ch=='{')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                int top=st.pop();
                if(ch==')'&& top!='('||ch=='}'&& top!='{'||ch==']'&& top!='[')
                {
                    return false;
                }

            }
        }
        return st.isEmpty();

    }
}