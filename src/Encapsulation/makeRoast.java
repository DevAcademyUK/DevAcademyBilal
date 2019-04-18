package Encapsulation;

public class makeRoast {

    secretSundayRoast roast = new secretSundayRoast();

    public static void main (String [] args ) {
        makeRoast MR = new makeRoast();
    }

    private void addIngredients () {

        roast.addIngredient(new ingredient("chicken" , 14));
        roast.addIngredient(new ingredient("Roast Patatoes" , 56));
        roast.addIngredient(new ingredient("Broccoli" , 4));
        roast.addIngredient(new ingredient("Cauliflower" , 12));
        roast.addIngredient(new ingredient("Peas" , 75));
        roast.addIngredient(new ingredient("Carrots" , 4));
        roast.addIngredient(new ingredient("Parsnip" , 2));
        roast.addIngredient(new ingredient("russel Sprouts" , 1));


    }

    private void checkIngredients () {
        for (ingredient i : roast.getIngredients()){
            System.out.println("Ingredent: " + i.ingredientName
                    + ", Amount "+ i.ingredientQuantity);
        }


    }
 }
