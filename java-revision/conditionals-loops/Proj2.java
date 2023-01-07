import java.util.Scanner;

//Factorial Program In Java
public class Proj2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int n = in.nextInt();
        int result = factorial(n);
        System.out.print("Result: "+n+ "! = "+ result);
        in.close();
    }


    //Using loops
    private static int factorial(int n) {
        int res = 1;
        for (int i = n; i >= 1; i--) {
            res *= i;
            
        }
        return res;
    }

    
    //Using recursion
    // private static int factorial(int n) {
    //     if(n <1){
    //         return 1;
    //     }
    //     return n * factorial(n -1);
    // }
    
}
