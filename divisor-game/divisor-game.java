class Solution {
    public boolean divisorGame(int n) {
        
        return d(n,true,new int[n+1]);
        
    }
    
    public boolean d(int n,boolean alice,int[] dp){
        if(n==1) return !alice;
        
        if(dp[n]==2 ) return true;
        if(dp[n]==1) return false;  
        
        boolean res = false;
        
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                res = res || d(n-i,!alice,dp);
            }
        }
        
        dp[n] = res ? 2 : 1;
        return alice && res;
    }
}