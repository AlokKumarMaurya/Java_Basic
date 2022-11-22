package percenageCalculaor;

import java.util.Scanner;

public class Marks {
    public static void main(String[] ags) {
        int sub1;
        int sub;
        int sub3;
        int sub4;
        int sub5;
        double total;
        int marks;
        double reslut;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter marks of sub1");
        sub1 = sc.nextInt();
        System.out.printf("Enter marks of sub");
        sub = sc.nextInt();
        System.out.printf("Enter marks of sub3");
        sub3 = sc.nextInt();
        System.out.printf("Enter marks of sub4");
        sub4 = sc.nextInt();
        System.out.printf("Enter marks of sub5");
        sub5 = sc.nextInt();
        System.out.printf("Enter total marks of all sub");
        total = sc.nextInt();
//        System.out.printf("total marks"+sub+sub1+sub3+sub4+sub5);
//        System.out.printf("total" + total*5);
        marks = sub + sub1 + sub3 + sub4 + sub5;
        System.out.println(marks);
        total = total * 5;
        System.out.println(total);
        reslut = marks / total;
        System.out.print(reslut*100);
    }
}

