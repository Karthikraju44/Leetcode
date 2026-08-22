class Solution {
    public boolean checkDivisibility(int n) {
        int ds=0;
        int dp=1;
        int temp=n;
        while(n>=1){
            ds+=n%10;
            dp*=n%10;
            n/=10;
        }
        int sum=ds+dp;
        if(temp%sum==0){
            return true;
        }
        return false;
        
        
    }
}