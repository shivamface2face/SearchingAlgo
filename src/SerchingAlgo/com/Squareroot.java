package SerchingAlgo.com;

public class Squareroot {
    public static void main(String[] args) {
        System.out.println(sqRootFloor(10));
    }

         static int sqRootFloor(int n) {
        int low=1;
        int high=n;
        int ans=-1;
        while (low<=high){
            int mid=(low+high)/2;
            int srt=mid*mid;

            if (srt==n){
                return mid;
            }else if (srt>n){
                high=mid-1;
            }else {
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
