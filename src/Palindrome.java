public class Palindrome {
    public boolean palindrome(String input) {
        if (input == null || input.isBlank() || input.length() < 3)
            return false;

        return input.equals(new StringBuilder(input).reverse().toString()); //so the string builder turns the string into array and then reverse it with the .reverse() and then convert it back to string withe the tostring methpd
    }

}
