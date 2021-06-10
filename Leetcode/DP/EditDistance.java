
class EditDistance {
//     public int minDistanceUtil(String word1, String word2, int len1, int len2){
//
//         if(len1 == 0)    return len2;
//         if(len2 == 0)    return len1;
//
//         if(word1.charAt(len1-1) == word2.charAt(len2-1))
//             return minDistanceUtil(word1, word2, len1-1, len2-1);
//         else {
//             int min_replace = 1 + minDistanceUtil(word1, word2, len1-1, len2-1);
//             int min_delete = 1 + minDistanceUtil(word1, word2, len1-1, len2);
//             int min_insert = 1 + minDistanceUtil(word1, word2, len1, len2 - 1);
//             return Math.min(min_replace, Math.min(min_delete, min_insert));
//             }
//             }
//
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
//         return minDistanceUtil(word1, word2, len1, len2);
        int[][] dp = new int[len1+1][len2+1];
        for(int i=0; i)

    }

    public static void main(String[] args){
    EditDistance e = new EditDistance();
    String str1 = "horse";
    String str2 = "ros";
    System.out.println(e.minDistance(str1, str2));
    }
}
