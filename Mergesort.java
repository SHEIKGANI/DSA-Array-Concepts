public class Mergesort {
    public static void mergeSort(int [] arr,int leftIndex ,int rightIndex){
        //recurisve call//
        if(leftIndex < rightIndex){
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            mergeSort(arr, leftIndex, rightIndex);
            mergeSort(arr, leftIndex, rightIndex);
            merge(arr,leftIndex,midIndex,rightIndex);
        }
    }
    public static void merge(int [] arr,int leftIndex,int midIndex,int rightIndex){
        //measure the arr size
        int leftSize = midIndex - leftIndex + 1;
        int rightSize = rightIndex - midIndex ;
        //temp array
        int tempLeftArr [] = new int [leftSize];
        int tempRightArr [] = new int [rightSize];
        //copy original array into temp arr
        for (int i=0;i<leftIndex;i++){
            tempLeftArr[i] = arr[leftIndex+i];
        }
        for (int j=0;j<rightIndex;j++){
            tempRightArr[j] = arr[midIndex+1+j];
        }
        int i = 0 , j = 0 , mergeIndex = leftIndex;
        //element sorting//
        while(i < leftSize && j < rightSize){
            if(tempLeftArr[i]<=tempRightArr[j]){
                arr[mergeIndex]=tempLeftArr[i];
                i++;
            }else{
                arr[mergeIndex] = tempRightArr[j];
                j++;
            }
            mergeIndex++;
        }
        ///copying remaining element
        while(i < leftIndex){
            arr[mergeIndex]=tempLeftArr[i];
            i++;
            mergeIndex++;
        }
        while (j < rightIndex) {
            arr[mergeIndex]=tempRightArr[j];
            j++;
            mergeIndex++;
        }
    }
    public static void main(String[] args) {
        int [] num ={5,3,8,4};
        mergeSort(num, 0,num.length-1);
        for (int val : num){
            System.out.println(val);
        }
    }
}
