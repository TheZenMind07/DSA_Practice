
import java .io.*;

public class Urlify{

    public static String toUrlify(String str, int n){
        char[] words = str.toCharArray();

        int space_count = 0, i=0, index;
        for( i=0; i<n; i++){
            if(words[i] == ' '){
                space_count++;
            }
        }

        if(str.length() > n)
            words[n] = '\0';

        index = n + space_count*2;

        for(i = n-1; i>= 0; i--){
            if(words[i] == ' '){
                words[index-1] = '0';
                words[index-2] = '2';
                words[index-3] = '%';
                index = index-3;
            }
            else {
                words[index-1] = words[i];
                index--;
            }
        }

        return (new String(words));


    }

    public static void main(String[] args)
    {
        String str= "Mr John Smith    ";
        System.out.println(toUrlify(str, 13));
    }
}
