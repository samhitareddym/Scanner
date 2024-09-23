import java.util.Scanner;

import java.util.*;
public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String name =" "
        int age =0;
        String name = in.nextLine();
        System.out.println("Your name is:" + name);

        System.out.print("How old are you:");
        if (in.hasnextInt()) {
            age = in.nextInt();
            //in.nextLine();
            System.out.println("Your age is:" + age);
        } else {
            System.out.println("Your age should be a number");
            in.nextLine();


        System.out.println("What is your salary: ");
        if(in.hasnextDouble()){
            salary=in.nextDouble();
            in.nextLine();
            System.out.println("Your salary:"+ salary);
        }
        else {
            System.out.println("Your salary should be a number:");
            in.nextLine();
        }

        }
    }
}