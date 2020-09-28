import java.util.Locale;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        double s;
        double k;
        double f;
        double t;

        Scanner salary = new Scanner(System.in);
        System.out.print("Salary  : ");
        s = salary.nextDouble();

        Scanner k401 = new Scanner(System.in);
        System.out.print("401(k)  : ");
        k = k401.nextDouble();

        Scanner federal = new Scanner(System.in);
        System.out.print("Federal : ");
        f = federal.nextDouble();


        Scanner state = new Scanner(System.in);
        System.out.print("State   : ");
        t= state.nextDouble();
        double net = (s);
        k*=(0.01);
        f*=(0.01);
        t*=(0.01);
        net = (net-(k*net));
        net/=24;
        double tax = (net-(f*net));
        tax = (tax-(t*net));
        double finalCheck = tax;

        System.out.print("$");
        System.out.printf(Locale.US, "%,.2f", finalCheck);
        System.out.print(".");



    }
}