package p03;

import java.util.Stack;

public class Main {
    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (Character.isDigit(currentChar)) {
                int operand = currentChar - '0';
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    operand = operand * 10 + (expression.charAt(++i) - '0');
                }
                operandStack.push(operand);
            } else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(currentChar)) {
                    processOperation(operandStack, operatorStack);
                }
                operatorStack.push(currentChar);
            }
        }

        while (!operatorStack.isEmpty()) {
            processOperation(operandStack, operatorStack);
        }

        return operandStack.pop();
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    private static void processOperation(Stack<Integer> operandStack, Stack<Character> operatorStack) {
        int operand2 = operandStack.pop();
        int operand1 = operandStack.pop();
        char operator = operatorStack.pop();

        int result;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
        operandStack.push(result);
    }

    public static void main(String[] args) {
        String expression = "10+2*6";
        int result = evaluateExpression(expression);
        System.out.println("Output: " + result);
    }
}