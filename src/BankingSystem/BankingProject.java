package BankingSystem;

import java.util.Scanner;

public class BankingProject {
    public static void main (String [] args ){

       // Scanner myScanner = new Scanner(System.in) ; // taking user input
        //System.out.println("Enter A Char : ");
       // int number = myScanner.nextInt();
        //System.out.println("Value =  " + number);
        //char Cha = myScanner.next().charAt(0);
        //System.out.println("Value =  " + Cha);

        BankAccount  SharedAccount = new BankAccount( "Bill", "67890"); // will invoke the BankAccount Constructor
        BankAccount  SavingsAccount = new BankAccount("Jim", "87469" );
        BankAccount  CurrentAccount = new BankAccount("Dan", "89076");


        SharedAccount.Menu();
        SavingsAccount.Menu();
        CurrentAccount.Menu();

    }

}
 class BankAccount {

     int balance; // Variables
     int previousTransanctions;
     String CustomerName;
     String CustomerID;

    BankAccount (String Cname, String CId ) { // Constructor = taking parameters .
        // Constructor  has no return type
        CustomerName = Cname;
        CustomerID = CId;

     }
     public void deposit(int amount) { // deposit method
         if (amount != 0) {
             balance = balance + amount; // balancee and amount will increment
             previousTransanctions = amount; // previous =tran will load the amount
         }

     }

     public void withDraw(int Amount) {
         if (Amount != 0) {
             balance = balance - Amount;
             previousTransanctions = Amount;
         }
     }


     public void getPreviousTransactions() { // method will return the previous transaction
         if (previousTransanctions > 0) {
             System.out.println("Deposited: " + previousTransanctions);

         } else if (previousTransanctions > 0) {
             System.out.println(" WithDraw:  " + previousTransanctions);


         } else {
             System.out.println("No Transaction Stored");

         }
     }

     public void Menu (){ // show the menu to the user
        char Option = '\0';  // char variable initialize to value
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome " + CustomerName); // initialize through our constructor
        System.out.println("PLease Type Your ID" + CustomerID);
        System.out.println("\n");
        System.out.println("A. Deposit");
        System.out.println("B. WithDraw");
        System.out.println("C. Previous Transaction ");
        System.out.println("D. Check Balance");
        System.out.println("E. Exit");

        do { // do while loop, do these set of statments while options not equal to "E".
            System.out.println(" Enter Your Options ");
            Option = myScanner.next().charAt(0);
            System.out.println("\n");

            switch (Option) {
                case 'A' :
                    System.out.println("Enter Amount to Deposit: ");
                    int amount = myScanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case  'B':
                    System.out.println("Enter Amount to WithDraw:  ");
                    int WithdrawAmount = myScanner.nextInt();
                    withDraw(WithdrawAmount);
                    System.out.println("\n");
                    break;

                case 'C':
                   getPreviousTransactions();
                    System.out.println("\n");
                    break;

                case 'D' :
                    System.out.println("Balance: "  + balance);
                    System.out.println("\n");
                    break;

                case 'E' :
                    break;

                default:
                    System.out.println("Invalid Option Selected "); // will be shown if the above options are not selected
                    break;
            }

        } while (Option != 'E');
        System.out.println("Thank You For Using Our Services");



     }


 }





