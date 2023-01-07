package basics;
import java.util.Scanner;;
//Write a program to print whether a number is even or odd, also take
// input from the user.
public class Prog1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a  = in.nextInt();
        if(a % 2 == 0){
            System.out.print("\nNumber is even");
        }else{
            System.out.print("\nNumber is odd");
        }
        in.close();
    }
}
