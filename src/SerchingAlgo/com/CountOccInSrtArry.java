package SerchingAlgo.com;

public class CountOccInSrtArry {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 40, 40}, n = 6;

        int x = 20;

        System.out.println(countOcc(arr, n, x));
    }

    static int countOcc(int[] arr, int n, int x) {
        int first = firstOcc(arr, x);
        if (first == 0) {
            return -1;
        } else {
            return lastOcc(arr, n, x) - first + 1;
        }
    }

    static int firstOcc(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                if (arr[mid - 1] != arr[mid] || mid == 0) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;
    }


    static int lastOcc(int[] arr, int n, int key) {
        int high = arr.length - 1;
        int low = 0;


        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                if (arr[mid + 1] != arr[mid] || mid == arr.length - 1) {
                    return mid;
                } else {
                    low = mid + 1;
                }

            }
        }
        return -1;

    }
}
