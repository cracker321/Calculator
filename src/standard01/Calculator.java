package standard01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        double num1, num2;
        String operator;
        Scanner input = new Scanner(System.in);
        num1 = input.nextDouble();
        operator = input.next();
        num2 = input.nextDouble();

        if(operator.equals("+")) {
            System.out.println(num1+num2);
        }
        if(operator.equals("-")) {
            System.out.println(num1-num2);
        }
        if(operator.equals("*")) {
            System.out.println(num1*num2);
        }
        if(operator.equals("/")) {
            System.out.println(num1/num2);
        }
    }
}

