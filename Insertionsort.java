public class Insertionsort {
    public static void insertionsort(int [] arr){
        for (int i = 1; i < arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;

        }
    }

    public static void main(String[] args) {
        
        int [] num ={5,3,4,1,2};

        insertionsort(num);

        for(int val:num){
            System.out.println(val);
        }
    }
}
