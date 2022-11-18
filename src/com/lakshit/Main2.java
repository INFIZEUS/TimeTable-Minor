package com.lakshit;

/*  1. Run
 2. a) Print TimeTable b) Make Changes
3. If Clicked on make changes --> Menu driven --> a) Update b) Defer class
  4. else print default
 */

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.io.*;
import java.util.Scanner;

public class Main2 {

    // declaring variables and scanner Globally
//    public static ArrayList<String> Module = new ArrayList<>();
//    public static ArrayList<String> Batch = new ArrayList<>();
//    public static ArrayList<String> Faculty = new ArrayList<>();
//    public static ArrayList<Integer> RoomNo = new ArrayList<>();
//    public static ArrayList<String> startTime = new ArrayList<>();
//    public static ArrayList<String> endTime = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static int i = 0;
    public static String[] Module = new String[50];
    public static String[] Batch = new String[50];
    public static String[] Faculty = new String[50];
    public static String[] RoomNo = new String[50];
    public static String[] startTime = new String[50];
    public static String[] endTime = new String[50];


    public static void main(String[] args) {

//        System.out.println("Calling the function print...");
        // CALLING INPUT FUNCTION TO GET DEFAULT INPUTS
        input();

        //Writing default timetable in the text file
//        writingIntoTextFile();

        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println();
        System.out.println("1. Print Default TimeTable");
        System.out.println("2. Defer a Class");
        System.out.println("3. Reschedule a Class");

        int choice = in.nextInt();
        switch (choice) {
            case 1:  // printing default timetable
                printingFunc(); // reading the text file
                break;
            case 2: // deletion
                deletion();
                break;
            case 3: // Updating Function
                updateFunc();
                break;
            default:
                System.out.println("Invalid Number");
        }

    }


    // INPUT DEFAULT TIMETABLE
    public static void input() {
//        ArrayList<String> Module = new ArrayList<>();
//        ArrayList<String> Batch = new ArrayList<>();
//        ArrayList<String> Faculty = new ArrayList<>();
//        ArrayList<Integer> RoomNo = new ArrayList<>();
//        ArrayList<String> startTime = new ArrayList<>();
//        ArrayList<String> endTime = new ArrayList<>();

        for (int i = 0; i < 2; i++) {      // Maximum class one individual may have is 10 in a day. (Let's Assume)
            System.out.println("Enter Module name: ");
//            Module.add(in.nextLine());
            Module[i] = in.nextLine();
            System.out.println("Enter Batch: ");
//            Batch.add(in.nextLine());
            Batch[i] = in.nextLine();
            System.out.println("Enter Faculty: ");
//            Faculty.add(in.nextLine());
            Faculty[i] = in.nextLine();
            System.out.println("Enter Room Number: ");
//            RoomNo.add(in.nextInt());
            RoomNo[i] = in.nextLine();
            System.out.println("Enter Start Time: ");
//            startTime.add(in.next());
            startTime[i] = in.nextLine();
            System.out.println("Enter End Time: ");
//            endTime.add(in.next());
            endTime[i] = in.nextLine();

//            if(Module == null)       // If you want to break the loop in between.
//                break;
        }
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Module: " + Module[i]);
//            System.out.println("Batch: " + Batch[i]);
//            System.out.println("Faculty: " + Faculty[i]);
//            System.out.println("RoomNo: " + RoomNo[i]);
//            System.out.println("Start Time: " + startTime[i]);
//            System.out.println("End Time: " + endTime[i]);
//            System.out.println();
//        }
    }

    // PRINTING TIMETABLE FUNCTION
    public static void printingFunc() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Module: " + Module[i]);
            System.out.println("Batch: " + Batch[i]);
            System.out.println("Faculty: " + Faculty[i]);
            System.out.println("RoomNo: " + RoomNo[i]);
            System.out.println("Start Time: " + startTime[i]);
            System.out.println("End Time: " + endTime[i]);
            System.out.println();


//            System.out.println("Anything else you wanna do? (Y/N)");
//            String inputFromUser = in.next();

//            if(inputFromUser == "Y" || inputFromUser == "y") {
//                switchCaseFunc();
//            } else {
//                System.out.println("THANK YOU :) ");
//            }
        }
    }

    // DELETION FUNCTION
    public static void deletion() {
        System.out.println("Enter the index Number of the Class you want to defer: ");
        i = in.nextInt();
        in.nextLine();             // for \n that will be stored in the buffer memory.

        // Coping the next element to the deletion position

        Module[i] = Module[i + 1];
        Batch[i] = Batch[i + 1];
        Faculty[i] = Faculty[i + 1];
        RoomNo[i] = RoomNo[i + 1];
        startTime[i] = startTime[i + 1];
        endTime[i] = endTime[i + 1];



        System.out.println();
        System.out.println("CLASS DEFER SUCCESSFULLY! ");

    }

    //UPDATING FUNCTION
    public static void updateFunc() {
        System.out.println("Enter the index Number of the Class you want to Reschedule: ");
        i = in.nextInt();
        in.nextLine();             // for \n that will be stored in the buffer memory.

        System.out.println("Enter the startTime: ");
//        startTime[i] = in.nextLine();
        String newStartTime = in.next();
        startTime[i] = newStartTime;


        System.out.println("Enter the endTime: ");
//        endTime[i] = in.nextLine();
        String newEndTime = in.next();
        endTime[i] = newEndTime;

        printingFunc();
        System.out.println();
        System.out.println("YOUR TIMETABLE HAS BEEN UPDATED! ");
    }

    public static void writingIntoTextFile() {
        try {
            FileWriter fileWriter = new FileWriter("DefaultTimeTable.txt");
            String line = "Hello world! ";
            fileWriter.write(line);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Default TimeTable is written in Text File Sucessfully!");
    }

    public static void readingFromTheFile() {
        File myFile = new File("D:/Programs/File Handling/DefaultTimeTable.txt");
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
    }

}

