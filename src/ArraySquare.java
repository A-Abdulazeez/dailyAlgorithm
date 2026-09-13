public class ArraySquare {
    public int [] arraySquare (int [] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = numbers[index] * numbers[index];
        }
        return numbers;
    }
}
