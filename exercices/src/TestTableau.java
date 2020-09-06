import java.util.Scanner;

public class TestTableau {
    public static void main(String[] args) {
        //variables declarations
        final int Table_length = 6;
        double [] T = new double[Table_length];
        Scanner input = new Scanner(System.in);
        double min;
        boolean estCroissant = true;

        //Read the first element in the table
        System.out.print("case [0] : ");
        T[0] = input.nextDouble();
        min = T[0];
        //read and compare each element with her predecessor
        for (int i=1;i<Table_length;i++){
            System.out.print("case["+i+"] : ");
            T[i] = input.nextDouble();
            if(min>T[i]){
                estCroissant = false;
            }
        }
        //test if the array is in ascending order or not
        if (estCroissant == true){
            System.out.println("le tableau est trie dans l'ordre croissant");
        }else
            System.out.println("le tableau n'est pas trie dans l'ordre croissant");

    }
}
