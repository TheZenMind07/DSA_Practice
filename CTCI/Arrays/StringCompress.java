import java.util.*;
import java.io.*;

public class StringCompress {

    static String compress(String str){
        StringBuilder sb = new StringBuilder();
        int count =1;
        char prev = str.charAt(0);

        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i) != prev)
            {
                sb.append(prev);
                sb.append(String.valueOf(count));
                prev = str.charAt(i);
                count =1;
            }
            else
            {
                count++;
            }
        }
        sb.append(prev);
        sb.append(String.valueOf(count));

        return sb.toString();
    }

    public static void main (String[] args)
    {
            System.out.println(compress("aaaabbbbsssdddxxxaaa"));
    }
}
