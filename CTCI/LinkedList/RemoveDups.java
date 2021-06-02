import java.util.*;
import java.io.*;

public class RemoveDups {

    public static Linkedlist remove(Linkedlist ll){
        HashSet<Integer> hs = new HashSet<Integer>();
        Node curr = ll.head;
        Node prev = null;

        while (curr != null) {
            if (hs.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                hs.add(curr.data);
                prev = curr;
            }
            curr = curr.next;

        }
        return ll;

    }



    public static void main (String[] args)
    {
        Linkedlist ll = new Linkedlist();
        ll.head = ll.insert(ll.head, 6);
        ll.head = ll.insert(ll.head, 2);
        ll.head = ll.insert(ll.head, 1);
        ll.head = ll.insert(ll.head, 3);
        ll.head = ll.insert(ll.head, 4);
        ll.head = ll.insert(ll.head, 6);
        ll.head = ll.insert(ll.head, 4);

        Linkedlist.printll(ll.head);

        ll = remove(ll);
        System.out.println("---------------------------------------------------------");
        Linkedlist.printll(ll.head);

    }
}
