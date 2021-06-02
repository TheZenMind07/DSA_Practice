import java.util.*;
import java.io.*;

public class Linkedlist {

    Node head;

    public static void printll(Node head){
        Node curr= head;
        while(curr != null){
            System.out.print(curr.data +  " ");
            curr = curr.next;
        }
    }

    public  Node insert( Node head,int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
        return head;
    }

    public static void main (String[] args)
    {
        Linkedlist ll = new Linkedlist();
        ll.insert(ll.head, 1);
        ll.insert(ll.head,1);
        ll.insert(ll.head,1);
    }
}
