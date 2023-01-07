import java.util.Scanner;

// Find Ncr & Npr
public class Prog5 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter value of n = ");
    int n = in.nextInt();
    System.out.print("Enter value of r = ");
    int r = in.nextInt();
    int nPr = npr(n, r);
    int nCr = nPr / factorial(r);
    System.out.print("nCr = " + nCr);
    System.out.print("\nnPr = " + nPr);

    in.close();
  }

  private static int npr(int n, int r) {
    return factorial(n)/factorial(r-n);
  }

  private static int factorial(int n) {
    if (n < 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
