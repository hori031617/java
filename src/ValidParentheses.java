import java.util.Stack;

/**
 * 20.
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
class ValidParentheses {

    public static boolean isValid(String s){

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++){

            switch(s.charAt(i)){
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if(stack.isEmpty() || stack.pop() != s.charAt(i)){
                        return false;
                    }
                    break;
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args){
        // String s = "()[]{}";
        String s = "(]";
        // String s = "{[]}";
        // String s = "([)]";
        boolean result = isValid(s);
        System.out.println(result);
    }
    
}
