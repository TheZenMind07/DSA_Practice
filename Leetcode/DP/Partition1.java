
class Partition1 {

    public int minDiff(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        int[][] dp = new int[len1+1][len2+1];
        for(int i=0; i)

    }

    public static void main(String[] args){
    EditDistance e = new EditDistance();
    String str1 = "horse";
    String str2 = "ros";
    System.out.println(e.minDiff(str1, str2));
    }
}
