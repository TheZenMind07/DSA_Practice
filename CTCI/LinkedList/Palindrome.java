
import java.util.*;
import java.io.*;

public class Palindrome{

    public static Node reverse(Linkedlist ll, Linkedlist ll) {
        Node curr1 = ll.head, curr2 = ll.head;
        Linkedlist sum = new Linkedlist();
        int value, carry = 0;;
        while(curr1 != null || curr2 != null ){
            value = carry;
            if(curr1 != null){
                value += curr1.data;
                curr1 = curr1.next;
                }
            if(curr2 != null){
                value += curr2.data;
                curr2 = curr2.next;
            }


            carry = value/10;
            value = value%10;
            sum.head = sum.insert(sum.head, value);

        }
        if(carry == 1)
            sum.head = sum.insert(sum.head, 1);

        return sum;
    }



    public static void main (String[] args)
    {
        Linkedlist ll = new Linkedlist();
        ll.head = ll.insert(ll.head, 6);
        ll.head = ll.insert(ll.head, 2);
        ll.head = ll.insert(ll.head, 1);
        ll.head = ll.insert(ll.head, 8);
        ll.head = ll.insert(ll.head, 4);
        ll.head = ll.insert(ll.head, 5);
        ll.head = ll.insert(ll.head, 4);
        ll.head = ll.insert(ll.head, 8);
        ll.head = ll.insert(ll.head, 1);
        ll.head = ll.insert(ll.head, 2);
        ll.head = ll.insert(ll.head, 6);

        Linkedlist.printll(ll.head);

        ispalindrome(ll.head);


    }
}
