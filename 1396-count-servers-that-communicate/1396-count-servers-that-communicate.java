class Solution {
    public int countServers(int[][] grid) {
        int row[]=new int[grid.length];
        int col[]=new int[grid[0].length];
        int c=0,i,j;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
              {  row[i]+=1;
              col[j]+=1;
              }
            }
        }
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
if(row[i]>=2 || col[j]>=2)
c++;
                }
            }
        }
        return c;
    }
}