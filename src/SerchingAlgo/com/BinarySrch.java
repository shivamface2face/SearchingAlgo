package SerchingAlgo.com;

public class BinarySrch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int key=5;
        int ans=srch(arr,key);
        System.out.println(ans);
    }

      static int srch(int[] arr, int key) {
        int low=0;
        int high= arr.length-1;

        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                high=mid-1;
            }else if (arr[mid]<key){
                low=mid+1;
            }
        }
        return -1;
    }
}
