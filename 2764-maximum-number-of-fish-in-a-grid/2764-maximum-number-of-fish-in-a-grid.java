class Pair {
    int first;
    int sec;

    public Pair(int first, int sec) {
        this.first = first;
        this.sec = sec;
    }
}

class Solution {
    public int findMaxFish(int[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int i, j;
        int maxx = 0;

        for (i = 0; i < grid.length; i++) {
            for (j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] > 0) {
                    int s = count(grid, visited, i, j);
                  //  System.out.println(s);
                    maxx = Math.max(s, maxx);
                }
            }
        }
        return maxx;
    }

    int count(int grid[][], boolean visited[][], int r, int c) {
        int sum = grid[r][c];
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(r, c));
        visited[r][c] = true;

        while (!q.isEmpty()) {

            int row = q.peek().first;
            int col = q.peek().sec;
            q.remove();
           // System.out.println(row+""+col+""+sum);
            if (row > 0 && visited[row - 1][col] != true) {
                if (grid[row - 1][col] > 0) {
                    sum = sum + grid[row - 1][col];
                    q.add(new Pair(row - 1, col));
                }
                visited[row - 1][col] = true;
            }

            if (col > 0 && visited[row][col - 1] != true && grid[row][col - 1] > 0) {
                if (grid[row][col - 1] > 0) {
                    sum = sum + grid[row][col - 1];

                    q.add(new Pair(row, col - 1));
                }
                visited[row][col - 1] = true;
            }
            if (row < grid.length - 1 && visited[row + 1][col] != true && grid[row + 1][col] > 0) {
                if (grid[row + 1][col] > 0) {
                    sum += grid[row + 1][col];
                    q.add(new Pair(row + 1, col));
                }
                visited[row + 1][col] = true;
            }

            if (col < grid[0].length - 1 && visited[row][col + 1] != true && grid[row][col + 1] > 0) {
                if (grid[row ][col+1] > 0) {
                    sum += grid[row][col + 1];
                    q.add(new Pair(row, col + 1));
                }
                visited[row][col + 1] = true;
            }

        }

        return sum;

    }
}