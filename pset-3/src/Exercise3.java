import java.util.Locale;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        double x;
        double y;
        Scanner height = new Scanner(System.in);
        System.out.print("Height : ");
        x = height.nextDouble();
        Scanner width = new Scanner(System.in);
        System.out.print("Width : ");
        y = width.nextDouble();

        double mm = 25.4;
        //inches to millimeters(area)
        double a = (x*mm)*(y*mm);
        System.out.printf(Locale.US,"%,.2f", a);
        System.out.print(" square millimeters.");
    }
}