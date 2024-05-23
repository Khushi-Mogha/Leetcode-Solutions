class Solution {
    public int matrixScore(int[][] grid) {
        int i, j, one, zero,ans=0;
        String k="",s;
        for (i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0)
                for (j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 0)
                        grid[i][j] = 1;
                    else
                        grid[i][j] = 0;
                }
        }
        for (j = 1; j < grid[0].length; j++) {

            one = 0;
            zero = 0;
            for (i = 0; i < grid.length; i++) {
                if (grid[i][j] == 0)
                    zero += 1;
                else
                    one += 1;
            }
            if (zero > one)
                for (i = 0; i < grid.length; i++) {
                    if (grid[i][j] == 0)
                        grid[i][j] = 1;
                    else
                        grid[i][j] = 0;
                }
        }
        for (i = 0; i < grid.length; i++) {
            s="";
            for (j = 0; j < grid[0].length; j++){
                k=Integer.toString(grid[i][j]);
               s+=k;
            }
            ans+=Integer.parseInt(s,2);
        }
    return ans;}
}
