import java.util.Scanner;

public class exercice4 {
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

        if (operation == '+'){
            result = number1 + number2 ;
        }else if (operation == '-') {
            result = number1 - number2;
        }else if (operation == '*') {
            result = number1 * number2;
        }else if (operation == '/') {
            result = number1 / number2;
        }

        System.out.print(number1+""+operation+""+number2+"="+result);



    }
}
