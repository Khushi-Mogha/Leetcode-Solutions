class Solution(object):
    def longestCommonSubsequence(self, text1, text2):
        """
        :type text1: str
        :type text2: str
        :rtype: int
        """
        m=len(text1)
        n=len(text2)
        ans = [[None]*(n+1) for i in range(m+1)]
        
        
        for i in range(0,len(text1)+1):
            for j in range(0,len(text2)+1):
                if(i==0 or j==0):
                    ans[i][j]=0
                elif(text1[i-1]==text2[j-1]):
                   
                   
                    ans[i][j]=ans[i-1][j-1]+1
            
                else:
                    ans[i][j]=max(ans[i-1][j],ans[i][j-1])
        return  ans[len(text1)][len(text2)]