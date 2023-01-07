package basics;
import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.

public class Prog6 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter n to calculate Fibonacci Series: ");
    int n = in.nextInt();
    Prog6 obj1 = new Prog6();
    obj1.printFibonacciSeries(n);
    in.close();
  }

  void printFibonacciSeries(int n) {
    int a = 0;
    int b = 1;
    int sum = 0;
    System.out.print(a + ", ");
    System.out.print(b + ", ");
    while (sum < n) {
      sum = a + b;
      System.out.print(sum + ", ");
      a = b;
      b = sum;
    }
  }
}
