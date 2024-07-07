package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File("C:\\Users\\Teddy\\Documents\\GitHub\\FileIOJava\\Step4\\input.txt"));
        int sum = 0;
        String lineIn = String.valueOf(fileIn.nextInt());
        String[] input = lineIn.split(" ");

        while (fileIn.hasNext()) {
            for (int i = 0; i <= input.length -1; i++) {
                System.out.println("Running total" + " = " + (sum += fileIn.nextInt()));
            }

            // Print out a running total of all the
            // values in the input file.
        }
    }
}