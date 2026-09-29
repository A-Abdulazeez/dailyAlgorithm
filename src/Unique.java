import java.util.HashSet;

public class Unique {
    public boolean isUnique(String words) {
        if (words == null || words.length() == 0)
            return false;

        HashSet<Character> set = new HashSet<Character>();
        for (int index = 0; index < words.length(); index++) {
            if (set.contains(words.charAt(index)))
                return false;
            set.add(words.charAt(index));

        }
        return true;
    }

}
