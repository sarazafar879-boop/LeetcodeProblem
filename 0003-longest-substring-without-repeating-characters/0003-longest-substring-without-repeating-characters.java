class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int p = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(p));
                p++;
            }

            set.add(s.charAt(i));

            max = Math.max(max, i- p + 1);
        }

        return max;
        
    }
}