package BalancedParantheses;

public class BalancedParentheses {

    public static void main(String[] args) {
        String expr = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < expr.length(); i++) {
            if(stack.isEmpty() && expr.charAt(i)==')'){
                System.out.println("not balanced");
                return;
            }
            if (expr.charAt(i) == '(')
                stack.push(expr.charAt(i));
            else if (expr.charAt(i) == ')')
                stack.pop();
        }
        if(stack.isEmpty()) System.out.println("is balanced");
        else System.out.println("not balanced");
    }
}
