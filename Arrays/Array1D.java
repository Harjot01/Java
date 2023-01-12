import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

        // To take user input we have used Scanner class
        Scanner sc = new Scanner(System.in);

        /*
        Intiliazing array of integers of size 5, this one is the older way of
        declaring an array
        */
        int numbers[] = new int[5];

        // Newer way to initialize an array, this syntax is like C++
        int arr[] = { 1, 2, 3, 4, 5 }; 

        // Taking user input of the array using for loop
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sorting the array with Arrays class
        Arrays.sort(numbers);

        // Printing the Array using a for loop
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

        // We can also use Arrays class to return array elements as a string
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
