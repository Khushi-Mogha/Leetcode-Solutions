class Solution {
    public int maxScore(String s) {
        int maxx=0;
        int i,zero=0,one=0;
        for(i=0;i<s.length();i++){
        char c= s.charAt(i);
        if(c=='1')
        one+=1;
        
        }
        for(i=0;i<s.length()-1;i++)
        {if(s.charAt(i)=='0')
        zero+=1;
        else
        one-=1;
        maxx=Math.max(maxx,zero+one);
        }
        return maxx;
    }
}