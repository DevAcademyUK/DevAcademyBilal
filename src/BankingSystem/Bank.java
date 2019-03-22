package BankingSystem;

import java.util.Scanner;

public class Bank {


    private String userName = "Bilal";
    private String password = "zxcvbnm";


    Scanner myscanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bankAccounts = new Bank();
        bankAccounts.MainMenu();

    }

    public void MainMenu() {
        System.out.println("Enter User Name:   ");
        String usernameEntered = myscanner.nextLine();
        System.out.println("Enter Your Passoword:  ");
        String passwordenter = myscanner.nextLine();
        if (autentication(usernameEntered, passwordenter)) {
            Main();

        } else {
            System.out.println("Error: Invalid Details: Try Again");
            MainMenu();
        }
    }

    public void Main() {
        System.out.println("What would Your to do?");
        String userinput = myscanner.nextLine().toLowerCase();

    }

    public void selectAction(String input ) {
        switch (input){
            case "PAccount":
                PAccount();
                break;
            case "SHAccount":
                SHAccount();
                break;
            case "SVAccount":
                SVAccount();
                break;

           // case "logout":
             //   logout();
             //   break;

                default:

                System.out.println(" Error: Incorrect input received");
                System.out.println("Please enter any of the following:");
                System.out.println("PAccount - Access Personal Account");
                System.out.println("SHAccount - Access Shared Account");
                System.out.println("SVAccount - Access Savings Account");
               // System.out.println("Logout - sign out of your account");
                Main();

        }
    }

    public void SVAccount() {
    }

    public void SHAccount() {

    }

    public void PAccount() {



    }


    private boolean autentication(String usernameEntered, String passwordenter) {
        if (usernameEntered.equals(userName) && passwordenter.equals(password)) {
            return true;
        }
        return false;
    }

}