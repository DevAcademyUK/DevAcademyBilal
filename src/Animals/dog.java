package Animals;

public class dog {

    private  String name ;
    private  String gender;
    private int age ;
    private  String size;
    private String breed;
    private String color;



    public dog(String name, String gender, int age, String size, String breed, String color) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.breed = breed;
        this.color = color;
    }

    private String bark (String size){
        String bark = "";
        if (size.equalsIgnoreCase("small")){
            bark = " yap Yap Yap" ;

        }
        else if (size.equalsIgnoreCase("medium")) {
            bark = " wof wof wof";


        } else {
                bark = "WOOF!! WOOF!!";
        }
    return bark;
    }

    private String play (String breed) {
        String playing = "";
        if (breed.equalsIgnoreCase("poodle")){
            playing = " oh dear, i do not think it is possible to engage in the activity";

        } else if (breed.equalsIgnoreCase("Labrador")){
            playing = " YEAH, Throw that Stick, Go Fetch";

        } else if (breed.equalsIgnoreCase("Border Collie")) {
            playing = " Lets go Chase Sone Sheep";


        }
        return playing;
    }

    private String behuman ( String name, String breed, int age ) {
        return  " Hello Human" + name + " and I am " + age + " year old" + breed + ", What breed are you?";

    }

    }
