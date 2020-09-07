package Serie_1;

import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        int nb1,nb2,nb3;
        Scanner clavier = new Scanner(System.in);
        System.out.print("Enter the value of the 3 numbers :");
        nb1 = clavier.nextInt();
        nb2 = clavier.nextInt();
        nb3 = clavier.nextInt();
        //test the numbers
        if ((nb1>nb2) && (nb1>nb3)) {
            System.out.println(nb1+" is the bigest one");
        }else if ((nb2>nb1) && (nb2>nb3)){
            System.out.println(nb2+" is the bigest one");
        }else
            System.out.println(nb3+" is the bigest one");
        //end of the program
    }
}
