class Solution {
    public boolean makeEqual(String[] words) {
        int l=words.length;
        int i,j;
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(i=0;i<l;i++){
            for(j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);
                if(map.containsKey(c))
                map.put(c,map.get(c)+1);
                else
                 map.put(c,1);
                 }
        }
for(int count:map.values())
if(count%l!=0)
return false;

return true;

    }
}