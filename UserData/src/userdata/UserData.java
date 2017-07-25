/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdata;
import java.util.Scanner;
public class UserData {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
       String name = keyboard.nextLine();
       System.out.println("What is your age?");
       int age = Integer.parseInt(keyboard.nextLine());
       System.out.println("What is your birth Month?");
       String month = keyboard.nextLine();
       System.out.println("What is your birthday?");
       int day = Integer.parseInt(keyboard.nextLine());
       System.out.println("What is your birth year");
       int year = Integer.parseInt(keyboard.nextLine());
       System.out.println("What is your Favorite Book?");
       String Book = keyboard.nextLine();
       System.out.println("Where is your Hometown?");
       String Hometown = keyboard.nextLine();
       System.out.println("What is your Lucky Number?");
       double number = Double.parseDouble(keyboard.nextLine());
       System.out.println("What is your Shoe size?");
       double shoesize = Double.parseDouble(keyboard.nextLine());
       System.out.println("On a scale of 1-5, how excited are you to learn Java?");
       double excitement = Double.parseDouble(keyboard.nextLine());
       System.out.println("What is one cool fact about you?");
       String Fact = keyboard.nextLine();
       
       System.out.println(name + ",age" + age + ", was born on" + month + day + "," + year + ".From" + Hometown + name + "has lucky number" + number + "and a shoe size of" + shoesize + "." + "On a scale of 1 to 5" + name + "is this excited to learn about Java:" + excitement + "!" + "A fun fact about" + name + "is:" + Fact);
       
     int OldAge = age + 5;
     boolean dayofmonth = age == day;
     boolean birthyear = year/2000 > 1;
     double ssmultiplied = shoesize*excitement;
     
     System.out.println("In 5 years you will be " + OldAge);
     System.out.println("Your age is equal to your birthday " + dayofmonth);
     System.out.println("You birth year divided by 2000 is greater than 1 " + birthyear);
     System.out.println("Your shoe size multiplied by your excitement " + ssmultiplied);
     
             
       
       
    }
    
}
