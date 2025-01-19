class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       HashMap <Integer,Integer> hs=new HashMap();
       int Ans[]=new int[A.length];
       int i,count=0;
       for(i=0;i<B.length;i++){
          if(!hs.containsKey(A[i]))
          hs.put(A[i],1);
          else
          count++;
          if(!hs.containsKey(B[i]))
          hs.put(B[i],1);
          else
          count++;
          Ans[i]=count;

       }
       return Ans;
    }
    }
