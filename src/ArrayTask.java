public class ArrayTask {
    public int secondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            }
            else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }
}
