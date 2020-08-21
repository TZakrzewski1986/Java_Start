package part_2_object_programming.Barman;

public class Ingredient {

    private String ingredientsName;
    private double amountOfIngredient;

    public Ingredient(String ingredientsName, double amountOfIngredient) {
        this.ingredientsName = ingredientsName;
        this.amountOfIngredient = amountOfIngredient;
    }

    public String getIngredientsName() {
        return ingredientsName;
    }

    public double getAmountOfIngredient() {
        return amountOfIngredient;
    }

    public void setAmountOfIngredient(double amountOfIngredient) {
        this.amountOfIngredient = amountOfIngredient;
    }

    public void setIngredientsName(String ingredientsName) {
        this.ingredientsName = ingredientsName;
    }
}
