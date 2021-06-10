import java.util.*;
import java.io.*;


//Print the angle between hour hand and minute hand in a clock at any given time. Please print the lesser of the angles.

// int getAngle(int hh, int mm) {
// TODO:
// }
// est cases for candidate
// Input: 6, 00 Output: 180
// Input 5, 30 Output 15


public class GetAngle {

    static double getAngle(int hh, int mm)
    {
        double hour_angle = (hh*360)/12 + (double)mm/2;
        double min_angle = (mm*360)/60;
        double diff = hour_angle - min_angle;


        if(Math.abs(diff) > 180 )
            return Math.abs(360 - diff);
        else
            return Math.abs(diff);
    }

    public static void main (String[] args)
    {
        GetAngle ga = new GetAngle();
        System.out.println(ga.getAngle(12, 30));
    }
}
