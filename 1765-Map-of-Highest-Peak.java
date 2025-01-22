import java.util.*;

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] vis = new int[m][n];
        int[][] hgt = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) { 
                    q.offer(new int[]{i, j, 0}); 
                    hgt[i][j] = 0;              
                    vis[i][j] = 1;          
                }
            }
        }
        int[] row = {-1, 0, 1, 0};
        int[] col = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            int[] value = q.poll();
            int i = value[0], j = value[1], height = value[2];
            hgt[i][j] = height;
            for (int k = 0; k < 4; k++) {
                int nrow = i + row[k];
                int ncol = j + col[k];
                if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    q.offer(new int[]{nrow, ncol, height + 1}); 
                }
            }
        }
        return hgt;
    }
}