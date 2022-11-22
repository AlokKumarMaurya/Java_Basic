package String;

import java.util.Scanner;

public class Functions {
    public static void main(String[] a) {
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        ///return the lenght of the string
        int len = name.length();
        System.out.printf("The name is %s and its lenght is %d",name,len);
        ///return all the letter in upper case
        System.out.println(name.toUpperCase());
        ///return all the letter in lowe case
        System.out.println(name.toLowerCase());
        ///remove spaces
        String x="   asasa sas    sasa  ";
        System.out.println(x.trim());
        ///return subString
        System.out.println(x.substring(-2,108));
        */
        //replace method
   String data="aaaa sss ddd dd";
   String ab=data.replace("aa","b");
        System.out.println(ab);
        System.out.println(data);
        //return value at that index
        System.out.println(data.charAt(3));
        ///return the index of the first found sub string
        System.out.println(data.indexOf("asass"));
    }
}
