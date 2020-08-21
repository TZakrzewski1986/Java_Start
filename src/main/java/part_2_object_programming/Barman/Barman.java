package part_2_object_programming.Barman;

public class Barman {

    public static Drink createDrink(String ingredient1, double amount1, String ingredient2, double amount2,
                                    String ingredient3, double amount3) {

        Ingredient ing1 = new Ingredient(ingredient1, amount1);
        Ingredient ing2 = new Ingredient(ingredient2, amount2);
        Ingredient ing3 = new Ingredient(ingredient3, amount3);
        return new Drink(ing1, ing2, ing3);
    }

    public static void printDrink(Drink drink) {
        double ingredientSum = drink.getFirstIngredient().getAmountOfIngredient() + drink.getSecondIngredient().getAmountOfIngredient()
                + drink.getThirdIngredient().getAmountOfIngredient();
        double ing1Part = drink.getFirstIngredient().getAmountOfIngredient() / ingredientSum;
        double ing2Part = drink.getSecondIngredient().getAmountOfIngredient() / ingredientSum;
        double ing3Part = drink.getThirdIngredient().getAmountOfIngredient() / ingredientSum;
        System.out.printf("Składniki drinka to: %s, %s, %s", drink.getFirstIngredient().getIngredientsName(),
                drink.getSecondIngredient().getIngredientsName(), drink.getThirdIngredient().getIngredientsName());

        System.out.printf(" w proporcjach: %.2f, %.2f, %.2f.\n", ing1Part, ing2Part, ing3Part);
        System.out.printf("Jego pojemność to: %.0fml.\n", ingredientSum);
    }
}
