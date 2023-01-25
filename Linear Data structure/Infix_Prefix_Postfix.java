public class Infix_Prefix_Postfix {
    char[] stack;
    int top, capacity;

    Infix_Prefix_Postfix(int s) {
        capacity = s;
        stack = new char[capacity];
        top = -1;
    }

    boolean isempty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (top == capacity - 1)
            return true;
        else
            return false;
    }

    boolean push(char data) {
        if (isFull())
            return false;
        else {
            stack[++top] = data;
            return true;
        }
    }

    boolean pop() {
        if (isempty())
            return false;
        else {
            top--;
            return true;
        }
    }

    char peek() {
        return stack[top];
    }

    int precedence(char a) {
        if (a == '^')
            return 3;
        else if (a == '*' || a == '/')
            return 2;
        else if (a == '+' || a == '-')
            return 1;
        else
            return 0;
    }

    boolean isOperator(char ch) {
        if (ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '^')
            return true;
        else
            return false;
    }

    String reverse(String str) {
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }

    void InfixToPostifx(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (Character.isLetter(symbol))
                res += symbol;
            else if (symbol == '(')
                push(symbol);
            else if (symbol == ')') {
                while (top != -1 && peek() != '(') {
                    res += peek();
                    pop();
                }
                if (top != -1)
                    pop();
            } else {
                while (top != -1 && precedence(symbol) <= precedence(peek()) && peek() != '(') {
                    res += peek();
                    pop();
                }
                push(symbol);
            }
        }
        while (top != -1) {
            res += peek();
            pop();
        }
        System.out.println("Postfix :- "+res);
    }

    void InfixToPrefix(String str) {
        String rev_str = reverse(str);
        String res = "";
        String result = "";
        for (int i = 0; i < rev_str.length(); i++) {
            char symbol = rev_str.charAt(i);
            if (Character.isLetter(symbol))
                res += symbol;
            else if (symbol == ')')
                push(symbol);
            else if (symbol == '(') {
                while (top != -1 && peek() != ')') {
                    res += peek();
                    pop();
                }
                if (top != -1)
                    pop();
            } else {
                while (top != -1 && precedence(symbol) >= precedence(peek()) && peek() != ')') {
                    res += peek();
                    pop();
                }
                push(symbol);
            }
        }
        while (top != -1) {
            res += peek();
            pop();
        }
        result = reverse(res);
        System.out.println("Prefix :- "+result);
    }
    void PrefixToInfix(String str){
        
    }
    public static void main(String[] args) {
        Infix_Prefix_Postfix stack = new Infix_Prefix_Postfix(15);
        String str = "((A-(B+C))*D)^(E+F)";
        stack.InfixToPostifx(str);
        stack.InfixToPrefix(str);
    }
}
