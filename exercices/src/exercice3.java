import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        char ch;
        Scanner clavier = new Scanner(System.in);

        System.out.print("Enter the Char : ");
        ch = clavier.next(".").charAt(0);

        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ){
            System.out.println("the character "+ch+" is a vowel ");
        }else {
            System.out.println("the character "+ch+" is a Consanant ");
        }
        //End of the program
    }
}
