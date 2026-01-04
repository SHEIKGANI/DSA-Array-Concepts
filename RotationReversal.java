public class RotationReversal {

    public static void leftrotate(int [] arr,int n,int k){
        reverse (arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }

    //  public static void rightrotate(int [] arr,int n,int k){
    //     reverse (arr,n-k,n-1);
    //     reverse(arr,0,n-k-1);
    //     reverse(arr,0,n-1);
    // }

    public static void reverse(int []arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        int k = 2;
        leftrotate(num,num.length, k);
        // rightrotate(num,num.length, k);
        for(int val:num){
            System.out.println(val);
        }

    }
}
