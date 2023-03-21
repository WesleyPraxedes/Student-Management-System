package com.student_management;

import java.util.Scanner;

public class Main {
 
    // Main driver method
    public static void main(String[] args) {
    	
        // Creating HumanResourceOffice Object.
        StudentListManagement studentList = new StudentListManagement();
 
        Student newStudent = new Student();
        
		// Initial Employee record
		// Using mutators to had code the data
		newStudent.setIdNumber(1);
		newStudent.setContactNumber(567844444);
		newStudent.setName("Ankit");
 
        // Calling add() record method to
        // add static data/(Hard CodedData) to linked List
        studentList.add(newStudent);
 
        // Creating Scanner Object to read input
        Scanner input = new Scanner(System.in);
 
        // Creating option integer variable
        int option = 0;
 
        // Do - While loop
        do {
            menu();
            option = input.nextInt();
 
            // Switch case
            switch (option) {
 
            // Case 1
            case 1:
 
                // Display message
                System.out.print("What is the Student id Number ? ");
                int idNumber = input.nextInt();
 
                System.out.print("What is the Student contact Number ? ");
                int contactNumber = input.nextInt();
                
                input.nextLine();
                System.out.print("What is the Student Name ? ");
                String name = input.nextLine();
 
                // Create record object and pass constructor
                // parameters.
                newStudent = new Student(idNumber, name, contactNumber);
                
                // Call add() record
                studentList.add(newStudent);
                System.out.println(newStudent.toString());
 
                // Break statement used to terminate program
                // from here only once it entered this case
                break;
 
            // Case 2
            case 2:
 
                // Display message
                System.out.print(
                    "What is the Student id number ? ");
                int rId = input.nextInt();
 
                // Invoke remove/delete record
                studentList.delete(rId);
 
                break;
 
            // Case 3
            case 3:
 
                // Display message
                System.out.print(
                    "What is the Student id number? ");
 
                int rIdNo = input.nextInt();
                studentList.update(rIdNo, input);
 
                break;
 
            // Case 4
            case 4:
 
                // Display message
                System.out.print(
                    "What is the Student id ? ");
                int bookId = input.nextInt();
 
                if (!studentList.find(bookId)) {
                    System.out.println(
                        "Student id does not exist\n");
                }
 
                break;
 
            // Case 5
            case 5:
                studentList.display();
                break;
 
            // Case 6
            case 9:
 
                // Display message
                System.out.println(
                    "\nThank you for using the program. Goodbye!\n");
                System.exit(0);
 
                break;
 
            // Case 7: Default case
            // If none above case executes
            default:
 
                // Print statement
                System.out.println("\nInvalid input\n");
                break;
            }
        }
 
        // Checking condition
        while (option != 9);
    }
 
    // Method 2
    // Menu - Static menu for displaying options
    public static void menu()
    {
 
        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Students");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }

}
