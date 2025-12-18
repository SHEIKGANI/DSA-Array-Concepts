public class DuplicateNum {
    public static void main(String[] args) {
        int [] num = {1,2,2,3,3,4,5,6,6,7,9,8,8};

        for(int i = 0 ; i<num.length-1; i++){
            if(num[i]==num[i+1]){
                System.out.println("Duplicate Num " + num[i]);
            }
        }
    }
}
