public class PairFound{
     public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        boolean pairfound = false;
        int target = 6;
        int start = 0 ; int end = num.length-1;

        while(start < end){
            int sum = num[start] + num[end];
        
            if (sum == target){
            System.out.println("Pair Found " + num[start] + " , " +num[end]);
            pairfound = true;
        }

        if(sum < target){
            start++;
        }else{
            end--;
        }
        }
        if (pairfound == false){
             System.out.println("No pair Found");
        }     
    }
}