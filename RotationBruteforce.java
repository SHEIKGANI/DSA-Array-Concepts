public class RotationBruteforce {

    // static void leftRotate(int [] arr, int n , int k){
    //     for(int i = 0 ; i < k ; i++){
    //         int temp = arr[0];
    //         for (int j = 0 ; j < n- 1;j++){
    //             arr[j] = arr[j +1];
    //         }
    //         arr[n-1] = temp;
    //     }
    // }

    static void rightRotate(int [] arr, int n , int k){
        for(int i = 0 ; i < k ; i++){
            int temp = arr[n-1];
            for (int j = n- 1; j > 0;j--){
                arr[j] = arr[j + 1];
            }
            arr[n-1] = temp;
        }
    }
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        int k = 2;
        // leftRotate(num, num.length, k);
        rightRotate(num, num.length, k);
        for(int val:num){
            System.out.println(val);
        }
    }
}
