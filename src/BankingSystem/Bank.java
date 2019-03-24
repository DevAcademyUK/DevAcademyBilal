package BankingSystem;

import java.util.Scanner;

public class Bank {


    private String userName = "Bilal";
    private String password = "zxcvbnm";
   ///protected String personalAccountBalance;

    private double CurrentAccountB;
    private double JoinedAccountB;
    private double SharedccountB;



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

    private void Main() {
        System.out.println("What would you like to do?");
        String input = myscanner.nextLine().toLowerCase();
        getAction(input);
    }

    private void getAction(String input) {
        switch(input){

            case "deposit":
                deposit();
                break;

            case "withdraw":
                withdraw();
                break;

            case "balance":
                withdraw();
                break;

            case "logout":
              //  logout();
                break;
            default:

                System.out.println(" Error: Incorrect input received");
                System.out.println("Please enter any of the following:");
                System.out.println("PAccount - Access Personal Account");

                System.out.println("SHAccount - Access Shared Account");
                System.out.println("SVAccount - Access Savings Account");
                 System.out.println("Logout - sign out of your account");
                Main();

        }


    }

    private void deposit() {
        System.out.println("What Account would you like access to make a Deposit?");
        String account = myscanner.nextLine();
        System.out.println("How much is the amount of Your Deposit ");
        short depositAmount = Short.parseShort(myscanner.nextLine());

        if(account.equalsIgnoreCase("CurrentAccount")) {
            CurrentAccountB += depositAmount;
            System.out.println("Your Deposit Has been Completed");
        }
        else if(account.equalsIgnoreCase("JointAccount")) {
            JoinedAccountB += depositAmount;
            System.out.println("Your Deposit Has been Completed");
        }
        else if(account.equalsIgnoreCase("SavingsAccount")) {
            SharedccountB += depositAmount;
            System.out.println("Your Deposit Has been Completed");
        }
        else {
            System.out.println("Error : Invalid Information provided");
        }
    }

    private void withdraw (){

        System.out.println("Which account would you liek to use to Withdraw your Money From?");
        String WithdrawwAccount = myscanner.nextLine();
        System.out.println("How much would you like to Withdraw?");
        short withDrawAmount = Short.parseShort(myscanner.nextLine());

        if (WithdrawwAccount.equalsIgnoreCase("Current Account: ")){
            if (withDrawAmount <= CurrentAccountB){
                CurrentAccountB -= withDrawAmount;
                System.out.println("Withdraw Enquiry Completed");
            }
            else
                System.out.println("Error: Insufficient Funds");
        }

        else if (WithdrawwAccount.equalsIgnoreCase("Joint Account ")){
            if (withDrawAmount <= JoinedAccountB) {
                JoinedAccountB -= withDrawAmount;
                System.out.println("Withdraw Enquiry Completed");
            }

            else
                System.out.println("Error: Insufficient Funds");
        }
        else if (WithdrawwAccount.equalsIgnoreCase("Savings  Account ")){
            if (withDrawAmount <= JoinedAccountB) {
                JoinedAccountB -= withDrawAmount;
                System.out.println("Withdraw Enquiry Completed");
            }

            else
                System.out.println("Error: Insufficient Funds");
        }
        Main();

    }

    private void BalanceCheck() {

        System.out.println("Which Account Would like to Check Your Balance for?");
        String BalanceAccount = myscanner.nextLine();

        if (BalanceAccount.equalsIgnoreCase("CurrentAccount")) {
            System.out.println("Current Account Balance is:  " + CurrentAccountB);
            System.out.println("Balance Enquiry Completed");

        } else if (BalanceAccount.equalsIgnoreCase("JointAccount")) {
            System.out.println("Current Account Balance is:  " + JoinedAccountB);
            System.out.println("Balance Enquiry Completed");
        } else if (BalanceAccount.equalsIgnoreCase("Savings")){
            System.out.println("Current Account Balance is:  " + SharedccountB);
            System.out.println("Balance Enquiry Completed");
        }
    }




    private boolean autentication(String usernameEntered, String passwordenter) {
        if (usernameEntered.equals(userName) && passwordenter.equals(password)) {
            return true;
        }
        return false;
    }

}