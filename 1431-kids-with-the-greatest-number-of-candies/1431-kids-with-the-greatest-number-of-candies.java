class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        int n=candies.length;
        ArrayList<Boolean> list=new ArrayList<>(Collections.nCopies(n, false));
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                list.set(i,true);
            }
        }
        return list;
    }
}