public class ArrInsert {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6};
        int [] newArr = new int [num.length+1];

        for (int i = 0 ; i < num.length; i++){
            newArr[i]=num[i];
        }

        newArr[6] = 7;

        for (int val:newArr){
            System.out.println(val);
        }
    }
}
