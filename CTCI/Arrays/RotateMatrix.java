import java.util.*;
import java.io.*;

public class RotateMatrix {

    static int[][] rotate(int[][] mat){
        if(mat.length != mat[0].length){
            System.out.println("It's not square");
            return mat;
        }
        int size = mat.length;

        for(int layer=0; layer<mat.length/2; layer++){
            int last = size-layer-1, first = layer;
            for(int i = first; i< last ; i++){

                    int offset = i-first;
                    int top = mat[first][i];
                    mat[first][i] = mat[last-offset][first];
                    mat[last-offset][first] = mat[last][last-offset];
                    mat[last][last-offset] = mat[i][last];
                    mat[i][last] = top;

            }

        }
        return mat;
    }

    public static void main (String[] args)
    {
    int[][] mat = new int[5][5];
    int count = 0;
    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            mat[i][j] = count++;
        }
    }

    int[][] new_mat = rotate(mat);

    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            System.out.print(new_mat[i][j] +  " ");
        }
        System.out.println(" ");
    }

    }
}
