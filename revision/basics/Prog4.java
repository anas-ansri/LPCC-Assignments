package basics;
import java.util.Scanner;


// Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)
public class Prog4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter oprand 1 : ");
        double op1 = in.nextDouble();
        System.out.print("Enter oprand 2 : ");
        double op2 = in.nextDouble();
        System.out.print("Enter the operetion (+, -, *, /): ");
        String op = in.nextLine();
        double result = calculate(op1, op2, op);
        System.out.print("Result :" + result);



        in.close();
    }

    public static double calculate(double op1, double op2, String op){
        switch(op){
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default:
                return -1111111111111.1;
        }
    }
    
}
