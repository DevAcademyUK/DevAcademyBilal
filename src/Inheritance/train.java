package Inheritance;

public class train  extends vehicle{

    public train (short numberofSeats, short numberOfWheels) {
        this.numberofSeats = numberofSeats;
        this.numberofWheels = numberOfWheels;
    }

    public void steer (String dir) {
        System.out.println("I don't need to do anything " + "to turn " +
                dir + ", I just follow the tracks");



    }


}
