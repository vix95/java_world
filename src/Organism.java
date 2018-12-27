@SuppressWarnings("WeakerAccess")
public class Organism {
    private String name;
    private int strong;
    private int age;
    private int movement;
    private boolean move = true;
    private Coordinates coordinates;
    private boolean destroyed = false;
    private World board;

    public Organism(){}

    public Organism(Coordinates coordinates, World board) {
        this.age = 0;
        this.coordinates = coordinates;
        this.board = board;
    }

    public Organism(String name, int strong, int movement, Coordinates coordinates, World board) {
        this.name = name;
        this.strong = strong;
        this.age = 0;
        this.movement = movement;
        this.coordinates = coordinates;
        this.board = board;
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

    public World getBoard() {
        return board;
    }

    public void setBoard(World board) {
        this.board = board;
    }
}
