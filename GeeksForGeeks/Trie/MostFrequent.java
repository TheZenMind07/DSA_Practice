package Trie;

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class MostFrequent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int t=sc.nextInt();
		// while(t-->0)
		// {
		    int n=sc.nextInt();
		    sc.nextLine();
		    MaxSol obj = new MaxSol();
		    String arr[]=sc.nextLine().split(" ");
		    System.out.println(obj.mostFrequentWord(arr, n));

		// }
	}
}

 // } Driver Code Ends
//User function Template for Java

class MaxSol
{
    class Node {
        boolean isEnd;
        int freq;
        TreeMap<Character, Node> tm = new TreeMap<Character, Node>();

        Node(){
            freq = 0;
            isEnd = false;
        }

    }
    //Function to find most frequent word in an array of strings.
    public String mostFrequentWord(String arr[],int n)
    {
        Node root = new Node();
        Node curr = root;
        // code here
        for(int i =0; i<n ; i++ ){
            // Inserting into trie
            curr = root;
            for (int j = 0; j < arr[i].length(); j++) {
                if (curr.tm.get(arr[i].charAt(j)) == null) {
                    curr.tm.put(arr[i].charAt(j), new Node());

                    curr = curr.tm.get(arr[i].charAt(j));

                }

            }
             curr.freq++;
                curr.isEnd = true;

        }

        int max_freq = -1;
        String res = "";
        for(int i =0; i<n ; i++ ){
            // Inserting into trie
            curr = root;
            for(int j=0; j<arr[i].length(); j++){
                if(curr.tm.get(arr[i].charAt(j)) != null)
                    curr = curr.tm.get(arr[i].charAt(j));
                }
                if(curr.freq >= max_freq){
                res = arr[i];
                max_freq = curr.freq;
                }
            }
        return res;
        }
    }





// { Driver Code Starts.  // } Driver Code Ends
