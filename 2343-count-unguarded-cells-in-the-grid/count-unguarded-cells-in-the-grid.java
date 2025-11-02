class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int [][]grid=new int[m][n];
        for(int[] g:guards){
            grid[g[0]][g[1]]=1;
        }
        for(int []w:walls){
            grid[w[0]][w[1]]=2;
        }
        for (int[] g : guards) {
        int r = g[0], c = g[1];
    // do whatever you need with this guard
            if(r>0){
                for(int i=r-1;i>=0&&grid[i][c]!=1&&grid[i][c]!=2;i--){
                    grid[i][c]=3;
                }
            }
            if(r<m){
                for(int i=r+1;i<m&&grid[i][c]!=1&&grid[i][c]!=2;i++){
                   grid[i][c]=3;
                }
            }
            if(c>0){
                for(int i=c-1;i>=0&&grid[r][i]!=1&&grid[r][i]!=2;i--){
                    grid[r][i]=3;
                }
            }
            if(c<n){
                for(int i=c+1;i<n&&grid[r][i]!=1&&grid[r][i]!=2;i++){
                    grid[r][i]=3;
                }
            }
        }
    int count=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==0){
                count++;
            }
        }
    }return count;
    }
}