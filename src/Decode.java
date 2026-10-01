import java.util.Stack;

public class Decode {

    public String reverseParentheses(String string) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char character : string.toCharArray()) {

            if (character == '(') {
                stack.push(current);
                current = new StringBuilder();

            }
            else if (character == ')') {
                current.reverse();
                StringBuilder previous = stack.pop();
                previous.append(current);

                current = previous;

            }

            else {
                current.append(character);
            }
        }

        return current.toString();
    }


}
