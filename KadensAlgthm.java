public class KadensAlgthm {

    public static int maxSum(int [] arr){

        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length;i++){
            if(currentSum < 0){
                currentSum = 0;
            }

            currentSum = currentSum + arr[i];

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
       return maxSum;
    }
    public static void main(String[] args) {
        int [] num = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSum(num);
        System.out.println(res);
    }
}
