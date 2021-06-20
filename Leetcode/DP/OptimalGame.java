//https://www.geeksforgeeks.org/optimal-strategy-for-a-game-dp-31/

class OptimalGame
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int arr[], int n)
    {
        // Your code here
        int[][] dp = new int[n][n];

        for(int i=0; i+1<n; i++){
    dp[i][i+1] = Math.max(arr[i], arr[i+1]);
}

for(int gap = 3; gap < n; gap++){
    for(int i=0; i+gap < n; i++){
        int j = i+gap;
        dp[i][j] = Math.max(
arr[i] + Math.min( dp[i+2][j], dp[i+1][j-1] ),
arr[j] + Math.min(dp[i+1][j-1], dp[i][j-2])
);

}
}
return dp[0][n-1];

    }
}
