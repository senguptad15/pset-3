import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        int s;
        int t;
        int c;
        Scanner students = new Scanner(System.in);
        System.out.print("Students : ");
        s = students.nextInt();

        Scanner teachers = new Scanner(System.in);
        System.out.print("Teachers : ");
        t = teachers.nextInt();

        Scanner capacity = new Scanner(System.in);
        System.out.print("Capacity : ");
        c = capacity.nextInt();

        //math
        int tot = ((s+t+c)-1);
        int ppl = (tot/c);
        int overflow = ((s+t) % c);
        int busses = (int)ppl;
        System.out.println("Busses Required     : " + busses);
        System.out.println("Overflow Passengers : " + overflow);
    }
}