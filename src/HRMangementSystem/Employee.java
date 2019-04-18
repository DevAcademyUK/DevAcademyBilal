package HRMangementSystem;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Employee{

    private String UsernameEmployee = "Bilal"; // Employee Login Details
    private String  passwordemployee = "Password";

    private String UsernameManager = "Mo"; // Manager Login Details
    private String  PassManager = "Password";

    private String UsernameHR = "Jim"; // Manager Login Details
    private String  PassHR = "Password";







    Scanner myScanner = new Scanner(System.in);

    //List <EmployeeDB>  EM = new ArrayList<EmployeeDB>();
    //EmployeeDB[] employeeDBS = new EmployeeDB[3];
    List <EmployeeDB> employeeDBS = new ArrayList<EmployeeDB>();
    List <ManagerSession> managerSessions = new ArrayList<ManagerSession>();




    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.init();


    }



    public void init() {

        //  employeeDBS.add(new EmployeeDB( "Mr","Bilal","Yousaf", "23/06/98"
        // ,"20 Man Street", "Birmingham", "WestMidlands","BX7 25Z", "07856189723","bilal.yousaf@mail.bcu.ac.uk",
        //       "ZCX89MN", "Junior Software Developer", "18/02/09"));



        employeeDBS.add(new EmployeeDB("Mr", "Bilal Yousaf", "23/06/98", "20 Man Street"
                , "Birmingham", "WestMidlands", "BX7 25Z", "07856189723", "bilal.yousaf@mail.bcu.ac.uk", "ZCX89MN",
                "Junior Software Developer", "18/02/09"));

      //  employeeDBS.add(new EmployeeDB("Mr", "Dean Kane", "21/06/91", "16 Ku Street"
              //  , "Coventry", "WestMidlands", "CTY 89Z", "0785618097", "Kane.De@mail.bcu.ac.uk", "ZC897JJ",
              //..  "Senior Software Developer", "1/01/16"));

      //  employeeDBS.add(new EmployeeDB("Mrs", "Jim Samer", "23/02/88", "33 Jim Street", "Wolverhampton", "WestMidlands", "WV2 JKZ", "0785618324", "Jam.kac@gmail.com",
          //      "XS9JJKM", "Senior Software Developer", "1/02/2016"));


        managerSessions.add(new ManagerSession("Mr", "Bilal Yousaf", "23/06/98", "20 Man Street"
                , "Birmingham", "WestMidlands", "BX7 25Z", "07856189723", "bilal.yousaf@mail.bcu.ac.uk", "ZCX89MN",
                "Junior Software Developer", "18/02/09"));

      //  managerSessions.add(new ManagerSession("Mr", "Dean Kane", "21/06/91", "16 Ku Street"
          //      , "Coventry", "WestMidlands", "CTY 89Z", "0785618097", "Kane.De@mail.bcu.ac.uk", "ZC897JJ",
            //    "Senior Software Developer", "1/01/16"));

     //   managerSessions.add(new ManagerSession("Mrs", "JIm Samer", "23/02/88", "33 Jim Street", "Wolverhampton", "WestMidlands", "WV2 JKZ", "0785618324", "Jam.kac@gmail.com",
          //      "XS9JJKM", "Senior Software Developer", "1/02/2016"));






        Menu();
    }



    public void Menu() {
        Scanner myScanner = new Scanner(System.in);


        System.out.println("Welcome to DevAcademy Database" );
        System.out.println("Select An Option From the List");
        System.out.println("1 - Employee  Personal Database");
        System.out.println("2 - Manager Access Database");
        System.out.println("3 - HR Access Database");
        int Choice = Integer.parseInt(myScanner.nextLine());

        switch (Choice) {
            case 1:
                EmployeeDetails();
                break;

            case 2:
                ManagerSession();
                break;

            case  3:
                AddEmployee();


            default:
                System.out.println("Error: Invalid Input. Please Try Again");
                Menu();
        }


    }

    private void AddEmployee() {
        System.out.println("Username: ");
        String enteredUsername = myScanner.nextLine();
        System.out.println("Password: ");
        String enteredPassword = myScanner.nextLine();
        if(validateLoginDetails3(enteredUsername, enteredPassword)){

        }
        else {
            System.out.println("Invalid details have been entered. Please try again");
            init();
        }

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the title  of the Employee? Mr/Mrs/Miss");
        String title = myScanner.nextLine();

        System.out.println("What is the Name of the Employee?");
        String Name = myScanner.nextLine();

        System.out.println("What is the DOB of the Employee?");
        int DOB = myScanner.nextInt();

        System.out.println("What is the Address  of the Employee?");
        String Address = myScanner.nextLine();

        System.out.println("What is the Town  of the Employee?");
        String town = myScanner.nextLine();

        System.out.println("What is the County  of the Employee?");
        String County = myScanner.nextLine();

        System.out.println("What is the Postcode  of the Employee?");
        String postcode = myScanner.nextLine();

        System.out.println("What is the Contact Number  of the Employee?");
        String contact = myScanner.nextLine();

        System.out.println("What is the ID of the Employee?");
        String ID = myScanner.nextLine();

        System.out.println("What is the Email Address   of the Employee?");
        String email = myScanner.nextLine();

        System.out.println("What is the Job Position of the Employee?");
        String job = myScanner.nextLine();

        System.out.println("What is the start date of the Employee?");
        String Start = myScanner.nextLine();

        System.out.println("Employee Data has Successfully been Stored");


        Menu();


    }

    private void EmployeeDetails() {
        System.out.println("Username: ");
        String enteredUsername = myScanner.nextLine();
        System.out.println("Password: ");
        String enteredPassword = myScanner.nextLine();
        if(validateLoginDetails(enteredUsername, enteredPassword)){

        }
        else {
            System.out.println("Invalid details have been entered. Please try again");
            init();
        }

        for (EmployeeDB Add : employeeDBS) {
            System.out.println("Title: " + Add.Title);
            System.out.println("Name: " + Add.Name);
            System.out.println("DOB: " + Add.DOB);
            System.out.println("Address: " + Add.Address);
            System.out.println("City: " + Add.Town);
            System.out.println("County: " + Add.County);
            System.out.println("Post Code: " + Add.PostCode);
            System.out.println("Contact: " + Add.ContactNumber);
            System.out.println("Email: " + Add.EmailAdd);
            System.out.println("Employee ID: " + Add.EmployeeID);
            System.out.println("Job Title: " + Add.Position);
            System.out.println("Start Date: " + Add.StartDate);

        }


    }

    private void ManagerSession() {
        System.out.println("Username: ");
        String enteredUsername = myScanner.nextLine();
        System.out.println("Password: ");
        String enteredPassword = myScanner.nextLine();
        if(validateLoginDetails2(enteredUsername, enteredPassword)){

        }
        else {
            System.out.println("Invalid details have been entered. Please try again");
            init();
        }

        Scanner myScanner = new Scanner(System.in);


        System.out.println("DevAcademy Database" );
        System.out.println("Select From the Given Options");
        System.out.println("1 - Check  Employees Details ");
        System.out.println("2 - Check  Employees Address ");
        System.out.println("3 - Check  Employees Position ");


        int Pick = Integer.parseInt(myScanner.nextLine());

        switch (Pick){
            case 2: EmployeeAddress();

                break;

            case 1: EmployeeUsers();

                break;
            case 3: EmployeePositon();


             default:
                 System.out.println("Invalid Input");

                ManagerSession();
        }

    }



    private void EmployeeAddress () {
        Collections.sort(managerSessions);
        for (ManagerSession MN :managerSessions){
            System.out.println(MN.Name);
            System.out.println(MN.Address);
            System.out.println(MN.Town);
            System.out.println(MN.County);
            System.out.println(MN.PostCode);

        }

    }

    private void EmployeeUsers () {
        Collections.sort(managerSessions);
        for (ManagerSession MN : managerSessions) {
            System.out.println(MN.Name);
            System.out.println(MN.EmployeeID);
            System.out.println(MN.EmailAdd);
            System.out.println(MN.ContactNumber);
            System.out.println(MN.Position);
            System.out.println(MN.StartDate);


        }
    }

    private void EmployeePositon() {
        Collections.sort(managerSessions);
        for (ManagerSession MP : managerSessions) {
            System.out.println(MP.Name);
            System.out.println(MP.Position);
            System.out.println(MP.EmailAdd);
        }

    }




    private boolean validateLoginDetails(String enteredUsername, String enteredPassword){
        if(enteredUsername.equals(UsernameEmployee) && enteredPassword.equals(passwordemployee)){
            return true;
        }
        return false;
    }






    private boolean validateLoginDetails2(String enteredUsername, String enteredPassword){
        if(enteredUsername.equals(UsernameManager) && enteredPassword.equals(PassManager)){
            return true;
        }
        return false;
    }

    private boolean validateLoginDetails3(String enteredUsername, String enteredPassword){
        if(enteredUsername.equals(UsernameHR) && enteredPassword.equals(PassHR)){
            return true;
        }
        return false;
    }



}



