package qa.course;

import java.util.Scanner;

public class WorkingWithConsole
{
 //   public static void print (String str)
 //   {
 //       System.out.println(str);
 //   }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scn.nextLine();
        System.out.println("Please enter your age:");
        int age = scn.nextInt();

        if (age < 18)
        {
            System.out.println( name + " is "+ age+ " years old and can NOT buy alcohol!");
        }
        else {
            System.out.println( name + " is "+ age+ " years old and can buy alcohol :)");
        }

    }


}
