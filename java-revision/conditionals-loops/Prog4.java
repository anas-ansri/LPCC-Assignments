import java.util.Scanner;

//Sum Of N Numbers

public class Prog4 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter N : ");
    int n = in.nextInt();
    int result = sumOfNNumbers(n);
    System.out.print("Sum = " + result);
    in.close();
  }

  private static int sumOfNNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}
