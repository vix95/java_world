@SuppressWarnings("WeakerAccess")
public class Organism {
    private String name;
    private int strong;
    private int age;
    private int movement;
    private boolean move = true;
    private Coordinates coordinates;
    private boolean destroyed = false;
    public World world;

    public Organism(){}

    public Organism(String name, int strong, int movement, Coordinates coordinates, World world) {
        this.name = name;
        this.strong = strong;
        this.age = 0;
        this.movement = movement;
        this.coordinates = coordinates;
        this.world = world;
    }

    public void doMove() {
        this.setAge(this.getAge() + 1);
    }

    public void multiply() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
}
