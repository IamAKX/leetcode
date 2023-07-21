package leetcode.stack;

public class BalanceBracket {
    public static void main(String[] args) {
        String braces = "[(){()}]";
        checkBraceBalance(braces);
    }

    private static void checkBraceBalance(String braces) {

        char[] stack = new char[braces.length()]; // [(
        int top = -1;
        for (int i = 0; i < braces.length(); i++) {
            char ch = braces.charAt(i);
            if(ch =='[' || ch == '{' || ch =='(')
            {
                top++;
                stack[top] = ch;
            }
            else{
                if( top >= 0 && ((stack[top] == '[' && ch == ']' ) || (stack[top] == '{' && ch == '}' ) || (stack[top] == '(' && ch == ')' )))
                {
                    top--;
                }
            }
        }
        if(top == -1)
            System.out.println("Its balanced");
        else
            System.out.println("Its not balanced");
    }
}
