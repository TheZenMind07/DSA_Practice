
import java.util.*;
import java.io.*;

public class RemoveMiddle {

    public static Linkedlist removemiddle(Linkedlist ll) {
        Node curr = ll.head;
        if(curr == null && curr.next == null)
            return null;

        Node runner = curr, prev = null;
        while (runner != null && runner.next != null) {
            runner = runner.next.next;
            prev = curr;
            curr = curr.next;
        }

        if(prev != null)
            prev.next = curr.next;
        // else

        return ll;
    }



    public static void main (String[] args)
    {
        Linkedlist ll = new Linkedlist();
        ll.head = ll.insert(ll.head, 6);
        ll.head = ll.insert(ll.head, 2);
        ll.head = ll.insert(ll.head, 1);
        // ll.head = ll.insert(ll.head, 3);
        // ll.head = ll.insert(ll.head, 4);
        // ll.head = ll.insert(ll.head, 6);
        // ll.head = ll.insert(ll.head, 4);

        Linkedlist.printll(ll.head);

        ll = removemiddle(ll);
        System.out.println("---------------------------------------------------------");
        Linkedlist.printll(ll.head);


    }
}
