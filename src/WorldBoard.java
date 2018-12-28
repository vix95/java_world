import java.util.Random;

@SuppressWarnings("WeakerAccess")
public class WorldBoard extends World {
    public WorldBoard(int x, int y) {
        super(x, y);
        myFrame = new MyFrame(x, y, this);
    }

    public void newGame() {
        Random rand = new Random();
        organismArray.clear();

        int organismsQty = rand.nextInt(20) + minOrganismQty;
        for (int i = 0; i < organismsQty; i++) {
            this.addOrganism(organismList.get(rand.nextInt(organismList.size())),
                    new Coordinates(rand.nextInt(size.x), rand.nextInt(size.y)));
        }

        this.drawWorld();
    }

    public void nextTurn() {
        for (Organism organism : organismArray) {
            organism.doMove();
        }

        this.drawWorld();
    }
}
