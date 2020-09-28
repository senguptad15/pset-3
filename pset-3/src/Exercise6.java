import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        double wage;
        int mon;
        int tue;
        int wed;
        int thu;
        int fri;
        int sat;
        int sun;
        Scanner hwage = new Scanner(System.in);
        System.out.print("Wage      : ");
        wage = hwage.nextDouble();

        Scanner monday = new Scanner(System.in);
        System.out.print("Monday    : ");
        mon = monday.nextInt();

        Scanner tuesday = new Scanner(System.in);
        System.out.print("Tuesday   : ");
        tue = tuesday.nextInt();

        Scanner wednesday = new Scanner(System.in);
        System.out.print("Wednesday : ");
        wed = wednesday.nextInt();

        Scanner thursday = new Scanner(System.in);
        System.out.print("Thursday  : ");
        thu = thursday.nextInt();

        Scanner friday = new Scanner(System.in);
        System.out.print("Friday    : ");
        fri = friday.nextInt();

        Scanner saturday = new Scanner(System.in);
        System.out.print("Saturday  : ");
        sat = saturday.nextInt();

        Scanner sunday = new Scanner(System.in);
        System.out.print("Sunday    : ");
        sun = sunday.nextInt();

        double pay = (wage*(mon+tue+wed+thu+fri+sat+sun));

        System.out.print("$");
        System.out.printf("%.2f", pay);
        System.out.print(".");

    }
}