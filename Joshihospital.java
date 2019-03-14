/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
/**
 *
 * @author 91030946
 */
public class Joshihospital {
    
    public static  ArrayList<PatientRecord> member = new ArrayList<PatientRecord>();
    public Scanner scanner = new Scanner(System.in);
    public String input;
    
     public static void main(String[] args) {
        obtainRecords();
        search();

    }
    /**
     * @param args the command line arguments
     */
    public static void obtainRecords() {
        String path = "src\\hospitalrecord\\ListOfPatients.txt";
        //Use path to the ListOfPatients.txt here
        LineNumberReader lr = null;
        //allows to read information from the file line by line
        String[] oneRecord = new String[4];
            //an array to store info about one patient
        PatientRecord pat;
        try {
            //using try-catch for exception handling to catch
        //possible errors with i/o operations
            FileReader inputStream = new FileReader(path);
            //FileReader reads the file’s contents
            lr = new LineNumberReader(inputStream);
            String str;
            while ((str = lr.readLine()) != null) {
            //while the next line exists
                oneRecord = str.split(",");
            //dividing one file line by commas and assigning to array
                pat = new PatientRecord(oneRecord[0], oneRecord[1],
                        oneRecord[2], oneRecord[3]);
                
                //#5
               
                
                 member.add(pat);
              
                //[YOUR CODE HERE] //adding patient to the ArrayList
                
                //#5
               // System.out.println(pat);
            }
        } catch (IOException ioe) {
            System.out.println("IOExcception occured");
        }
    }

   


        
     public static void search(){
      Scanner scanner = new Scanner (System.in);
      
     //loop start
             while (true) {
            
            System.out.println("Enter s for search or e for exit");
            String input = scanner.nextLine();

            PatientRecord found = null;

            if (input.equalsIgnoreCase("s")) {
                System.out.println("Please enter the patientID");
                String check = scanner.nextLine();

                for (PatientRecord p : member) {

                    if (p.getPatientID().equals(check)) {
                        System.out.println("FOUND!");
                        found = p;
                        System.out.println("Found value:" + found);
                    }
                }
//if found someone
                if (found != null) {

                    System.out.println("Would you like to delete these records? y for yes, n for no.");

                    String id = scanner.nextLine();

                    if (id.equalsIgnoreCase("y")) {
                        member.remove(found);
                        System.out.println("Removed Succesfully");

                    } else {
                        System.out.println("you have pressed n are you sure about that?");
                    }
                } else {
                    System.out.println("This patient does not exist.");

                }
            } else if (input.equalsIgnoreCase("e")) {
                System.exit(0);
            } else {
                System.out.println("invalid input");
            }
        }
    }
}
     
     
        
        
        
//        array list .... 0,1,3... counting the patients
//        PatientRecord p = new PatientRecord("sam", "03/05/2019", "3064vs", "otal");
//        PatientRecord q = new PatientRecord("pawan", "03/05/2219", "3064vs", "otal");
//
//        ArrayList<PatientRecord> member = new ArrayList<PatientRecord>();
//        member.add(p);
//        member.add(q);
//        member.add(p);
//        member.add(p);
//        member.add(p);
     

//     System.out.println(p);
        // TODO code application logic here
    

