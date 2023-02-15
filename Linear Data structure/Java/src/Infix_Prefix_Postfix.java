public class Infix_Prefix_Postfix {
    char[] stack;
    int top;
    int capacity;

    Infix_Prefix_Postfix(int var1) {
        this.capacity = var1;
        this.stack = new char[this.capacity];
        this.top = -1;
    }

    boolean isempty() {
        return this.top == -1;
    }

    boolean isFull() {
        return this.top == this.capacity - 1;
    }

    void push(char var1) {
        if (this.isFull()) {
            System.out.println("Unable to  Push");
        } else {
            this.stack[++this.top] = var1;
        }
    }

    void pop() {
        if (this.isempty()) {
            System.out.println("Unable to Pop");
        } else {
            --this.top;
        }
    }

    char peek() {
        return this.stack[this.top];
    }

    int precedence(char var1) {
        if (var1 == '^') {
            return 3;
        } else if (var1 != '*' && var1 != '/') {
            return var1 != '+' && var1 != '-' ? 0 : 1;
        } else {
            return 2;
        }
    }
    String reverse(String var1) {
        StringBuilder var2 = new StringBuilder();

        for(int var3 = var1.length() - 1; var3 >= 0; --var3) {
            var2.append(var1.charAt(var3));
        }

        return var2.toString();
    }

    void InfixToPostifx(String var1) {
        StringBuilder var2 = new StringBuilder();

        for(int var3 = 0; var3 < var1.length(); ++var3) {
            char var4 = var1.charAt(var3);
            if (Character.isLetter(var4)) {
                var2.append(var4);
            } else if (var4 == '(') {
                this.push(var4);
            } else if (var4 == ')') {
                while(this.top != -1 && this.peek() != '(') {
                    var2.append(this.peek());
                    this.pop();
                }

                if (this.top != -1) {
                    this.pop();
                }
            } else {
                while(this.top != -1 && this.precedence(var4) <= this.precedence(this.peek()) && this.peek() != '(') {
                    var2.append(this.peek());
                    this.pop();
                }

                this.push(var4);
            }
        }

        while(this.top != -1) {
            var2.append(this.peek());
            this.pop();
        }

        System.out.println("Postfix :- " + var2);
    }

    void InfixToPrefix(String var1)
    {
        String var2 = this.reverse(var1);
        StringBuilder var3 = new StringBuilder();
        String var4 = "";

        for(int var5 = 0; var5 < var2.length(); ++var5)
        {
            char var6 = var2.charAt(var5);
            if (Character.isLetter(var6))
            {
                var3.append(var6);
            }
            else if (var6 == ')')
            {
                this.push(var6);
            }
            else if (var6 == '(')
            {
                while(this.top != -1 && this.peek() != ')')
                {
                    var3.append(this.peek());
                    this.pop();
                }

                if (this.top != -1)
                {
                    this.pop();
                }
            } else
            {
                while(this.top != -1 && this.precedence(var6) >= this.precedence(this.peek()) && this.peek() != ')') {
                    var3.append(this.peek());
                    this.pop();
                }

                this.push(var6);
            }
        }
        while(this.top != -1)
        {
            var3.append(this.peek());
            this.pop();
        }
        var4 = this.reverse(var3.toString());
        System.out.println("Prefix :- " + var4);
    }
    public static void main(String[] var0) {
        Infix_Prefix_Postfix var1 = new Infix_Prefix_Postfix(15);
        String var2 = "((A-(B+C))*D)^(E+F)";
        var1.InfixToPostifx(var2);
        var1.InfixToPrefix(var2);
    }
}
