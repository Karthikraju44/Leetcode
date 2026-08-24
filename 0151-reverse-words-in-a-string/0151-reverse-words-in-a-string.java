class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ')
                i--;
            if (i < 0)
                break;
            int end = i;
            while (i >= 0 && s.charAt(i) != ' ')
                i--;

            int start = i + 1;
            for (int j = start; j <= end; j++) {
                ans += s.charAt(j);
            }
            while (i >= 0 && s.charAt(i) == ' ')
                i--;

            if (i >= 0)
                ans += " ";
        }
        return ans;
    }
}