package Serie_1;

import java.util.Scanner;

public class exercice1 {

    public static void main(String[] args) {
        int celsuis;
        double fahrenheit;
        Scanner clavier = new Scanner(System.in);

        System.out.print("Enter the value of Celsuis :");
        celsuis = clavier.nextInt();

        fahrenheit = (celsuis * 1.8 ) + 32;

        System.out.println("Fahrenheit = "+fahrenheit);

    }
}
