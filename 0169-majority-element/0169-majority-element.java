class Solution {
    public int majorityElement(int[] nums) {
        int mc=nums[0];
        int n=nums.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==mc){
                count++;
            }
            else{
                count--;
                if(count==0){
                    mc=nums[i];
                    count=1;
                }
            }
        }
        return mc;
    }
}