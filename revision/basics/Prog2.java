package basics;
import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Prog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        if(name.isEmpty()){
            System.out.print("Please enter your name!! ");
        }else{
            System.out.print("Greetings! , " + name);
            
        }
        in.close();
    }
    
}
