package DataTypes;

import java.util.Scanner;

public class DuckSongs {

    public static void main(String[] args) {

        DuckSongs FiveLittleDucks = new DuckSongs();
        FiveLittleDucks.duck();

    }

    private void duck() {
        Scanner fiveducks = new Scanner(System.in);
        System.out.println("Five Little ducks");

        int ducks = fiveducks.nextInt();

        String word = "Ducks";

        for (int i = ducks; i > 0; --i) {
            System.out.println(i + "  " + word + " ");
            System.out.println(i + "  " + word + " went over the Hill"); // concatinantion -  combine strings
            System.out.println(i + "  " + word + " Mother Duck said Quack Quack");
            System.out.println(" One Duck came back that day  ");
            System.out.println(" Mother Duck said Quack Quack Again  ");

            if (i == 1) {
                System.out.println("All of the five little ducks came back.");


            } else {
                    int newNum = i - 1;
                if (i == 5) {
                    word = "Duck";

                }

                System.out.println(newNum +  i + "  " + word + "  went missing After that Day ");
                System.out.println();
            }


        }


    }
}
