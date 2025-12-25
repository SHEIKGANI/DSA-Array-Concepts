public class Selectionsort {
    public static void selectionsort(int [] arr){

        for(int i = 0 ; i<arr.length;i++){

            int midIndex = i;

            for(int j = i+1;j<arr.length;j++){

                if(arr[j]<arr[midIndex]){
                    midIndex = j;
                }
            }

            int temp = arr[i];
            arr[i]=arr[midIndex];
            arr[midIndex]=temp;
        }
    }
    public static void main(String[] args) {
        
        int [] num = {20,40,44,11,55,30};

        selectionsort(num);

        for (int val:num){
            System.out.println(val);
        }
    }
}
