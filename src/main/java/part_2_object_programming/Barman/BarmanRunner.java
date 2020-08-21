package part_2_object_programming.Barman;

public class BarmanRunner {
    public static void main(String[] args) {
        Drink drinkShock = Barman.createDrink("Woda", 300.0, "Coca-Cola", 200.0, "Wódka", 100.0);
        Barman.printDrink(drinkShock);
    }
}
