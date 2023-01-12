/*
 * Types of Primitive Data Types in Java
 * boolean
 * byte
 * char 
 * short
 * int 
 * long
 * float 
 * double
 */


public class Primitive_Data_Type {
    public static void main(String[] args) {
        /*
         By default it is an integer type even if we store it in a long variable so we
         have to specify a suffix 'L' inorder to make it long.
         */
        long viewCount = 3_123_456_789L;
        /*
        Similary by default the value is stored as double so we have to specify suffix 'F' inorder to make it float.
        */
        boolean isEligible = false;
        byte number = 20;
        char letter = 'A';
        float price = 10.99F;
        int age = 30;
        System.out.println(viewCount);
        System.out.println(isEligible);
        System.out.println(number);
        System.out.println(letter);
        System.out.println(price);
        System.out.println(age);
    }
}
