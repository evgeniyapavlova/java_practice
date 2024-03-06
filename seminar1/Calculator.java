package seminar1;

public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        char op = '+';
        int b = 3;
        int result = calculate(op, a, b);
        System.out.println(result);

    }

    public static int calculate(char op, int a, int b) {
        int res = 0;
        if (op == '+')
            res = a + b;
        else if (op == '-')
            res = a - b;
        else if (op == '*')
            res = a * b;
        else if (op == '/')
            res = a / b;
        else {
            System.out.printf("Некорректный оператор: '%c'", op);
            return 0;
        }

        return res;
    }
}
