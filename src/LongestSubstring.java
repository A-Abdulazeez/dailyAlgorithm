import java.util.HashSet;

public class LongestSubstring {

    public int longestSubstringWithoutDuplicate(String input){
        HashSet<Character> result = new HashSet<>();

        for (int index = 0; index < input.length() -1 ; index++){
            result.add(input.charAt(index));
        }

        return result.size();
    }


}
