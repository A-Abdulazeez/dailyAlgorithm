public class Compress {

    public String compress(String words) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int index = 1; index < words.length(); index++) {
            if (words.charAt(index) ==  words.charAt(index - 1)) {
                count++;
            }
            else  {
                result.append(words.charAt(index -1));
                result.append(count);
                count = 1;
            }
        }

        result.append(words.charAt(words.length() - 1));
        result.append(count);

        return result.toString();

    }

    static void main() {
        Compress compress = new Compress();
        System.out.println(compress.compress("abcaa"));
    }
}
