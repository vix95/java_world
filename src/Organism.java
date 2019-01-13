@SuppressWarnings("WeakerAccess")
public class Organism {
    private String name;
    private String short_name;
    private int strength;
    private int age;
    private int movement;
    private boolean move = true;
    private Coordinates coordinates;
    private boolean destroyed = false;
    public World world;
    private int young;

    public Organism(){}

    public Organism(String name, String short_name, int strength, int movement, Coordinates coordinates, World world) {
        this.name = name;
        this.short_name = short_name;
        this.strength = strength;
        this.age = 0;
        this.movement = movement;
        this.coordinates = coordinates;
        this.world = world;
        this.young = 0;
    }

    public void doMove() {
        this.setAge(this.getAge() + 1);
        world.checkCollision(this);
    }

    public void collision(Organism org1, Organism org2) {
        if (org1.getName().equals(org2.getName())) {
            multiply();
            org1.setYoung(org1.getYoung() + 1);
            org2.setYoung(org2.getYoung() + 1);
        } else if (org1.getStrength() >= org2.getStrength()) {
            org1.setStrength(org1.getStrength() + 1);
            org2.setDestroyed(true);
            this.world.organismArray.remove(org2);
        } else {
            org2.setStrength(org2.getStrength() + 1);
            org1.setDestroyed(true);
            this.world.organismArray.remove(org1);
        }
    }

    public void multiply() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
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

    public int getYoung() {
        return young;
    }

    public void setYoung(int young) {
        this.young = young;
    }

    public String getShort_name() {
        return short_name;
    }
}
