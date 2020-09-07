import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        int N,fact;
        Scanner input = new Scanner(System.in);
        // read the number
        System.out.print("Enter the value of N : ");
        N = input.nextInt();
        //initialize with 1
        fact = 1;
        //calculate the factorial with this simple loop
        for (int i=2;i<=N;i++){
            fact = fact * i;
        }
        //write the answer
        System.out.println("The Factorial of "+N+" = "+fact);

    }
}
