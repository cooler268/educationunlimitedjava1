package forloopfun;

import java.util.Scanner;

public class ForLoopFun {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println("I love Java");
            
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        int variable = Integer.parseInt(keyboard.nextLine());
        for (int a = 0; a<variable; a++){
            System.out.println(a);
        
        }
        Scanner starting = new Scanner(System.in);
        System.out.println("Enter a starting number, ending number, and a number to count by");
        int x = Integer.parseInt(starting.nextLine());
        int y = Integer.parseInt(starting.nextLine());
        int z = Integer.parseInt(starting.nextLine());
        for (int b = x; b<z; b++){
            System.out.println(b);
            
        }
        
    }
    
}
