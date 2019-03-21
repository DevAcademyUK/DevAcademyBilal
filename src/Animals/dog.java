package Animals;

public class dog {

    private  String name ;
    private  String size;
    private int age ;
    private String breed;



    public dog(String name, String size, int age,  String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String bark (String size){
        String bark = " ";
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

    public String play (String breed) {
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

    public String behuman ( String name, String breed, int age ) {
        return  " Hello Human" + name + " and I am " + age + " year old" + breed + ", What breed are you?";

    }

    }
