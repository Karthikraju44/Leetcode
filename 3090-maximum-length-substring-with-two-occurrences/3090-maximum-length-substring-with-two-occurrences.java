class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int left = 0;
        int max = 0;
        for(int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'a';
            freq[idx]++;
            while(freq[idx] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}