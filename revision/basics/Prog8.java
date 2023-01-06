package basics;
import java.util.Scanner;

//To find Armstrong Number between two given number.

public class Prog8 {

  public static void main(String[] args) {
    int a, b;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number :");
    a = in.nextInt();
    System.out.print("Enter second number :");
    b = in.nextInt();
    printArmstrongNumbers(a, b);
    in.close();
  }

  public static void printArmstrongNumbers(int a, int b) {
    for (int i = a; i <= b; i++) {
      if (isArmstrong(i)) {
        System.out.print(i + ", ");
      }
    }
  }

  public static boolean isArmstrong(int n) {
    int sum = 0;
    int temp = n;
    while (temp != 0) {
      int rem = temp % 10;
      sum += rem * rem * rem;
      temp /= 10;
    }
    if (sum == n) {
      return true;
    } else {
      return false;
    }
  }
}
