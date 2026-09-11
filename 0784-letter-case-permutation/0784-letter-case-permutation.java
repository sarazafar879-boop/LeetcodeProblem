
class Solution {

    void solve(String str, int i, String op, ArrayList<String> ans) {
        if (i == str.length()) {
            ans.add(op);
            return;
        }

        char ch = str.charAt(i);
        if (Character.isLetter(ch)) {
            solve(str, i + 1, op + Character.toLowerCase(ch), ans);
            solve(str, i + 1, op + Character.toUpperCase(ch), ans);

        } 
        else{
            solve(str, i + 1, op + ch, ans);
        }
    }

    public List<String> letterCasePermutation(String s) {
        ArrayList<String> ans = new ArrayList<>();

        solve(s, 0, "", ans);

        return ans;
    }
}