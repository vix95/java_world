public class Animal extends Organism {
    public Animal(String name, int strong, int movement, Coordinates coordinates, World board) {
        super(name, strong, movement, coordinates, board);
    }

    @Override
    public void doMove() {
        Coordinates coordinates = world.randomCoordinates(this.getCoordinates(), this.getMovement());
        this.setCoordinates(coordinates);
    }
}
