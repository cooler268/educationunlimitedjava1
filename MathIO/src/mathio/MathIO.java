package mathio;

import java.io.*;

public class MathIO {

    public static void main(String[] args) {

        String FILENAME = "numbers.txt";

        //Part 1
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line1 = "1.0\n2.0\n3.0\n4.0\n5.0\n";

            //here is where you should write your numbers to the file
            writer.write(line1);
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();

        }

        //Part 2
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            
            String l = reader.readLine();
            double sum = 0;
            while (l != null) {
                double currentLine = Double.parseDouble(l);
                sum+=currentLine;
                 l = reader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
