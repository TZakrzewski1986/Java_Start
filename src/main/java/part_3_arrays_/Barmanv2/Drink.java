package part_3_arrays_.Barmanv2;

import java.util.ArrayList;

public class Drink {

private Ingredient[] arrayOfIngredients;

    public Drink(Ingredient[] arrayOfIngredients) {
        this.arrayOfIngredients = arrayOfIngredients;
    }

    public Ingredient[] getArrayOfIngredients() {
        return arrayOfIngredients;
    }

    public void setArrayOfIngredients(Ingredient[] arrayOfIngredients) {
        this.arrayOfIngredients = arrayOfIngredients;
    }
}
