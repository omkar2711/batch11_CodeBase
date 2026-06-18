import java.util.Stack;

public class validParanthesis {
    boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;

                if ((c == '}' && st.pop() != '{') ||
                        (c == ']' && st.pop() != '[') ||
                        (c == ')' && st.pop() != '(')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[({})]";
        validParanthesis vl = new validParanthesis();

        System.out.println(vl.isValid(s));
    }
}
