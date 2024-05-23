package seminar4;

import java.util.Stack;

// В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
// Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.

public class Calculator {

    private Stack<Integer> st = new Stack<>();

    public float calculate(char op, int a, int b) {
        int res = 0;

        if (op == '+')
            res = a + b;
        else if (op == '-')
            res = a - b;
        else if (op == '*')
            res = a * b;
        else if (op == '/')
            res = a / b;

        if (op != '<') {
            st.push(res);
        }

        if (op == '<') {
            st.pop();
            return st.peek();
        }

        return res;
    }
}
