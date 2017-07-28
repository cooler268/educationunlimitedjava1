package highorlow;
import java.util.Scanner;
public class HighOrLow {


    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int a = (int) (Math.random() * 100) + 1;
    System.out.println("I'm thinking of a number between 1 and 100");
    int guess = Integer.parseInt(keyboard.nextLine());
    if (guess == a) {
            System.out.println("You got it!");
    } else {
        if (guess < a) {
            System.out.println("You are too low");
        } else {
            System.out.println("You are too high");
        }
    } if (guess != a) {
        
        }
    }
    }
    
