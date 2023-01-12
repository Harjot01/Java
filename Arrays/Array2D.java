import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        // Using Scanner class to take user input
        Scanner sc = new Scanner(System.in);

        // Creating a matrix of size 2 x 3
        int numbers[][] = new int[2][3]; 


        // Taking the user input of the array using for loop
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Displaying the array elements using a for loop
        System.out.println("Displaying the array elements using a for loop");
        System.out.println("Elements of the array are");
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * Displaying array elements using Arrays class, now normal
          Arrays.toString() function won't work instead we have to use
          Arrays.deepToString() function
         */
        System.out.println("Displaying the array elements using Arrays class");
        System.out.println(Arrays.deepToString(numbers));
        sc.close();
    }
}
