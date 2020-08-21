package part_2_object_programming.Barman;

public class Drink {

    private Ingredient firstIngredient;
    private Ingredient secondIngredient;
    private Ingredient thirdIngredient;

    public Drink(Ingredient firstIngredient, Ingredient secondIngredient, Ingredient thirdIngredient) {
        this.firstIngredient = firstIngredient;
        this.secondIngredient = secondIngredient;
        this.thirdIngredient = thirdIngredient;
    }

    public Ingredient getFirstIngredient() {
        return firstIngredient;
    }

    public void setFirstIngredient(Ingredient firstIngredient) {
        this.firstIngredient = firstIngredient;
    }

    public Ingredient getSecondIngredient() {
        return secondIngredient;
    }

    public void setSecondIngredient(Ingredient secondIngredient) {
        this.secondIngredient = secondIngredient;
    }

    public Ingredient getThirdIngredient() {
        return thirdIngredient;
    }

    public void setThirdIngredient(Ingredient thirdIngredient) {
        this.thirdIngredient = thirdIngredient;
    }
}
