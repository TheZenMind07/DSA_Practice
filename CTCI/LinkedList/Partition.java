
import java.util.*;
import java.io.*;

public class Partition {

    public static Node partition(Linkedlist ll, int k) {
        Node curr = ll.head;

        if(curr == null)
            return null;

        Node gt_start = null, lt_start = null, gt_end = null, lt_end = null;
        while (curr != null) {
            Node next = curr.next;
            if(curr.data < k){
                if(lt_start == null){
                    lt_start = curr;
                    lt_end = curr;
                }
                lt_end.next = curr;
                lt_end = curr;
            }
            else if(curr.data >= k){
                    if(gt_start == null){
                        gt_start = curr;
                        gt_end = curr;
                    }
                gt_end.next = curr;
                gt_end = curr;
            }

            curr = next;
        }
        if (lt_start == null) {
            return gt_start;
        }
        lt_end.next = gt_start;


        return lt_start;
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
        ll.head = ll.insert(ll.head, 10);
        ll.head = ll.insert(ll.head, 8);
        ll.head = ll.insert(ll.head, 23);
        ll.head = ll.insert(ll.head, 2);
        ll.head = ll.insert(ll.head, 1);

        Linkedlist.printll(ll.head);

        ll.head = partition(ll, 5);
        System.out.println("---------------------------------------------------------");
        Linkedlist.printll(ll.head);


    }
}
