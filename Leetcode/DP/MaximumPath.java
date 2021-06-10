
class MaximumPath
{
    static boolean isValid(int[][] arr, int i, int j){
        boolean column = ( j >=0 ) && ( j < arr[0].length );
        boolean row = ( i >=0 ) && ( i < arr.length );
        return column && row;
    }


    static int maximumPath(int N, int Matrix[][])
    {
        int[][] dp = new int[Matrix.length][Matrix[0].length];

        for(int i=0; i<Matrix[0].length; i++){
            dp[0][i] = Matrix[0][i];
        }

    for(int i=1; i<Matrix.length; i++){
        for(int j=0; j<Matrix[0].length; j++){
            for(int k=-1; k<=1; k++){
                if(isValid(Matrix, i-1, j+k)){
                    dp[i][j] = Math.max(dp[i][j] , dp[i-1][j+k] + Matrix[i][j]);
                }
            }

        }
    }
    int max_ele = Integer.MIN_VALUE;
    for(int i=0; i<Matrix[0].length; i++){
        max_ele = Math.max( dp[Matrix.length-1][i], max_ele);
    }

    return max_ele;

    }

    public static void main(String[] args){
        MaximumPath mp = new MaximumPath();
        int[][] arr = { { 348, 391 }, { 618, 193 } };
        System.out.println(MaximumPath.maximumPath(2, arr));

    }

}



