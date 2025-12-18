public class MissingNum {
    public static void main(String[] args) {
        int num [] = {1,2,3,4,6,7,8,9};

        int n = num.length+1;

        int sum = (n * (n + 1)/2);

        int Actualsum = 0;

        for (int i =0 ; i<num.length ; i++){
            Actualsum = Actualsum + num[i];
        }

        int diff = sum - Actualsum;

        System.out.println(" Missing Number is " + diff);
    }
}
