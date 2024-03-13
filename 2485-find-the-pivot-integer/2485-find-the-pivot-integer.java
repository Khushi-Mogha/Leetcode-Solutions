class Solution {
    public int pivotInteger(int n) {
        long tot=(n*(n+1))/2;
        int i;
        for(i=1;i<=n;i++){
            if(i*(i+1)/2 ==(tot-(i*(i+1)/2)+i))
            return i;
        }
   return -1; }
}