package SerchingAlgo.com;

public class IndexOfLastOcc {
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 10, 20, 20}, n = 7;

        int x = 10;

        System.out.println(lastOcc(arr, n, x));
    }

      static int lastOcc(int[] arr, int n, int key) {
          int low=0;
          int high= arr.length-1;


          while (low<=high){
              int mid=(low+high)/2;

              if(arr[mid]>key){
                  high=mid-1;
              }else if (arr[mid]<key){
                  low=mid+1;
              }else {
                  if (arr[mid+1]!=arr[mid] || mid==arr.length-1){
                      return mid;
                  }else {
                      low=mid+1;
                  }
              }

          }
          return -1;
    }
}
