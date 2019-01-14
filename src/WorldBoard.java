import java.util.Random;
import java.util.concurrent.ExecutionException;

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
            Coordinates coordinates = new Coordinates(rand.nextInt(size.x), rand.nextInt(size.y));

            boolean canSet = true;
            for (Organism org : organismArray) {
                if (coordinates.equals(org.getCoordinates())) {
                    canSet = false;
                    break;
                }
            }

            if (canSet) this.addOrganism(organismList.get(rand.nextInt(organismList.size())), coordinates);
        }

        this.drawWorld();
    }

    public void nextTurn() {
        //for (int i = 0; i < organismArray.size(); i++) {
        //    organismArray.get(i).doMove();
        //}

        for (Organism organism : organismArray) {
            if (!organism.isDestroyed()) {
                organism.doMove();
            }
        }

        this.drawWorld();
    }
}
