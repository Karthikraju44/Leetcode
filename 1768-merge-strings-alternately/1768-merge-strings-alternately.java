class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int l=Math.max(n,m);
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(l>0){
            if(i<n){
                sb.append(word1.charAt(i));
            }
            if(j<m){
                sb.append(word2.charAt(j));
            }
            l--;
            i++;
            j++;
        }
        String str = sb.toString();
        return str;
        
    }
}