package TimesTable;

import java.util.Scanner;

public class MultiplicationGen {

    Scanner myscanner = new Scanner(System.in); // myscanner = instance variable

    public static void main (String [] args) {
        MultiplicationGen  multiplesTable = new MultiplicationGen();
        multiplesTable.getValues();

    }

    private void getValues () {
        System.out.println("What number would you like to Multiplication tables for?");
        int number = Integer.parseInt(myscanner.nextLine());
        System.out.println("What is he Maximum multiplication yuo wish to calculate? ");
        int mulitplier = Integer.parseInt(myscanner.nextLine());
        calculate (number, mulitplier);



    }

    private void calculate (int number, int multiplier) {
        for (int i =1; i < multiplier; i++) {
            System.out.println(i + " times " + number + "  is "  + i * number );
        }
    }


}
