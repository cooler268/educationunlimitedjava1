package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;

        System.out.println("Here comes a quiz. No cheating!");

        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        } else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }

        System.out.println("Your score is " + rightAnswers + " out of 1 question.");

        System.out.println("Question 2: What is the integral of (x^3+1)/2sin^2x+cos2x");
        System.out.println("\tA) sin(2x)+((x^3+1)(sin^2x))/2+C");
        System.out.println("\tB) cos(2x)+((x^2+1)(sin^2x))/2+C");
        System.out.println("\tC) cos(2x)+((x^3+1)(sin^2x))/2+C");
        System.out.println("\tD) sin(2x)+((x^3+1)(sin^2x))/2+C");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        } else {
            System.out.println("Sorry, the answer is cos(2x)+((x^3+1)(sin^2x))/2+C");

        }

        System.out.println("Your score is " + rightAnswers + " out of 2 questions.");

        System.out.println("Question 3: Which king established the Act of Supremacy, successfully separating his country from the rest of Catholic Christianity in Europe?");
        System.out.println("\tA) King Henry VIII");
        System.out.println("\tB) King Charles I");
        System.out.println("\tC) King James I");
        System.out.println("\tD) King Louis XVI");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        } else {
            System.out.println("Sorry, the answer is King Henry VIII");

        }

        System.out.println("Your score is " + rightAnswers + " out of 3 questions");

        System.out.println("Question 4: A 0.1326g sample of magnesium was burned in a bomb calorimeter. The total heat capacity of the calorimeter plus water was 5,760J/C. If the tempreature rise of the calorimeter with water was 0.570C, calculate the enthalpy of combustion of magnesium.");
        System.out.println("\tA) -3280kJ/mol");
        System.out.println("\tB) -602kJ");
        System.out.println("\tC) -24.8kJ/mol");
        System.out.println("\tD) 435kJ/mol");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        } else {
            System.out.println("Sorry, the answer is -602kJ/mol");
        }
        System.out.println("Your score is " + rightAnswers + " out of 4 questions");

        System.out.println("Question 5: What does int stand for in java?");
        System.out.println("\tA) integral");
        System.out.println("\tB) integrity");
        System.out.println("\tC) intensive");
        System.out.println("\tD) integer");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        } else {
            System.out.println("Sorry, the answer is integer");
        }
        System.out.println("Your score is " + rightAnswers + " out of 5 questions");

        System.out.println("Question 6: What is Albert Camus solution to his constructed situation of the Myth of Sisyphus?");
        System.out.println("\tA) One should believe in religion");
        System.out.println("\tB) One should deny all rationality");
        System.out.println("\tC) One should commit suicide");
        System.out.println("\tD) One should be content in the absurdity of his/her life");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        } else {
            System.out.println("Sorry, the answer is One should be content in the absurdity of his/her life");
        }
        System.out.println("Your score is " + rightAnswers + " out of 6 questions");
    }
}
