import java.util.*;
import java.io.*;

public class LastKth {

    public static int lastk(Linkedlist ll, int k){
        Node curr = ll.head, runner = ll.head;
        for(int i=1; i<k && runner != null; i++)
        {
            runner = runner.next;
        }
        while(runner.next != null){
            curr = curr.next;
            runner = runner.next;
        }
        return curr.data;

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

        int res = lastk(ll, 3);
        System.out.println("---------------------------------------------------------");
        System.out.println(res);

    }
}
