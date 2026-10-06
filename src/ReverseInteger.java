public class ReverseInteger {

    public int reverse(int number) {
        int result = 0;

        while (number != 0) {
            int temp = number % 10;
            number = number / 10;

            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE) return 0;

        result =  result * 10 + temp;
        }

        return result;
    }

    public boolean intPalindrome(int number) {
        int result = 0;
        int original = number;
        if (original == 0 || original < 10) return true;

        while (original != 0 ) {
            int temp = original % 10;
            original = original / 10;

            result = result * 10 + temp;
        }
            if (result == number) return true;
        return false;

    }

}
