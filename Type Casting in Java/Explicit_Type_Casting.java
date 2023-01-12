public class Explicit_Type_Casting {
    public static void main(String[] args){

        // This is an example of Explicit Type Casting
        double x = 1.1;
        int y = (int)x + 2;

        /*
        If we try to Type Cast a string into an integer it will throw an error

        By default we cannot typecast a string to an integer, to do this we have to use Wrapper class in java
        */

        String number = "1";
        int calc = Integer.parseInt(number); // Type Casting from string to int
        System.out.println(calc);


        // Similarly in this way we can type cast to other data types explicitly.

        System.out.println(y);
    }
}
