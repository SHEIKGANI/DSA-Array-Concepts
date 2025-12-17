public class ReverseArr {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 10, 20, 30, 100, 4, 80, 40, 50};

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Swap numbers[left] and numbers[right]
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
    
}
