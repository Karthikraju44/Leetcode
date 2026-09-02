class Solution {
    public boolean uniformArray(int[] nums1) {

        boolean hasEven = false;
        boolean hasOdd = false;

        for(int i = 0; i < nums1.length; i++) {
            if(nums1[i] % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }
        if(hasEven && !hasOdd) {
            return true;
        }
        if(hasOdd && !hasEven) {
            return true;
        }
        if(hasEven && hasOdd) {
            return true;
        }

        return false;
    }
}