class Solution {
    public int[] productExceptSelf(int[] nums) {
       int a[]=new int[nums.length];
        int c=0,pro=1,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0)
                pro*=nums[i];
            else
                c+=1;
        }
        if(c>1)
            for(i=0;i<nums.length;i++)
                a[i]=0;
        else if(c==1)
            for(i=0;i<nums.length;i++)
            if(nums[i]!=0)
            a[i]=0;
            else
            a[i]=pro;
        else 
        for(i=0;i<nums.length;i++)
        a[i]=pro/nums[i];

        
        return a;
    }
}