public class ArrSpecficval {
    public static void main(String[] args) {
        // int [] num = {10,20,40,30,29,50};

        // int [] newArr = new int [num.length+1];

        // int indextoInsert  = 2;

        // int valuetoInsert = 25;

        // for ( int i = 0; i < indextoInsert ; i++){
        //     newArr[i] = num[i];
        // }

        // newArr[2] = valuetoInsert;

        // for ( int i = indextoInsert ; i <num.length ;i++){
        //     newArr[i+1]= num[i];
        // }

        // for (int val: newArr){
        //     System.out.println(val);
        // }


        int [] num = {10,20,40,30,29,50};

        int [] newArr = new int [num.length-1];

        int indextoInsert  = 2;

        for ( int i = 0; i < indextoInsert ; i++){
            newArr[i] = num[i];
        }

        for ( int i = indextoInsert ; i <num.length ;i++){
            newArr[i-1]= num[i];
        }

        for (int val: newArr){
            System.out.println(val);
        }
    }
}
