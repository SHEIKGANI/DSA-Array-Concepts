public class ArrDelete {
    public static void main(String[] args) {
        
       int value [] = {1,2,3,4,5,6};

       ////Deleting End element in array
       int newVal [] = new int[value.length-1];

       for (int i = 0 ; i < value.length-1 ; i++){
        newVal[i] = value[i]; 
       }

       for (int val : newVal){
        System.out.println(val);
       }

    ///////Deleting the first element in array////////// 
    // for(int i = 1; i< value.length;i++){
    //     newVal[i-1]= value[i];
    // }
    // for(int val : newVal){
    //     System.out.println(val);
    // }
    }
}
