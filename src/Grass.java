@SuppressWarnings("WeakerAccess")
public class Grass extends Plant {
    public Grass(){}

    public Grass(Coordinates coordinates, World board) {
        super("Grass", 0, 0, coordinates, board);
        this.setName("g");
    }
}
