package Animals;

import java.util.Scanner;

public class createAnimal {
    Scanner myscanner = new Scanner(System.in);

    public static void main(String[] args) {
        createAnimal animal  = new createAnimal();
        animal.getAnimalType();


    }


        public void getAnimalType () {

            System.out.println("What animal would you like to create?");
            String animal = myscanner.nextLine();

            if (animal.equalsIgnoreCase("dog")) { //
                //Both of these methods are used for comparing two strings.
                // The only difference between them is that the equals() methods considers the case
                // while equalsIgnoreCase() methods ignores the case during comparison. For e.g.
                // The equals() method would return false if we compare the strings “TEXT” and “text” however equalsIgnoreCase() would return true.
                createDog();
            }
            else if (animal.equalsIgnoreCase("cat")){
                createCat();
            }
            else {
                System.out.println(animal + " is not an animal we can currently create, please try again");
            }

        }

    public void createDog() {

        System.out.println("What is the dog name?");
        String name = myscanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myscanner.nextLine();
        System.out.println("How old  is the dog?");
        int age = myscanner.nextInt();
        System.out.println("What is the breed of the  dog?");
        String breed = myscanner.nextLine();

       dog myDog = new dog(name, size, age, breed);

        System.out.println(myDog.bark(size));
        System.out.println(myDog.play (breed));
        System.out.println(myDog.behuman (name, breed, age));



    }

    public void createCat(){

      System.out.println("What is the name of Your Cat?");
      String  name = myscanner.nextLine();

      System.out.println("WHat color is the  Cat?");
      String color = myscanner.nextLine();

      System.out.println("How old is the cat?");
      int age = myscanner.nextInt();

      cat myCat = new cat(name, age, color);

      System.out.println(myCat.watching(color));
      System.out.println(myCat.CATS(name, color, age));



    }

}





