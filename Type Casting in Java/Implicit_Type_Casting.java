/*
 * Casting means conversion of one data type to another

 * Casting is of two Types
          1) Implicit Casting
          2) Explicit Casting

  * byte > short > int > long > float > double
 */

public class Implicit_Type_Casting {
    public static void main(String[] args) {
        /*
         * This is an example of Implicit Casting
         * First the java compiler will look at the short type variable x and then try to convert it to an interger because we know that short type variables takes 2
           bytes and an integer takes 4 bytes, So it will create an unknown variable of type integer in an anonymous space
           and then copy the value of x to it and perform x + 2 and then assign that value to y
         */
        short x = 1;
        int y = x + 2;

        double a = 1.1;
        double b = a + 2;// evaluated as 1.1 + 2.0

        System.out.println(y);
        System.out.println(b);
    }
}
