import java.util.Stack;

public class Solution_20 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[')
                stack.push(']');
            else if (s.charAt(i) == '{')
                stack.push('}');
            else if (s.charAt(i) == '(')
                stack.push(')');
            else if (stack.isEmpty() || stack.pop() != s.charAt(i))
                return false;

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution_20 obj = new Solution_20();
        System.out.println(obj.isValid("(]"));
    }

}
