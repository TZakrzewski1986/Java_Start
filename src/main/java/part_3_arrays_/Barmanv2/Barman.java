package part_3_arrays_.Barmanv2;

import java.util.Scanner;

public class Barman {

    public static Drink createDrink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość składników:");
        int amountOfIngredients = scanner.nextInt();
        Ingredient[] arrayOfIngredients = new Ingredient[amountOfIngredients];
        for (int i = 0; i < amountOfIngredients; i++) {
            System.out.println("Podaj nazwę składnika: ");
            String ingredientsName = scanner.next();
            System.out.println("Podaj ilość składnika: ");
            int ingredientsAmount = scanner.nextInt();
            arrayOfIngredients[i] = new Ingredient(ingredientsName, ingredientsAmount);
        }
        return new Drink(arrayOfIngredients);
    }

    public static void printDrink(Drink drink) {
        Ingredient[] ingredients = drink.getArrayOfIngredients();
        System.out.printf("Drink składa się z %d składników:\n", ingredients.length);
        for (Ingredient ingredient : ingredients) {
            System.out.printf("-%s (%.0f)\n", ingredient.getName(), ingredient.getAmount());
        }

    }
}
