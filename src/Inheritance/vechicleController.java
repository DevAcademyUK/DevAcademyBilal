package Inheritance;

import java.util.Scanner;

public class vechicleController  extends  vehicle{

   Scanner myScanner = new Scanner(System.in);

   public static void main (String [] args ) {

       vechicleController VC = new vechicleController();
       VC.menu();
   }

    public void menu() {

       System.out.println("Which Vehicle Would You like to View Today?");
       System.out.println("1 - Car");
        System.out.println("2 - Bus");
        System.out.println("3 - Truck");
        System.out.println("4 - Train");
        System.out.println("5 - Motorbike");
        System.out.println("6 - Bicycle");

        int input = Integer.parseInt(myScanner.nextLine());

        switch (input) {
            case 1: createCar();
            break;
            case 2: createBus();
                break;
            case 3: createTruck();
                break;
            case 4: createTrain();
                break;
            case 5: createMotorbike();
                break;
            case 6: createBicycle();
                break;

            default:

                System.out.println(" Error: Incorrect input received");
                menu();

        }

    }

    private void Logout(){

    }

    private void createBicycle() {

        bicycle BY = new bicycle((short) 5, (short)4);
        BY.accelerate();
        BY.brake();
        menu();


    }

    private void createMotorbike() {

        motorbike MB = new motorbike((short) 5, (short)4);
        MB.accelerate();
        MB.brake();
        menu();

    }

    private void createTrain() {

        train TA = new train((short) 5, (short)4);
        TA.accelerate();
        TA.brake();
        menu();

    }

    private void createTruck() {
        truck TU = new truck((short) 5, (short)4);
        TU.accelerate();
        TU.steer("Right or Left");
        TU.brake();
        menu();

    }

    private void createBus() {
        bus B = new bus((short) 5, (short)4);
        B.accelerate();
        B.steer("Right or Left");
        B.brake();
        menu();


    }

    private void createCar() {
        System.out.println("What Part of the Car would you like to use?");
        String  Car = myScanner.nextLine();
       car C = new car((short) 5, (short)4);
       C.accelerate();
       C.steer("Right");
       C.brake();
        menu();



    }
}
