@SuppressWarnings("WeakerAccess")
public class Organism {
    private String name;
    private String short_name;
    private int strength;
    private int age;
    private int movement;
    private boolean do_move = true;
    private Coordinates coordinates;
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

    public void collision(Organism another) {
        if (this.getName().equals(another.getName())) {
            this.increaseYoung();
            another.increaseYoung();
            this.multiply();
        } else this.doFight(another);
    }

    public void doAction(Organism another) {
    }

    public void removeOrganism() {
        world.organismArray.remove(this);
    }

    public void multiply() {
    }

    public void doFight(Organism another) {
        if (this.getStrength() >= another.getStrength()) {
            this.increaseStrength();
            another.removeOrganism();
            another.doAction(this);
        } else {
            another.increaseStrength();
            this.removeOrganism();
            this.doAction(another);
        }
    }

    private void increaseYoung() {
        this.setYoung(this.getYoung() + 1);
    }

    private void increaseStrength() {
        this.setStrength(this.getStrength() + 1);
    }

    private void increaseAge() {
        this.setAge(this.getAge() + 1);
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

    public boolean isDo_move() {
        return do_move;
    }

    public void setDo_move(boolean do_move) {
        this.do_move = do_move;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
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

    @Override
    public String toString() {
        return "Organism{" +
                "name='" + name + '\'' +
                ", short_name='" + short_name + '\'' +
                ", strength=" + strength +
                ", age=" + age +
                ", movement=" + movement +
                ", do_move=" + do_move +
                ", coordinates=" + coordinates +
                ", world=" + world +
                ", young=" + young +
                '}';
    }
}
