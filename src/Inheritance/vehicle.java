package Inheritance;

import java.util.Scanner;

public class vehicle {

    Scanner myScanner = new Scanner(System.in);

    public short numberofSeats;
    public short numberofWheels;
    String Input;




    public void accelerate () {


        int speed = 20;
        ++speed;
        String mnput;
        System.out.println("My Car LicencePlate Number is: BN786");
        System.out.println("My Current Speed is " + speed +" Mph");
        System.out.println("Is it Currently Busy on Road?");
        mnput = myScanner.next();
        System.out.println("You Should Slow Down");
        System.out.println(" I accelerate by turning my wheels ");

    }

    public void brake () {
        int Speed = 20;
        --Speed;
        System.out.println("i have had to brake to a sudden stop is" + Speed +" Mph");


        System.out.println("I brake by applying pressure to brake dics on my Wheels");

    }

    public void steer () {
        System.out.println("I steer my vehicle with my with the steer handle");

    }

}
