import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

class Leetcode {

class Pair{
        int i,j;
        Pair( int a, int b ){
            i = a; j = b;
        }
    }

public int maxDistance(int[][] grid) {
    int count = 0;
    int len_r = grid.length;
    int len_c = grid[0].length;
    Queue<Pair> q = new ArrayDeque<>();
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    for( int i =0 ; i< len_r ; i++ ){
        for( int j =0; j< len_c ; j++ ){
            if( grid[i][j] == 1 && !visited[i][j])
                q.offer( new Pair( i, j ) );
            visited[i][j] = true;
        }

    }

    if ( q.size() == 0 || q.size() == len_r*len_c)
        return -1;

    int[][] dir = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };


    while( !q.isEmpty() ){
        int size = q.size();
        count++;
        for( int s = 0 ; s<size; s++  ){
            Pair curr = q.poll();
            for( int i =0; i< 4; i++ ){
                int new_r = curr.i + dir[i][0];
                int new_c = curr.j + dir[i][1];
                if( new_r >= 0 && new_r < len_r && new_c >= 0 && new_c < len_c && grid[new_r][new_c] == 0 && !visited[new_r][new_c]){
                    q.offer(new Pair( new_r, new_c ));
                    visited[new_r][new_c] =  true;;
                }
            }

        }
    }

    return count;

}
public static void main( String[] args ){

    Leetcode lc = new Leetcode();
    int[][] arr = { {1, 0 ,1},{0 ,0 ,0},{1, 0 ,1} };
    System.out.println(lc.maxDistance(arr));

}
}

