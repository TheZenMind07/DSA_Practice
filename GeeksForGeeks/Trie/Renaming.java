 
class Solution
{

    static void insertUtil(TrieNode root, String key, int pos, ArrayList<String> als){
        int index = key.charAt(pos) - 'a';
        if(root.mp.get(index) == null){
            root.mp.get(index) = new TrieNode();
            als.add(key.substring(0, pos+1));
        }

        if(pos ==  key.length()-1){
            if(root.isEndOfWord == true)

            root.isEndOfWord = true;
            return;
        }

        insertUtil(root.mp.get(index),  key, pos+1);

    }


    public static void check(String arr[],int n)
    {
    Node root = new Node();
        //Your code here
        ArrayList<String> als = new ArrayList<Integer>();
        for(int i=0; i<n ; i++){
            insertUtil(root, arr[i], 0, als);

        }
    }
}
