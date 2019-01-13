public class Wolf extends Animal {
    public Wolf(Coordinates coordinates, World world) {
        super("Wolf", "w", 5, 1, coordinates, world);
    }

    public void multiply() {
        if (this.world.countOrganism(this.getName()) < 21) {
            this.world.addOrganism(this.getName(), this.getCoordinates());
            super.multiply();
        }
    }
}
