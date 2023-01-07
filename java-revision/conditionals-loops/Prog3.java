import java.util.Scanner;

//Compound Interest Java Program
// Compound Interest = P(1 + R/100)r
// Where,
// P is principal amount
// R is the rate and
// T is the time span

public class Prog3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter principal amount: ");
    double principal = in.nextDouble();
    System.out.print("Enter rate (%): ");
    double rate = in.nextDouble();
    System.out.print("Enter time span (in years): ");
    int time = in.nextInt();
    double result = compoundInterest(principal, rate, time);
    System.out.print("Compound interest = " + result);
    in.close();
  }

  private static double compoundInterest(
    double principal,
    double rate,
    int time
  ) {
    double result = principal;
    for (int i = 1; i <= time; i++) {
      result += (result * rate) / 100;
    }
    return result;
  }
}
