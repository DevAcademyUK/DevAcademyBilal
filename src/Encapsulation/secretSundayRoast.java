package Encapsulation;

import java.util.ArrayList;

public class secretSundayRoast {


    private ArrayList <ingredient> ingredients  = new ArrayList<ingredient>();




    public void addIngredient (ingredient i) {
        this.ingredients.add(i);

    }

    public ArrayList<ingredient> getIngredients () {
        return this.ingredients;
    }
}
