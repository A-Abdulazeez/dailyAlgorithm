public class TwoSum {
    public int [] twoSum(int[] number, int target) {
        int [] result = {};

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == target) {
                    result = new int[]{i, j};
                }
            }
        }
        return result;

    }
}
