package ParkingFees;

import java.util.Scanner;

public class Parking {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Parking fees = new Parking();
        fees.getInput();





    }

    private void getInput() {
        System.out.println("What day is it Today?");
        String day = myScanner.nextLine();
        System.out.println("How Long Shall You been staying>");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is your Current Position at the College? (Staff/ Student/ Visitor");
        String position = myScanner.nextLine();
        feeCalculate(day, duration, position);
    }

    private void feeCalculate(String day, int duration, String position) {

        int cost;
        int hourlyrate= 0;
        int multiplier= 0;

        switch (position){
            case "staff":
                multiplier =2;
                break;
            case "Student":
                multiplier=1;
            case "Visitor":
                multiplier = 3;
                break;

             default:
                 System.out.println("Invalid Input for Position, Please try Again ");
                getInput();
        }


        switch(day){ // This Part of the code displays the hourly rate for the week
            case "Monday":
                hourlyrate = 3;
                break;
            case "Tuesday":
                hourlyrate = 2;
                break;
            case "Wednesday":
                hourlyrate = 4;
                break;
            case "Thursday":
                hourlyrate = 2;
                break;
            case "Friday":
                hourlyrate = 2;
                break;
            case "Saturday":
                hourlyrate = 1;
                break;
            case "Sunday":
                hourlyrate = 3;
                break;

            default:
                System.out.println("Invalid Input for Hourly Rate, Please try Again ");
                getInput();


        }

        cost = (hourlyrate * multiplier) * duration; // method to display the full costs
        System.out.println("Thank You for Parking at GrateShed College, Please Pay: £ " + cost);

    }
}

