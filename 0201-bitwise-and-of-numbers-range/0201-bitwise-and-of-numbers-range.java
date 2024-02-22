class Solution {
    public int rangeBitwiseAnd(int left, int right) {
if(left>=2147483640 || left==1073741824
)
return left;
        int i;
       String s= Integer.toBinaryString(left); 
       String ss=Integer.toBinaryString(right);
       if(s.length()!=ss.length() || left==0)
      return 0;  
  
        long l=left;
       for( i=left;i<=right;i++){
           l=l&i;
       }System.out.println(l);
        return (int)l;
    }
}