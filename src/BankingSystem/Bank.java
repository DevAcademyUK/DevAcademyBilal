package BankingSystem;

import java.util.Scanner;

public class Bank {

    Scanner myscanner = new Scanner(System.in);

    public static void main (String [] args) {
        Bank bankAccounts  = new Bank();
        bankAccounts.Access();

        Scanner myscanner = new Scanner(System.in);

        System.out.println(" Please Input Your UserName");

            String user = myscanner.nextLine();

            System.out.println("Please Input Your Password");
            String age  = myscanner.nextLine();

            if (user.equalsIgnoreCase( "Jim") || age.equalsIgnoreCase("7890")) {
                System.out.println("Welcome to Royal Banking");

            } else  {
                System.out.println("Error:Wrong Username or Password");


        }

    }

    public  void  Access () {
        System.out.println("What Type of Account would you like Access to?");
        String account  = myscanner.nextLine();

        if (account.equalsIgnoreCase("Shared Account")) {
            CreateSharedAccount();
        }
        else if (account.equalsIgnoreCase("Personal Accounr")) {
            AccessPersonalAccount();

        } else  if (account.equalsIgnoreCase("Saving Account")) {
            AccessSavedAccount();
        }
        else {
            System.out.println("Error: No Other Account Available");
        }
    }

    public void AccessSavedAccount() {

    }

    public void AccessPersonalAccount() {

    }

    public void CreateSharedAccount() {

    }
}
