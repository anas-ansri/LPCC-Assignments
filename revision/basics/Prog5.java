package basics;
import java.util.Scanner;

// Take 2 numbers as input and print the largest number
public class Prog5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter secont number: ");
        int b = in.nextInt();
        int result = largest(a, b);
        System.out.print("\nLargest number is " + result);
        in.close();
    }

    public static int largest(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    
}
