/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe_prog1b_questionone;

import java.util.Scanner;

/**
 *
 * @author dinal
 */
public class POE_Prog1B_QuestionOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
    //this is the main 
    
        Scanner scanner = new Scanner(System.in);

    //____________________________________________________________________________________________________________ vars    
    //variables 
        int userInput;
        boolean isOne = false;
    //____________________________________________________________________________________________________________menu       
    
while(true){    
        System.out.println("*******************************************************");
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*******************************************************");
        System.out.println("Enter (1) to launch menu or another key to exit");
        userInput = scanner.nextInt();

       isOne = userInput == 1;// Convert int to boolean using a comparison
        int choice; //this is the users input for the switch case 
        
        if (isOne) 
        {
            System.out.println("*******************************************************");
            System.out.println("Please select one of the menu items:\n"
                                  + "(1) Capture a new student. \n" 
                                  + "(2) Search for a student. \n"   
                                  + "(3) Delete Student. \n"
                                  + "(4) Print student report. \n"
                                  + "(5) Exit Application. \n");
           
            choice = scanner.nextInt();
    //__________________________________________________________________________________________________________switch case
    
    
           switch(choice)
           {
               case 1: student.SaveStudent(scanner); // Call the method SaveStudent() directly using the class name
                                             // because the method was saved as static we may call a method from the main method directly without creating an instance of the class
               break;
                       
               case 2: student.SearchStudent(scanner);break;
               
               case 3: student.DeleteStudent(scanner);break;
               
               case 4: student.StudentReport();break;
               
               case 5: student.exitApplication();break;
               
               default: System.out.println("An incorrect character has been inputted, please enter a variable between 1 and 5. ");break;
                   
                   
           }
            
            
           }//end of if statement 
        else
        {
            
            System.out.println("Exiting program...");
            System.exit(0);
            
        } 
        //end of else statement

    }//end of main 
    
    //__________________________________________________________________________________________________________methods 
    } //end of while loop 
    }
    
