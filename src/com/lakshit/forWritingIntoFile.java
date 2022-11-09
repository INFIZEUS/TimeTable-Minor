package com.lakshit;

import java.io.FileWriter;
import java.io.IOException;

public class forWritingIntoFile {
    private static Object inputClass;

    public static void writingIntoFile(){

        // Content to be assigned to a file
        // Custom input just for illustration purposes
        String text = (String) inputClass;

        // Try block to check if exception occurs
        try {

            // Create a FileWriter object
            // to write in the file
            FileWriter fWriter = new FileWriter(
                    "D:/Programs/File Handling/newTT.txt");

            // Writing into file
            // Note: The content taken above inside the string

            fWriter.write(text);

            // Printing the contents of a file
            System.out.println(text);

            // Closing the file writing connection
            fWriter.close();

            // Display message for successful execution of
            // program on the console
            System.out.println(
                    "File is created successfully with the content.");
        }

        // Catch block to handle if exception occurs
        catch (IOException e) {

            // Print the exception
            System.out.print(e.getMessage());
        }
    }
}
