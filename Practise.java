import java.io.FileReader;
import java.io.FileReader;
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        try {
            FileReader fout = new FileReader("Priya.txt");
            Scanner sc = new Scanner(fout);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
            fout.close();
        } catch (Exception e) {
            System.out.println("Exception Occoured");
        }
    }
}