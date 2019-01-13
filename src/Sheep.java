public class Sheep extends Animal {
    public Sheep(Coordinates coordinates, World world) {
        super("Sheep", "s", 1, 1, coordinates, world);
    }

    public void doMove() {
        if (this.getAge() > 50) {
            this.removeOrganism();
        }

        super.doMove();
    }

    public void multiply() {
        if (this.world.countOrganism(this.getName()) < 21) {
            this.world.addOrganism(this.getName(), this.getCoordinates());
            super.multiply();
        }
    }
}
