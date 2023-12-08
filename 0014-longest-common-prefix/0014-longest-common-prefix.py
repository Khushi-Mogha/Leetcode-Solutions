class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s=""+strs[0]
        for i in strs:

            new=""
            t=min(len(s),len(i))
            for j in range(t):
                if i[j]==s[j]:
                    new+=i[j]
                else:
                    break    
            s=""
            s=new
        return s        
