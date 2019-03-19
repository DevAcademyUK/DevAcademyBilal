package Intro;

import java.util.Scanner;

public class HelloProgram {

    public static void main (String [] args) {

        HelloProgram myclass = new HelloProgram();
        myclass.CreateDoc();




    }
    private void  CreateDoc () { // This program is all about getting userinput
            Scanner myScanner = new Scanner(System.in);
            System.out.println(" What is your name ");
            String name = myScanner.nextLine();
            System.out.println("Hello, My Name is JJJ" + name);

            //
        //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
       // System.out.println("Enter username");

       // String userName = myObj.nextLine();  // Read user input
       // System.out.println("Username is: " + userName);  // Output user input
    }
}




