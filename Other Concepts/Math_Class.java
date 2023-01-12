public class Math_Class {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result); // rounding off to an integer

        int res = (int)Math.ceil(1.1F); // By default ceil function returns a double value so we have to Type Cast it to an integer
        System.out.println(res);

        // Max function returns maximum of two numbers and similary Min function
        int maximum = Math.max(1, 2);
        System.out.println(maximum);

        // Random method is used to generate random value
        int random = (int)(Math.random() * 100);
        System.out.println(random);
        
    }
}
