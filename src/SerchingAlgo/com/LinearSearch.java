package SerchingAlgo.com;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("hello ");

        int arr[]={1,2,3,4,6};
        int key=6;
        int ans=linear(arr,key);
        System.out.println(ans);
    }

         static int linear(int[] arr, int key) {
             for (int i = 0; i < arr.length; i++) {
                 if (arr[i]==key){
                     return i;
                 }
             }
             return -1;
    }
}
