
import java.util.*;
import java.io.*;

public class Sum2{



    class PartialSum{
        Linkedlist sum ;
        int carry;
    }


    LinekdlistNode = addlinkedlist(ll1, ll2);

    PartialSum addlisthelper(Linkedlist l1, Linkedlist l2){

        if(l1 == null && l2 == null){
            PartialSum sum  = new PartialSum();
            return sum;
        }

        PartialSum sum = addlisthelper(l1.next , l2.next);

        int val = sum.carry + l1.data + l2.data;
        insert(sum.sum , val%10);
        sum.carry = val/10;
        return sum;

    }

    function



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
