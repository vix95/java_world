import java.util.Random;

public class Grass extends Plant {
    public Grass(Coordinates coordinates, World world) {
        super("Grass", 0, 0, coordinates, world);
        this.setName("g");
    }

    @Override
    public void multiply() {

    }
}
