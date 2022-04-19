package SerchingAlgo.com;

public class SerchInInfinitArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 40, 50};

        int x = 40;

        System.out.println(search(arr, x));

    }



     static int search(int[] arr, int x) {
        int low=0;
        int high=1;
        while (arr[high]<x){
            low=high;
            high=2*high;
        }
        return bserch(arr,x,low,high);
    }

    static int bserch(int[] arr, int key, int low, int high) {
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if (arr[mid]==key){
            return mid;
        }else if (arr[mid]>key){
            return bserch(arr,key,low,mid-1);
        }else {
            return bserch(arr,key,mid+1,high);
        }
    }
}
