package part_2_object_programming;

public class CabrioRunner {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("Opel", "Cabrio");
        cabrio.setRoofOpen(true);
        System.out.printf("Status samochodu. W ruchu: %s, Dach otwarty: %s\n", cabrio.isMoving(), cabrio.isRoofOpen());
        cabrio.setMoving(true);
        cabrio.setRoofOpen(false);
        System.out.printf("Status samochodu, W ruchu: %s, Dach otwarty: %s", cabrio.isMoving(), cabrio.isRoofOpen());

    }
}
