/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeater;
import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println( "How many times will you want to repeat what you type?");
       int variable = Integer.parseInt(keyboard.nextLine());
       System.out.println("Enter a word you want to repeat?");
       String input = keyboard.nextLine();
       
       System.out.println("Here we go!");
       int count = 1;
       while (count < variable+1) {
           System.out.println(count++ + ". " + input);

       }
    }
    
}