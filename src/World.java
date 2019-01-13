import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("WeakerAccess")
public class World {
    protected Coordinates size;
    protected MyFrame myFrame;
    protected ArrayList<Organism> organismArray = new ArrayList<>();
    protected ArrayList<String> organismList = new ArrayList<>();
    protected String[] animalsArr = {"Sheep", "Wolf"};
    protected String[] plantsArr = {"Grass", "Muschroom"};
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

            case "Wolf":
                newOrganism = new Wolf(coordinates, this);
                break;

            case "Muschroom":
                newOrganism = new Muschroom(coordinates, this);
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
            myFrame.setLabelOnArea(organism.getShort_name(), organism.getCoordinates().x, organism.getCoordinates().y);
        });
    }

    public boolean onArea(Coordinates coordinates) {
        return coordinates.x >= 0 && coordinates.x < size.x && coordinates.y >= 0 && coordinates.y < size.y;
    }

    public int countOrganism(String name) {
        int count = 0;
        for (Organism org : organismArray) {
            if (org.getName().equals(name)) {
                count++;
            }
        }

        return count;
    }

    public Coordinates randomCoordinates(Coordinates basicCoordinates, int movement) {
        Random rand = new Random();
        Coordinates coordinates = new Coordinates(basicCoordinates.x, basicCoordinates.y);

        int moveRemaining = movement;
        while (moveRemaining > 0) {
            int try_count = 10;  // block for infinity loop
            do {
                coordinates = new Coordinates(coordinates.x + (rand.nextInt(3) - 1),
                        coordinates.y + (rand.nextInt(3) - 1));

                if (try_count-- == 0) {
                    coordinates = basicCoordinates;
                    break;
                }
            } while (!onArea(coordinates));
            moveRemaining--;
        }

        return coordinates;
    }

    public void checkCollision(Organism organism) {
        for (Organism org : organismArray) {
            if (organism.getCoordinates().equals(org.getCoordinates()) && !organism.equals(org)) {
                organism.collision(org);
                break;
            }
        }
    }
}
