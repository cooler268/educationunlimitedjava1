package finalproject;

import java.util.Scanner;

public class FinalProject {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Calculator: Input values");
        System.out.println("Square Root = Z");
        Scanner S = new Scanner(System.in);
        String A = keyboard.nextLine();
        if (A.contains("*")) {
            int index = A.indexOf("*");
            String n1 = A.substring(0, index);
            String n2 = A.substring(index + 1, A.length());
            double d1 = Double.parseDouble(n1);
            double d2 = Double.parseDouble(n2);
            System.out.println(d1 * d2);
        } else if (A.contains("+")) {
            int index = A.indexOf("+");
            String n1 = A.substring(0, index);
            String n2 = A.substring(index + 1, A.length());
            double d1 = Double.parseDouble(n1);
            double d2 = Double.parseDouble(n2);
            System.out.println(d1 + d2);
        } else if (A.contains("-")) {
            int index = A.indexOf("-");
            String n1 = A.substring(0, index);
            String n2 = A.substring(index + 1, A.length());
            double d1 = Double.parseDouble(n1);
            double d2 = Double.parseDouble(n2);
            System.out.println(d1 - d2);
        } else if (A.contains("/")) {
            int index = A.indexOf("/");
            String n1 = A.substring(0, index);
            String n2 = A.substring(index + 1, A.length());
            double d1 = Double.parseDouble(n1);
            double d2 = Double.parseDouble(n2);
            System.out.println(d1 / d2);
        } else if (A.contains("^")) {
            int index = A.indexOf("^");
            String n1 = A.substring(0, index);
            String n2 = A.substring(index + 1, A.length());
            double d1 = Double.parseDouble(n1);
            double d2 = Double.parseDouble(n2);
            System.out.println(Math.pow(d1, d2));
        } else if (A.contains("Z")) {
            int index = A.indexOf("Z");
            String n1 = A.substring(index, A.length());
            double d1 = Double.parseDouble(n1);
            System.out.println(Math.sqrt(d1));
        }
    }

}
