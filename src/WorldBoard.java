@SuppressWarnings("WeakerAccess")
public class WorldBoard extends World {
    public WorldBoard(int x, int y) {
        super(x, y);
        myFrame = new MyFrame(x, y, this);
    }

    public void newGame() {
        //Organism newOrganism = this.addOrganism("grass", new Coordinates(1, 1));

        this.drawWorld();
    }
}
