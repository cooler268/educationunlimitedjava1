package challengeprojectsadventure;

import java.util.Scanner;

public class ChallengeProjectsAdventure {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Proceed to Room 1 or Room 2?");
        int room = Integer.parseInt(keyboard.nextLine());
        if (room == 1) {
            System.out.println("Proceed to Room 3 or Room 4?");
            int room1 = Integer.parseInt(keyboard.nextLine());
            if (room1 == 3) {
                System.out.println("Proceed to Room 5 or Room 6?");
                int room2 = Integer.parseInt(keyboard.nextLine());
                if (room2 == 5) {
                    System.out.println("Finished");

                } else {
                    System.out.println("Complete");
                }
            } else {
                System.out.println("Proceed to Room 5 or Room 6?");
                int room3 = Integer.parseInt(keyboard.nextLine());
                if (room3 == 5) {
                    System.out.println("Done");
                } else {
                    System.out.println("Finished");
                }
            }
        } else {
            System.out.println("Procced to Room 3 or Room 4?");
            int room4 = Integer.parseInt(keyboard.nextLine());
            if (room4 == 3) {
                System.out.println("Proceed to Room 5 or Room 6?");
                int room5 = Integer.parseInt(keyboard.nextLine());
                if (room5 == 5) {
                    System.out.println("Complete");

                } else {
                    System.out.println("End");

                }
            } else {
                System.out.println("Proceed to Room 5 or Room 6?");
                int room5 = Integer.parseInt(keyboard.nextLine());
                if (room5 == 5) {
                    System.out.println("End");
                } else {
                    System.out.println("Done");
                }
            }
        }

    }
}
