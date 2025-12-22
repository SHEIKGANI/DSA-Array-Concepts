public class BinarySearch {

    public static int binarysearch(int [] arr , int target){

        int leftIndex = 0;

        int rightIndex = arr.length -1;

        while(leftIndex<= rightIndex){
            int midIndex = leftIndex +( rightIndex - leftIndex) / 2;

            if(arr[midIndex] == target){
                return midIndex;
            }

            if(arr[midIndex] <= target){
                leftIndex = midIndex + 1;
            }

            if(arr[midIndex] >= target){
                rightIndex = midIndex - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int num[] = {1,2,3,4,5,6,7,8,9,10};

        int target = 10;

        int res = binarysearch(num, target);

        System.out.println(res);
    }
}
