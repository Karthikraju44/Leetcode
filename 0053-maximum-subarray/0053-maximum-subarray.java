class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxsf=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<n;i++){
            if(currentsum<0) currentsum=0;
            currentsum+=nums[i];
            if(currentsum>maxsf){
                maxsf=currentsum;
            }
        
            
        }
        return maxsf;

    }
}