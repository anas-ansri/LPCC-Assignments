import java.util.Scanner;

// 1. Calculate Average Of N Numbers

public class Prog1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = in.nextInt();
        int[] arr = generateArray(N);
        double result = average(arr);
        System.out.print("Average is " + result);
        in.close();
    }

    private static double average(int[] arr) {
        int sum = 0;
        int length = arr.length;
        for(int i=0; i < length; i++){
            sum += arr[i];
        }
        return sum/length;
    }

    private static int[] generateArray(int n) {
        int[] arr = new int[n];
        for(int i=0; i < n; i++ ){
            arr[i] = i+1;
        }
        return arr;
    }
    
}
