package com.lakshit;

import java.util.ArrayList;
import java.util.Scanner;

public class inputClass {
    public static void inputForTimeTable() {
        ArrayList<String> Module = new ArrayList<String>();
        ArrayList<String> Batch = new ArrayList<String>();
        ArrayList<String> Faculty = new ArrayList<String>();
        ArrayList<Integer> RoomNo = new ArrayList<Integer>();
        ArrayList<String> startTime = new ArrayList<String>();
        ArrayList<String> endTime = new ArrayList<String>();

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {      // Maximum class one individual may have is 10 in a day. (Let's Assume)
            System.out.println("Enter Module name: ");
            Module.add(in.nextLine());
            System.out.println("Enter Batch: ");
            Batch.add(in.nextLine());
            System.out.println("Enter Faculty: ");
            Faculty.add(in.nextLine());
            System.out.println("Enter Room Number: ");
            RoomNo.add(in.nextInt());
            System.out.println("Enter Start Time: ");
            startTime.add(in.next());
            System.out.println("Enter End Time: ");
            endTime.add(in.next());

            if(Module == null)       // If you want to break the loop in between.
                break;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Module: " + Module);
            System.out.println("Batch: " + Batch);
            System.out.println("Faculty: " + Faculty);
            System.out.println("RoomNo: " + RoomNo);
            System.out.println("Start Time: " + startTime);
            System.out.println("End Time: " + endTime);
        }
    }
}
