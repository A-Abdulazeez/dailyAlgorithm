public class AnotherPalindrome {

    public String transformAndMakePalindrome(String words) {
        for (int index = 0; index < words.length(); index++) {
            String end = words.substring(index);

            if(isPalindrome(end)){
                String start = words.substring(0,index);
                return words + new StringBuilder(start).reverse();
            }
        }

        return words;
    }

    public boolean isPalindrome(String words) {
        return words.equals(new  StringBuilder(words).reverse().toString());
    }

}
