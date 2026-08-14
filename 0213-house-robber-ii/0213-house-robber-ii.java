class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int case1=solve(nums,0,dp1,n-2);
        int case2=solve(nums,1,dp2,n-1);
        return Math.max(case1,case2);
    }
    public int solve(int[] nums,int i,int[] dp,int end){
        if(i > end) return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int take = nums[i] + solve(nums, i + 2,dp,end);
        int skip = solve(nums, i + 1,dp,end);
        dp[i]=Math.max(take,skip);
        return dp[i];
    }
}