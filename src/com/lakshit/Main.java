package com.lakshit;

//import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // DEFAULT TIMETABLE STARTS HERE

        // Code to create a new file
//        File myFile = new File("timetable.txt");
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create this file.");
//            e.printStackTrace();
//        }

        // Code to write in a File
//        try {
//            FileWriter fileWriter = new FileWriter("timetable.txt");
//            fileWriter.write("This is our first message in this file.\nOkay Bye now.");
//            fileWriter.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Code to reading a file
        // DEFAULT TIMETABLE FROM "forWritingIntoFile.java"

        File myFile = new File("timetable.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line =sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Code to delete the File
//        File myFile = new File("timetable.txt");
//        if(myFile.delete()){
//            System.out.println("I have deleted " + myFile.getName());
//        } else {
//            System.out.println("Some problem occured in deleting the file.");
//        }
    }

    // METHOD FOR FACULTY INPUT

    public static String facultyInput() {
        Scanner sc = new Scanner(System.in);
        // For "input"

        String input;
        System.out.println("Cancel or Reschedule");
        input = sc.nextLine();

        return input;
    }

    // METHOD FOR GETTING SUBJECT CODE

    public static String subjectCode(){
        Scanner sc = new Scanner(System.in);
        // For "subCode"

        String subCode;
        System.out.println("Enter Subject Code: ");
        subCode = sc.nextLine();

        return subCode;
    }

    // METHOD FOR GETTING THE NEW TIME SLOTS
    // For getting start time
    public static String startTiming() {
        Scanner in = new Scanner(System.in);
        String startTime = in.nextLine();
        return startTime;
    }
    // For getting end time
    public static String endTiming() {
        Scanner in = new Scanner(System.in);
        String endTime = in.nextLine();
        return endTime;
    }


    // METHOD FOR UPDATION

    public static void update(){
        facultyInput();
        subjectCode();

        // Condition for updation
        if(facultyInput() == "cancel"){
            deletion();
        } else if(facultyInput() == "reschedule") {
            // Change the start and end timings
            // Replace line with the get timing values
            startTiming();
            endTiming();

//          File textFile = new File("myfile.txt");
//        try {
//            String data = FileUtils.readFileToString(textFile);
//            data = data.replace("user", "reader");
//            FileUtils.writeStringToFile(textFile, data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        }
    }

    // METHOD FOR DELETING A CLASS

    public static void deletion(){

    }
}
