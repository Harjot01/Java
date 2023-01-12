import java.text.NumberFormat;

public class Number_Formatting {
    public static void main(String[] args){
        /* NumberFormat is the abstract base class for all number formats. This class provides the interface for formatting and parsing numbers. 

        As it is an abstract class so we cannot instantiate it with an object
        */

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String res = percent.format(0.1);

        // This syntax is method chaining
        // String res = NumberFormat.getPercentInstance().format(0.1); 
        System.out.println(res);

    }
}
