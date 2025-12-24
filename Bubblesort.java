public class Bubblesort {

    public  static void bubblesort(int [] arr){
        //arr length variable store
        int n = arr.length;
        //starting sort value is false
        boolean swapped = false;
        for(int i = 0 ; i < n-1 ; i++){
            swapped = false;
           for(int j = 0 ; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //arr[j] is empty
                    int temp = arr[j];
                    //replace empty arr[j] with arr[j+1] ; now arr[j+1] empty  
                    arr[j]=arr[j+1];
                    //replace arr[j+1] with temp(prev arr[j] value)
                    arr[j+1] = temp;
                    // array element become true it will swapped
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {20,10,40,60,30,5};
        bubblesort(num);
        for(int val:num){
            System.out.println(val);
        }
        
    }
}
