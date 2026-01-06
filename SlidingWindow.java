public class SlidingWindow {
    public static int maxSum(int []arr,int k){
        int windowSum = 0;
        for(int i = 0; i < k ;i++){
            windowSum = windowSum + arr[i];
        }
        int maxTotal = windowSum;
        for ( int  i = k ; i < arr.length;i++){
            windowSum = windowSum - arr[i-k];
            windowSum = windowSum + arr[i];
            if(windowSum > maxTotal){
                maxTotal = windowSum;
            }
        }
        return maxTotal;
    }
    public static void main(String[] args) {

        int [] num = {2,1,5,1,3,2};
        int k = 3 ;
        int res = maxSum(num, k);
        System.out.println(res);
        
    }
}
