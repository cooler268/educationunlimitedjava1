/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles;
import java.util.Scanner;

public class Doubles {

    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         int a = (int) (Math.random() *5) + 1;
         System.out.println( "I'm thinking of a number between 1 and 6");
         int guess = Integer.parseInt(keyboard.nextLine());
         if (guess==a) {
             System.out.println("You got it!");
         }
         else {
             System.out.println("Nope! I was thinking of " + a );
         }
    }
    
}
