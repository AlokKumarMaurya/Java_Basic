package String;

import java.util.Scanner;

public class Input {
    public static  void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter");
        Character ch=sc.nextLine().charAt(0);
        System.out.printf("The name is %c",ch);
        System.out.println("Enter full name");
        String name=sc.nextLine();
        System.out.printf("The name is %s",name);

    }
}
