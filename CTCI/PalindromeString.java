
// import java.io.*;
import java.util.*;

public class PalindromeString {

    public static boolean checkPalindrome(String str){
        // HashSet<Character> hs = new HashSet<Character>();
        int[] charCount = new int[26];
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                // hs.add(str.charAt(i));
                // char_count++;
                charCount[str.charAt(i) - 'a']++;
            }
            else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                        // hs.add((char)(str.charAt(i)-'A'+'a'));
                        // char_count++;
                        charCount[str.charAt(i) - 'A']++;
            }
        }
        int even_odds = 0;
        for (int i = 0; i < 26; i++) {
            if (charCount[i] % 2 != 0) {
                even_odds++;
            }
        }
        if(even_odds <= 1)
            return true;
        else
            return false;
    }

    public static void main (String[] args)
    {
        String str = "Tact Coa";
        System.out.println(checkPalindrome(str));
    }
}
