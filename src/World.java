import java.util.ArrayList;

@SuppressWarnings("WeakerAccess")
public class World {
    protected Coordinates size;
    protected ArrayList<Organism> organismArray;
    protected MyFrame myFrame;

    public World(int x, int y) {
        this.size = new Coordinates(x, y);
        this.organismArray = new ArrayList<>();
    }

    public Organism addOrganism(String name, Coordinates coordinates) {
        Organism newOrganism;

        switch (name) {
            case "Grass":
                newOrganism = new Grass(coordinates, this);
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
}
