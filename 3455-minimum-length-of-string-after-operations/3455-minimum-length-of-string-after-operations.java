class Solution {
    public int minimumLength(String s) {
        HashMap <Character,Integer> hs=new HashMap();
        int i=0;
        int ans=0;
        for(i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hs.containsKey(c))
            hs.put(c,hs.get(c)+1);
            else
            hs.put(c,1);

        }
     for(Character c:hs.keySet()){
        if(hs.get(c)%2==0)
        ans+=2;
        else
        ans+=1;
     }
     return ans;

    }
}