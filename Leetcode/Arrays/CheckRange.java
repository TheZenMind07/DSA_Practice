import java.util.Arrays;
import java.util.*;

class CheckRange {

    public boolean isCovered(int[][] ranges, int left, int right) {

        Arrays.sort(ranges, new Comparator<int[]>() {
            @Override

            public int compare(int[] entry1, int[] entry2 ){

                if(entry1[0] > entry2[0])
                    return 1;
                else
                    return -1;
            }
        } );

        int iterator = left;
        int range_iter = 0;

        while(iterator < right && range_iter < ranges.length) {
            if( iterator >= ranges[range_iter][0] && iterator <= ranges[range_iter][1])
                iterator = Math.max(ranges[range_iter][1] + 1, iterator) ;

            range_iter++;
        }

        if(iterator >= right)    return true;
        else
            return false;
    }


    public static void main(String[] args) {
            CheckRange cr = new CheckRange();
            int[][] arr = { { 3, 4 }, { 1, 2 }, { 5, 6 } };
            int left = 2, right = 5;
            System.out.println(cr.isCovered(arr, left, right));
}
}