package basics;
import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Prog7 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = in.nextLine();
    if (isPalindrome(str)) {
      System.out.print("The given string is a palindrome");
    } else {
      System.out.print("The given string is not a palindrome");
    }

    in.close();
  }

  public static boolean isPalindrome(String str) {
    int i = 0;
    int j = str.length() - 1;
    while(i < j){
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
  }
}
