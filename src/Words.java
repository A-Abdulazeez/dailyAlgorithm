public class Words {

    public int lengthOfLastWord(String input) {
        String[] words = input.split(" ");
        int count = words[words.length - 1].length();

        return count;
    }
}
