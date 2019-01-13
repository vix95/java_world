import java.util.Random;

public class Grass extends Plant {
    public Grass(Coordinates coordinates, World world) {
        super("Grass", "g", 0, 0, coordinates, world);
    }

    public void doMove() {
        super.doMove();
    }

    public void multiply() {
        if (this.world.countOrganism(this.getName()) <= 40) {
            Random rand = new Random();
            if (rand.nextInt(5) == 0) {
                this.world.addOrganism(this.getName(), this.world.randomCoordinates(this.getCoordinates(), 1));
            }

            super.multiply();
        }
    }
}
