import java.util.Random;

public class Muschroom extends Plant {
    public Muschroom(Coordinates coordinates, World world) {
        super("Muschroom", "m", 0, 0, coordinates, world);
    }

    public void doMove() {
        if (this.getAge() == 100) {
            for (int i = 0; i < 5; i++) multiply();
        }

        super.doMove();
    }

    public void multiply() {
        if (this.world.countOrganism(this.getName()) <= 20) {
            Random rand = new Random();
            if (rand.nextInt(10) == 0) {
                this.world.addOrganism(this.getName(), this.world.randomCoordinates(this.getCoordinates(), 1));
            }

            super.multiply();
        }
    }

    public void doAction(Organism another) {
        another.removeOrganism();
        this.world.addOrganism(this.getName(), this.world.randomCoordinates(this.getCoordinates(), 1));
    }
}
