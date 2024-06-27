
import java.util.Scanner;

public class matadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows do you want in the matrices?");
        int rows = sc.nextInt();
        System.out.println("How many columns do you want in the matrices?");
        int columns = sc.nextInt();
        
        int [][] matrix = new int [rows][columns];
        int [][] matrix2= new int [rows][columns];
        int [][] answer = new int [rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter the element of row %d and column %d \n", i+1, j+1);
                matrix [i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter the element of row %d and column %d \n", i+1, j+1);
                matrix2 [i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                answer[i][j]=matrix[i][j]+matrix2[i][j];
            }
        }
        System.out.println("The resultant answer of the sum of the matrices if given below: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%d\t", answer[i][j]);
            }
            System.out.println();
        }
    }
}
