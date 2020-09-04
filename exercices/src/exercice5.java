import java.util.Scanner;

public class exercice5 {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);

        System.out.print("enter the character: ");
        ch = input.next(".").charAt(0);

        cheq(ch);

    }

    public static void cheq(char ch) {
        if((ch>=65) && (ch<=90)){
            System.out.println(ch+" is an Uper-case character");
        }else if ((ch>=97) && (ch<=122)) {
            System.out.println(ch + " is an Lower-case character");
        }else
            System.out.println(ch+" is not an Alphabet character");
    }
}
