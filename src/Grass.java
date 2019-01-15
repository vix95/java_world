public class Grass extends Plant {
    public Grass(Coordinates coordinates, World world) {
        super("Grass", "g", 0, 0, coordinates, world);
    }

    public void doMove() {
        super.doMove();
    }

    public void multiply() {
        super.doMultiply(5);
        super.multiply();
    }
}
