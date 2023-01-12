import java.util.Date;
import java.awt.*;

/*
 Reference Types is a similar concept as in C++ but the difference is in java we create a reference type with new keyword and then instantiate the class i.e. create the object of the class
 */

public class Reference_Data_Type {
    public static void main(String[] args) {
        
        // Inbuilt class Date, here "now" is the object of class Date
        Date now = new Date();
        System.out.println(now);

        // "point1" and "point2" are the objects of class Point and here both "point1" and "point2" are storing the memory address of Point(1, 1);
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2; // This change is also reflected in "point2" as both of them are reference variables
        System.out.println(point2);
    }
}
