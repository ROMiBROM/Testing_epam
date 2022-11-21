package org.example;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IncorrectFileNameException {
        boolean Work=true;
        while(Work) {
            double num1;
            double num2;
            double ans=0;
            char op;
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
            System.out.print("\nEnter an operator (+, -, *, /): ");
            op = reader.next().charAt(0);
            try{
            ans=calculate(num1,num2,op);}
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                continue;
            }
            System.out.print("\nThe result is given as follows:\n");
            System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
            System.out.println("Do you want to continue?(yes,no)");
            String Want = reader.next();
            if (Objects.equals(Want, "yes")) {

            } else {
                break;
            }
        }
    }
    public static double calculate(double num1,double num2,char operator) throws Exception {
        double ans=0;
            switch (operator) {
                case '+':
                    ans = num1 + num2;
                    return ans;
                case '-':
                    ans = num1 - num2;
                    return ans;
                case '*':
                    ans = num1 * num2;
                    return ans;
                case '/':
                    if (num2 == 0) {
                        throw new Exception("Error!Division by zero !");
                    } else {
                        ans = num1 / num2;
                        return ans;
                    }
                default:
                    throw new Exception("Error! Enter correct operator");
            }
    }
}
