import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter no. of rows");
        int rows = scanner.nextInt();
        System.out.println("enter no. of columns");
        int columns = scanner.nextInt();


        //Declare a array

        int[][] array = new int[rows][columns];

        // take a input from arra=y

        System.out.println("enter the elements of array: ");
        for ( int i = 0 ; i < rows; i++) {
            for (int j = 0; j < columns; j++){
                System.out.println("elements [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Output the 2D array
        System.out.println("\n The entered 2D attay is:");
        for (int i = 0;i<rows; i++) {
            for ( int j = 0; j< columns;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
