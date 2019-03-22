package BankingSystem;

import java.util.Scanner;

public class PersonalAccount {

    Scanner myscanner = new Scanner(System.in);

    private double deposit;
    private double balance;
    private double withdraw;
  //  private String logout;

    public PersonalAccount(double deposit, double balance, double withdraw, String logout) {
        this.deposit = deposit;
        this.balance = balance;
        this.withdraw = withdraw;
      //  this.logout = logout;
    }

    public void deposits (String deposit) {
        System.out.println("Which Services method would you like to use to?");
        String account = myscanner.nextLine();
        System.out.println("how much would you like to Withdraw?");
        short withDrawAmount  = Short.parseShort(myscanner.nextLine());



      //  if (account.equalsIgnoreCase("Deposit")) {
         //   PAccount += depositAmount;
       // }
      // else if (account.equalsIgnoreCase("Withdraw")){
           //if (withDrawAmount <= PAccount) {
             //   PAccount -= withDrawAmount;
            }

      // else if (account.equalsIgnoreCase("Balance")){
        //    System.out.println("Your Current Balance is:  " + PAccount);;

     //   } else {
      //      System.out.println("Error: Invalid Information provided");
     //   }



    //    }



    }




 //  }

