import java.util.Objects;

public class Parenthesis {

    public boolean isValidParenthesis(String input) {
        StringBuilder sb = new StringBuilder(input);

        for (int index = 0; index < sb.length(); index++) {
            char begin =  sb.charAt();
            char end =  sb.charAt(index + 1);

            if (begin != end) {
                return false;
            }
        }
        return true;
    }
    
}