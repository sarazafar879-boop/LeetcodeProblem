class Solution {
    void solve(String s, int open, int close, int n, List<String> ans) {
        if (open == 0 && close == 0) {
            ans.add(s);
            return;
        }
        if (open>0) {
            solve(s + "(", open -1, close, n, ans);
        }

        if (close >open) {
            solve(s + ")", open, close-1, n, ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("", n, n, n, ans);
        return ans;
    }
        
    
}