public class LinearSearch {

    public static int findTarget(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int [] num = {1,2,3,5,6,8,9,7};

        int target = 9;
        int result = findTarget(num, target); 

        System.out.println(result);
    }
}