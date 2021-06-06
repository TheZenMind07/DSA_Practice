
import java.util.*;
import java.io.*;

public class Sum {

    public static Linkedlist sum(Linkedlist ll, Linkedlist ll2) {
        Node curr1 = ll.head, curr2 = ll2.head;
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
        Linkedlist ll2 = new Linkedlist();
        ll2.head = ll2.insert(ll2.head, 1);
        ll2.head = ll2.insert(ll2.head, 8);
        ll2.head = ll2.insert(ll2.head, 2);
        ll2.head = ll2.insert(ll2.head, 6);
        ll2.head = ll2.insert(ll2.head, 4);

        Linkedlist.printll(ll.head);
        System.out.println("-------------------------");
        Linkedlist.printll(ll2.head);

        Linkedlist sum = sum(ll, ll2);
        System.out.println("---------------------------------------------------------");
        Linkedlist.printll(sum.head);


    }
}
