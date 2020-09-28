import java.util.Locale;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        double x;
        double y;
        Scanner height = new Scanner(System.in);
        System.out.print("Height : ");
        x = height.nextDouble();
        Scanner width = new Scanner(System.in);
        System.out.print("Width : ");
        y = width.nextDouble();

        double cm = 2.54;
        //inches to millimeters(area)
        double p = (2*(x*cm))+(2*(y*cm));
        System.out.printf(Locale.US,"%,.2f", p);
        System.out.print(" centimeters.");
    }
}