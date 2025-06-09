package mypackage;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1==");
        int num1 = sc.nextInt();

        System.out.println("enter sign(+ - * /)");
        String sign = sc.next();

        System.out.print("Enter num2==");
        int num2 = sc.nextInt();

        int result = 0;
        
        switch (sign) {
            case "+":
                result = num1 + num2;
                break;
            
            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                result = num2 != 0 ? num1 / num2 : 0; // Avoid divide by zero
                break;


            default:
            System.out.println("invalid");
            return;
                
        }
        System.out.println("Result: " + result);




    }
    
}
