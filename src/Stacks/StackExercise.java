package Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackExercise {

    private final List<Character> LeftBrackets = Arrays.asList('<', '{', '[', '(');
    private final List<Character> RightBrackets = Arrays.asList('>', '}', ']', ')');

    public String ReverseString(String input) { //   O(n)
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();
        while (!stack.empty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
    
    public boolean BalancedExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);
            if (isRightBracket(ch)) {
                if (stack.empty())
                    return false;
                    
                var top = stack.pop();
                if(MatchBracket(ch, top)) return false;
            }
        }
        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return LeftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return RightBrackets.contains(ch);
    }

    private boolean MatchBracket(char left, char right) {
        return LeftBrackets.indexOf(left) == RightBrackets.indexOf(right);
    }
}

// (1 + 2))