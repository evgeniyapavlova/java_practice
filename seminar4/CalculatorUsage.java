package seminar4;

public class CalculatorUsage {
    public static void main(String[] args) {
        int a = 3;
        char op = '+';
        int b = 7;
        int c = 4;
        char op2 = '+';
        int d = 7;
        char undo = '<';
        Calculator calculator = new Calculator();
        float result = calculator.calculate(op, a, b);
        System.out.println(result);
        float result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        float prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }

}
