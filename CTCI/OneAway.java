import java .io.*;
import java.util.*;

public class OneAway{

    public static boolean oneInsertAway(String str1, String str2){
        int index1=0, index2=0;
        while(index1 < str1.length() && index2 < str2.length())
        {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index1++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    public static boolean oneReplaceAway(String str1, String str2){
        boolean oneAway = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (oneAway) {
                    return false;
                }
                oneAway = true;
            }
        }
        return true;
    }

    public static boolean oneaway(String str1, String str2)
    {
            if(str1.length() == str2.length())
                return oneReplaceAway(str1, str2);
            else if(str1.length()-1 == str2.length())
                return oneInsertAway(str1, str2);
            else if(str2.length()-1 == str1.length())
                return oneInsertAway(str2, str1);
            else
                return false;
    }

    public static void main(String[] args)
    {
        System.out.println(oneaway("pale","ple"));
        System.out.println(oneaway("pales","pale"));
        System.out.println(oneaway("pale","bale"));
        System.out.println(oneaway("pale","bake"));
    }
}
