class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int start=0,ans=0;
        int l=cardPoints.length-1;
        int end=l;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<k;i++){
            sum1+=cardPoints[i];
            sum2+=cardPoints[l-i];
            start=i;
        }
        if(k==cardPoints.length)
        return sum1;
        else{

        for(int i=0;i<k;i++){
            
            sum1=sum1-cardPoints[start]+cardPoints[end];
            System.out.println(start+" " + end+" "+sum1);
            ans=Math.max(ans,sum1);
            start--;
            end--;
        }
start+=1;
end+=1;
for(int i=0;i<k;i++){
    sum2=sum2+cardPoints[start]-cardPoints[end];
    System.out.println(start+" " + end+" "+sum2);
    ans=Math.max(ans,sum2);
    start++;
    end++;
}

        }
        return ans;
    }
}