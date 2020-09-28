import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        float amt;
        Scanner amount = new Scanner(System.in);
        System.out.print("Amount : ");
        amt = amount.nextFloat();

        int q = (int)(amt/0.25);
        float qleftOver = (float)(amt % .25);

        int d = (int)(qleftOver/.1);
        float dleftOver = (float)(qleftOver % .10);

        int n = (int)(dleftOver/.05);
        float nleftOver = (float)(dleftOver % .05);

        int p = (int)(nleftOver/.01);

        System.out.println("Quarters : " + q);
        System.out.println("Dimes    : " + d);
        System.out.println("Nickels  : " + n);
        System.out.println("Pennies  : " + p);

    }
}