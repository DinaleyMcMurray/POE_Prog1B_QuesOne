/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe_prog1b_questionone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dinal
 */
public class Student {
 
    /*
    why array list? 
    - you don't need to know the size of your data collection in advance 
    -  come with a variety of built-in methods: which in this program is usefull considering we must add, remove elements 
    */
    
    public static ArrayList<Integer> IDs = new ArrayList<>();
    public static ArrayList<String> names = new ArrayList<>();
    public static ArrayList<Integer> Ages = new ArrayList<>();
    public static ArrayList<String> emails = new ArrayList<>();
    public static ArrayList<String> courses = new ArrayList<>();

    public static boolean isLetter(String value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Scanner scanner = new Scanner(System.in);
    
    public void SaveStudent(Scanner scanner){//ArrayList<Integer> testIDs, ArrayList<String> testNames, ArrayList<Integer> testAges, ArrayList<String> testEmails, ArrayList<String> testCourses, int testID, String testName, int testAge, String testEmail, String testCourse)
      
        
        

        //variable
        System.out.println("*************************************************");
        System.out.println("""   
                           CAPTURE A NEW STUDENT 
                           *************************************************""");
        
        System.out.print("Enter the student ID: "); 
        int ID = scanner.nextInt(); // Read the student ID
       
        
        
        System.out.print("Enter the student's name: "); 
        String name = scanner.nextLine(); 
        scanner.nextLine(); 
        
        
        
        int attempts = 0;
        while (attempts < 3) {
  
        System.out.println("Enter the student's age: "); 
        int Age = scanner.nextInt(); 
        scanner.nextLine();
        
        // i learnt the try and catch method through stack overflow, https://stackoverflow.com/questions/42982937/correctly-implementing-a-try-catch-statement-with-regards-to-integer-arraylists
        //https://stackoverflow.com/questions/22503520/outputting-an-error-when-a-char-string-is-typed-instead-of-an-integer
        // why did a use the try - catch instead of just is, is else and else -->
        // as the try - catch method allows you to provide a user-friendly error message and take appropriate action instead of the program crashing due to an unhandled exception.
        
        try{  int ages = Integer.parseInt(scanner.nextLine());
        // Try to parse the input as an integer, why do we do this ??? 
        //  trying to directly parse the string as an integer would result in a NumberFormatException.
        //the NumberFormatException will not work without this line of code i
        if (ages >= 16)
        {
        Ages.add(ages);
        break;
        }//end of if 
        
        else if ( ages < 16)
        {
            System.out.println("You have entered an incorrcet student age!!! ");
        }//end of else
        
        }catch(NumberFormatException e) {
            
                // Invalid input (not an integer)
                System.out.println("Invalid input! Please enter a valid age as a number.");
                scanner.nextLine(); // Consume the invalid input
        }//end of catch 
            attempts++;
        
        
        if (attempts == 3) 
        {
            System.out.println("You have reached the maximum number of attempts, the program will now be closing...");
            System.exit(0);
        }//end of if statment 
       
  
        
        System.out.println("Enter the student's email: "); 
        String email = scanner.nextLine();
        scanner.nextLine();
        
        System.out.println("Enter the student's course: "); 
        String course = scanner.nextLine();
        scanner.nextLine(); 
        
      
        System.out.println("age " + Ages.get(0));
        
        IDs.add(ID);
        names.add(name); 
        emails.add(email);
        courses.add(course);
        }//end of while loop 
    }//end of save student 
    
    //_______________________________________________________________________________________
    
    public void SearchStudent(Scanner scanner){
        //variables.
        int searchInt;

        //prompt the user 
        System.out.println("Please enter the student ID to search: ");
        searchInt = scanner.nextInt();
        System.out.println("---------------------------------------------------------------------");

    int position = -1;  // Initialize position to -1 to indicate not found

    // for loop to iterate through the IDs ArrayList and find the position of the student's ID,
    //Search for the position of the student's ID in the IDs ArrayList
    for (int i = 0; i < IDs.size(); i++) 
    {
        if (IDs.get(i) == searchInt) 
        {
            position = i;  // Student ID found
            break;        
        }//end of if staement 
    }//end of if statement 
        
        if (position != -1){
          
            System.out.println("Student " + (position + 1));
            System.out.println("---------------------------------------------------------------------");
            System.out.println("STUDENT ID: "  + IDs.get(position));
            System.out.println("STUDENT NAME: "  + names.get(position));
            System.out.println("STUDENT AGE: " + Ages.get(position));
            System.out.println("STUDENT EMAIL: "  + emails.get(position));
            System.out.println("STUDENT COURSE: "  + courses.get(position));
            System.out.println("---------------------------------------------------------------------");
            
            
        }//end of if statement 
       else{
           System.out.println("Invlaid ID");
       }//end of else 

    }//end of SearchStudent()
    
    //_______________________________________________________________________________________
    
    public void DeleteStudent(Scanner scanner)
    {
        
        boolean removed = false;
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Enter the student ID to delete>>>");
        int IDsToDelete = scanner.nextInt();
        
         for (int i = 0; i < IDs.size(); i++) {
            if (IDs.get(i) == IDsToDelete) {
                IDs.remove(i);
                removed = true;
         System.out.println("Student with ID: " + IDsToDelete + " WAS DELETED! ");
        
        }else{
            System.out.println("Invalid ID number>>>");
        }//end of else 
        }//end of for loop
        }//end of DeleteStudent()
    
    //_______________________________________________________________________________________
    
    public void StudentReport()
        {
         ArrayList<Student> students = new ArrayList<>();

      for (int i = 0; i < IDs.size(); i++) {
     
            System.out.println("Student " + (i + 1));
            System.out.println("---------------------------------------------------------------------");
            System.out.println("STUDENT ID: " + IDs.get(i));
            System.out.println("STUDENT NAME: " + names.get(i));
            System.out.println("STUDENT AGE: " + Ages.get(i));
            System.out.println("STUDENT EMAIL: " + emails.get(i));
            System.out.println("STUDENT COURSE: "  + courses.get(i));
            System.out.println("---------------------------------------------------------------------");
            }//end of for loop
        }//end of StudentReport()
    //________________________________________________________________________________________
    
    public void exitApplication()
    {
            System.out.println("Thank you for using this program, you will now be exiting the program");
            System.out.println("Exiting program...");
            System.exit(0);
    }//end of exit application 
     

    public ArrayList<Integer> getIDs() {
        return IDs;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public ArrayList<Integer> getAges() {
        return Ages;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
    
   
}
