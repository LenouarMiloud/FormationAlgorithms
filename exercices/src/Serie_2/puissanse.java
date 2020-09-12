package Serie_2;

import java.util.Scanner;

public class puissanse {
    public static void main(String[] args) {
       double B,base;
       int P;
       Scanner input = new Scanner(System.in);

       System.out.print("B = ");
       B = input.nextDouble();
       System.out.print("P = ");
       P = input.nextInt();

       base = B;

       for (int i=0;i<P-1;i++){
           base = base * B;
       }

       System.out.println("B puissance P = "+base);

    }
}
