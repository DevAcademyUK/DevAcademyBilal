package DataTypes;

import java.util.Scanner;

public class singsong {


    public static void main (String [] args) {


        singsong Songs = new singsong();
        Songs.sing();

    }

    // scanner is used to get user input

    private void sing (){ // defining a new mehtod = sing
    // creating a new instance of Scanner class, will allow input from user
        Scanner myObject = new Scanner(System.in);
        System.out.println("How many bottles of Evian  are on the wall ");

        int bottles = myObject.nextInt(); //


        String word = " bottles" ;

        for (int i = bottles; i > 0; i--){ // for loops made up of 3 conditions. initliastion, condtions and iteration
            // after each iteration take the vlaue of 1
            System.out.println(i + "  " + word + " of Evian on the wall"); // concatinantion -  combine strings
            System.out.println(i + "  " + word + " of Evian");
            System.out.println(" Take one down ");
            System.out.println(" Pass it around ");


            if (i == 1) {
                System.out.println(" No bottles of Evian on the wall");

            } else {
                    int newNum = i - 1;
                    if (newNum == 1){
                        word = " bottle";

                    }

                    System.out.println(newNum + " " + word + " of Evian on the wall") ;
                    System.out.println();
            }

        }
    }


}



