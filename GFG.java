import java.util.*;
import java.io.*;

public class GFG {

   public boolean dfs(int i , int j, boolean[][] visited, int[][] grid1, int[][] grid2){
        if( i < 0 || i == grid1.length || j < 0 || j == grid1[0].length || visited[i][j] || grid2[i][j] == 0)
            return true;

        boolean res = true;

        if(grid1[i][j] == 0)
            res =  false;
	visited[i][j]  = true;
        int[][] dir = {{-1, 0}, {1, 0}, { 0, 1}, {0 , -1} };



        for( int k = 0; k < 4  ; k++){
            int new_i = i + dir[k][0];
            int new_j = j + dir[k][1];
            res = dfs(new_i, new_j, visited, grid1, grid2) && res;

        }
        return res;
    }



    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if( !visited[i][j] && grid2[i][j] == 1 ){
                    if(dfs(i, j , visited, grid1, grid2))
                        count++;
                }
            }
        }

        return count;
    }
public static void main( String[] args ){

    GFG lc = new GFG();
//     7
// 6
// [1,2,3,4,5,6,-1]
// [0,6,5,4,3,2,1]
//     System.out.println(lc.countSubIslands(
// 	    new int[][] {{1,0,1,0,1},{1,1,1,1,1},{0,0,0,0,0},{1,1,1,1,1},{1,0,1,0,1}},
// 			new int[][] { { 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 }, { 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0 },
// 					{ 1, 0, 0, 0, 1 } }));

					    System.out.println(lc.countSubIslands(
	    new int[][] {{1,0,1,0,1},{1,1,1,1,1},{0,0,0,0,0},{1,1,1,1,1},{1,0,1,0,1}},
	    new int[][] {{0,0,0,0,0},{1,1,1,1,1},{0,1,0,1,0},{0,1,0,1,0},{1,0,0,0,1}}));

}
}
