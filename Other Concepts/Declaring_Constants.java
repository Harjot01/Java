public class Declaring_Constants {
    public static void main(String[] args) {
        // This value won't change
        final float pi = 3.14F;
        // pi = 3; This statement throws an error as we have declared pi as a constant
        System.out.println("The value of pi is " + pi);
    }
}
