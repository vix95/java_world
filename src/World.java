import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("WeakerAccess")
public class World {
    protected Coordinates size;
    protected MyFrame myFrame;
    protected ArrayList<Organism> organismArray = new ArrayList<>();
    protected ArrayList<String> organismList = new ArrayList<>();
    protected String[] animalsArr = {"Sheep"};
    protected String[] plantsArr = {"Grass"};
    protected int minOrganismQty = 8;

    public World(int x, int y) {
        this.size = new Coordinates(x, y);

        organismList.addAll(Arrays.asList(animalsArr));
        organismList.addAll(Arrays.asList(plantsArr));
    }

    public Organism addOrganism(String name, Coordinates coordinates) {
        Organism newOrganism;

        switch (name) {
            case "Grass":
                newOrganism = new Grass(coordinates, this);
                break;

            case "Sheep":
                newOrganism = new Sheep(coordinates, this);
                break;

                default:
                    return null;
        }

        organismArray.add(newOrganism);

        return newOrganism;
    }

    public void drawWorld() {
        myFrame.clearSpecifiedField();
        organismArray.forEach((organism) -> {
            myFrame.setLabelOnArea(organism.getName(), organism.getCoordinates().x, organism.getCoordinates().y);
        });
    }

    public boolean onArea(Coordinates coordinates) {
        return coordinates.x >= 0 && coordinates.x < size.x && coordinates.y >= 0 && coordinates.y < size.y;
    }

    public Coordinates randomCoordinates(Coordinates basicCoordinates, int movement) {
        Random rand = new Random();
        Coordinates coordinates = new Coordinates(basicCoordinates.x, basicCoordinates.y);

        int moveRemaining = movement;
        while (moveRemaining > 0) {
            do {
                coordinates = new Coordinates(coordinates.x + (rand.nextInt(3) - 1),
                        coordinates.y + (rand.nextInt(3) - 1));
            } while (!onArea(coordinates));
            moveRemaining--;
        }

        return coordinates;
    }
}
