public class String_Class {
    public static void main(String[] args) {
        /*  
         * This declaration comes under reference types that we are instantiating the
         * class
         */
        String message = new String("    Hello");

        /*
         * We can write the shorthand of the above declaration, this declaration is
         * still of Reference type even if we are writing is like a primitive
         * declaration.
         */
        String message1 = "    World";

        // Concatenation of Strings
        String mssg = message + message1;
        System.out.println(mssg);

        // Calculating the length of a string
        System.out.println(mssg.length());

        // Returning the index of the first occurence of the character or the string that we pass.
        System.out.println(mssg.indexOf("H"));

        // Replace function is used to replace one or more characters with something else, this method does not modifies our original string rather it returns a new string object
        System.out.println("Replaced String " + mssg.replace("Hello", "Hi"));
        System.out.println("Original String " + mssg);

        // To lowercase function converts each and every character in a string to lowercase and similar goes for uppercase
        System.out.println(mssg.toLowerCase());
        System.out.println(mssg.toUpperCase());

        // Trim function is used to remove unnecessary spaces inside our string
        System.out.println("Printing using Trim " + mssg.trim());
        System.out.println("Printing without using Trim " + mssg);

    }
}
