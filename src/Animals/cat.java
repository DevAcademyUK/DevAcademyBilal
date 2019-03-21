package Animals;

public class cat {

    private  String name ;
    private  String gender;
    private  String eyes;
    private int age ;
    private  String size;
    private String breed;
    private String color;


    public cat(String name, int age,  String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String watching (String color){
        String watch = " ";
        if (color.equalsIgnoreCase("green")){
            watch = " Wow look green Cat " ;

        }
        else if (color.equalsIgnoreCase("black")) {
            watch = " That cat looks moody !!!!!!!!!";


        } else {
            watch = "Look Different coloured Cat!!!!";
        }
        return watch;
    }


    public String CATS ( String name, String color, int age ) {
        return  " Hello Alien " + name + " and I am " + age + " years old cat. My fur color is " + color + "!";

    }

}



