package Practice5;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter one or more expressions:");
        String line = in.nextLine();

        StringTokenizer expressionTokenizer = new StringTokenizer(line);

        while (expressionTokenizer.hasMoreTokens()) {
            String expression = expressionTokenizer.nextToken();

            StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

            try {
                String leftString = tokenizer.nextToken();
                String operator = tokenizer.nextToken();
                String rightString = tokenizer.nextToken();

                double leftOperand;
                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException nfe) {
                    System.out.println("Left operand \"" + leftString + "\" is not a number");
                    continue;
                }

                double rightOperand;
                try {
                    rightOperand = Double.parseDouble(rightString);
                } catch (NumberFormatException nfe) {
                    System.out.println("Right operand \"" + rightString + "\" is not a number");
                    continue;
                }

                double result;
                switch (operator) {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;
                    case "-":
                        result = leftOperand - rightOperand;
                        break;
                    case "*":
                        result = leftOperand * rightOperand;
                        break;
                    case "/":
                        if (rightOperand == 0.0) {
                            System.out.println("Cannot divide by zero in: " + expression);
                            continue;
                        }
                        result = leftOperand / rightOperand;
                        break;
                    default:
                        System.out.println("Unknown operator: " + operator);
                        continue;
                }

                System.out.println(expression + " = " + result);
            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax in expression: " + expression);
            }
        }

        in.close();
    }
}