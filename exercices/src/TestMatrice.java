import java.util.Scanner;

public class TestMatrice {
    public static void main(String[] args) {
        //this a a constant
        final int N = 3;
        final int M=3;
        //variable declaration
        double [][] Mat = new double[N][M];
        int i,j;
        double max;
        boolean estDecroissant = true;
        Scanner input = new Scanner(System.in);

        //Fill the Matrix
        for (i=0;i<N;i++){
            for (j=0;j<M;j++){
                System.out.print("Matrice ["+i+"]["+j+"] : ");
                Mat[i][j] = input.nextDouble();
            }
        }
        //test if the matrix is in descending order or not
        max=Mat[0][0];
        i=0; j=1;
        while ((i<N) && (estDecroissant == true)){
            while (j<M){
                if (Mat[i][j] > max){
                    estDecroissant = false;
                    break;
                }
                max=Mat[i][j];
                j++;
            }
            j=0;
            i++;
        }
        //write the result of the test here
        if (estDecroissant == true){
            System.out.print("La matrice est ordonee dans l'ordre decroissant");
        }else
            System.out.print("La matrice n'est pas ordonee dans l'ordre decroissant");

    }
}
