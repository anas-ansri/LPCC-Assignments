package basics;
import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.
public class Prog3 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter principle balance: ");
        double principal = in.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = in.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double interest = in.nextDouble();
        double finalAmount = (principal * time * interest )/ 100;
        System.out.print("Simple interest for given data is : " + finalAmount);
        in.close();

    }
}
