

 class OddAppearing{

    public static void oddResult(int[] arr){
    int res = 0 ;
    for (int i = 0; i < arr.length; i++) {
    res = res^arr[i];
    }

    System.out.println(res);
    }



    public static void main(String args[]){
        int[] arr = {2, 5, 2, 5, 2,7,2,7,18,23,18,23,76};
        oddResult(arr);
    }

}
