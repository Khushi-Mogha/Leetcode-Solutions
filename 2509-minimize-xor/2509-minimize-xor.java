class Solution {
    public int minimizeXor(int num1, int num2) {
        String n1=Integer.toBinaryString(num1);
        String n2=Integer.toBinaryString(num2);
        int i,l1=n1.length(),l2=n2.length();
int c1=0,c2=0;
        for(i=0;i<l1;i++)
           if(n1.charAt(i)=='1')
           c1++;

        for(i=0;i<l2;i++)
        if(n2.charAt(i)=='1')
        c2++;
String ans="";
        if(c1<=c2)
        ans=n1;


         if(c1>c2){
            i=0;
         
         while(i<l1 ){
         if(n1.charAt(i)=='1' && c2>0 )
         {ans+='1';
         c2=c2-1;}
         else
         ans+='0';
         i++;}
        
         }
else
        if(c2>c1){
            l1-=1;
            c2=c2-c1;
        while( c2 >0 &&  l1>=0){
        if(ans.charAt(l1)=='0')
        {
            //System.out.println(ans);
            ans = ans.substring(0, l1) + '1'
              + ans.substring(l1 + 1);
 
            c2--;
        }
        l1--;
        }
        while(c2>0)
        {ans='1'+ans;
         c2--;
        }}
       // System.out.println("1111",2);
        int y=Integer.parseInt(ans,2);
        return y;
    }
}