package Serie_1;

import java.util.Scanner;

public class exercice4_2 {
    public static void main(String[] args) {
        int number1,number2;
        double result = 0.0;
        char operation;
        Scanner clavier = new Scanner(System.in);

        System.out.print("Enter number1 :");
        number1 = clavier.nextInt();

        System.out.print("Enter number2 :");
        number2 = clavier.nextInt();

        System.out.print("Enter the operation to perform :");
        operation = clavier.next(".").charAt(0);

        switch (operation){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
        }

        System.out.print(number1+""+operation+""+number2+"="+result);


    }
}
