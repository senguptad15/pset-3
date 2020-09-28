import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        double hw1;
        double hw2;
        double hw3;
        double q1;
        double q2;
        double t1;
        Scanner homework1 = new Scanner(System.in);
        System.out.print("Homework 1 : ");
        hw1 = homework1.nextDouble();

        Scanner homework2 = new Scanner(System.in);
        System.out.print("Homework 2 : ");
        hw2 = homework2.nextDouble();

        Scanner homework3 = new Scanner(System.in);
        System.out.print("Homework 3 : ");
        hw3 = homework3.nextDouble();

        Scanner quiz1 = new Scanner(System.in);
        System.out.print("Quiz 1     : ");
        q1 =quiz1.nextDouble();

        Scanner quiz2 = new Scanner(System.in);
        System.out.print("Quiz 2     : ");
        q2 = quiz2.nextDouble();

        Scanner test1 = new Scanner(System.in);
        System.out.print("Test 1     : ");
        t1 = test1.nextDouble();

        double hwAvg = (hw1+hw2+hw3)/3;
        double qAvg = (q1+q2)/2;
        double tAvg = (t1);
        double grade = ((hwAvg*15) + (qAvg*35) + (tAvg*50))/100;
        System.out.printf("%.2f",grade);
        System.out.print("%");
        System.out.print(".");

    }
}