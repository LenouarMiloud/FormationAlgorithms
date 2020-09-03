import java.util.Scanner;

public class problemMatrice {
    public static void main(String[] args) {
       int A[][] = new int[4][2];
       int B[][] = new int[2][3];
       int C[][] = new int[4][3];

       Scanner input = new Scanner(System.in);

       int i,j,k,sum;

       //read the 1st Matrix
       System.out.println("Matrice A ");
       System.out.println("==============");

       for (i=0;i<4;i++){
           for (j=0;j<2;j++){
               System.out.print("A["+i+"]["+j+"] :");
               A[i][j] = input.nextInt();
           }
       }
       //read the 2nd Matrix
        System.out.println("Matrice B ");
        System.out.println("==============");

        for (i=0;i<2;i++){
            for (j=0;j<3;j++){
                System.out.print("B["+i+"]["+j+"] :");
                B[i][j] = input.nextInt();
            }
        }
        //put the multiplication of 2 matrix in new one
        sum=0;
        for (i=0;i<4;i++){
            for (j=0;j<3;j++){
                for (k=0;k<2;k++){
                    sum = sum + A[i][k] * B[k][j];
                }
                C[i][j] = sum;
                sum = 0;
            }
        }

        //print the result of multiplication
        System.out.println("Matrice C ");
        System.out.println("==============");

        for (i=0;i<4;i++){
            for (j=0;j<3;j++){
                System.out.println("C["+i+"]["+j+"] :"+C[i][j]);
            }
        }

    }
}
