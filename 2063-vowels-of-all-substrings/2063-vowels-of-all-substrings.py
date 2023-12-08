class Solution:
    def countVowels(self, word: str) -> int:
        ans=0;l=len(word)
        for i in range(len(word)):
            if(word[i]=="a" or word[i]=="e" or word[i]=="i" or word[i]=="o" or word[i]=="u"):
                ans+=(i+1)*(l-i)
        return ans