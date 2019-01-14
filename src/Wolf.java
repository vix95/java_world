public class Wolf extends Animal {
    public Wolf(Coordinates coordinates, World world) {
        super("Wolf", "w", 5, 1, coordinates, world);
    }

    public void doMove() {
        if (this.getAge() > 800) {
            this.world.removeOrganism(this);
        }

        if (this.world.countOrganism("Sheep") > 20) {
            this.doAction(this.world.getNearestOrganism(this.getCoordinates()));
        }

        super.doMove();
    }

    public void doAction(Organism organism) {
        int x_direction = 0;
        int y_direction = 0;

        if (this.getCoordinates().x - organism.getCoordinates().x + 1
                < this.getCoordinates().x - organism.getCoordinates().x) x_direction = 1;
        else x_direction = -1;

        if (this.getCoordinates().y - organism.getCoordinates().y + 1
                < this.getCoordinates().y - organism.getCoordinates().y) y_direction = 1;
        else y_direction = -1;

        Coordinates coordinates = new Coordinates(this.getCoordinates().x + x_direction,
                this.getCoordinates().y + y_direction);
        this.setCoordinates(coordinates);
        super.doAction(organism);
    }

    public void multiply() {
        super.doMultiply(-10);
        super.multiply();
    }
}
