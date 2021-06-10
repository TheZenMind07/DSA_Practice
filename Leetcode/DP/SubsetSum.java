//https://www.geeksforgeeks.org/subset-sum-problem-dp-25/

class SubsetSum{
    static boolean isSubsetSum(int N, int arr[])
    {
        // code here
        int len  = arr.length;
            boolean[][] dp  = new boolean[len+1][N+1];

        for(int i=0; i<= N; i++)
            dp[0][i] = false;

        for(int i=0; i<= len; i++)
            dp[i][0] = true;

        for(int i=1; i<= len; i++){
            for( int j=1; j<= N ; j++){
                dp[i][j] = dp[i-1][j];
                if( j >= arr[i-1] )
                    dp[i][j] |= dp[i-1][j-arr[i-1]];
                }
            }
        return dp[len][N];

    }

    public static void main(String[] args){

        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 30;
        System.out.println(SubsetSum.isSubsetSum(sum, arr));

    }
}
