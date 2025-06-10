class Solution {
    public int maxDifference(String s) {
       HashMap <Character,Integer> hs=new HashMap<>();
       int i;
       int oddmax=0;
       int even_min=10000;
       for(i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(!hs.containsKey(c)){
            hs.put(c,1);
        }
        else
        {
            hs.put(c,hs.get(c)+1);
        }
       }
       for(Character k:hs.keySet()){
        int m=hs.get(k);
        if(m%2!=0 && m>oddmax)
        oddmax=m;
        if(m%2==0 &&m<even_min)
        even_min=m;

       }

       return oddmax-even_min;
    }
}