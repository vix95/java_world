import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("WeakerAccess")
public class NewOrganism implements ActionListener {
    private final String name;
    private final int x;
    private final int y;
    private WorldBoard worldBoard;

    public NewOrganism(String name, int x, int y, WorldBoard worldBoard) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.worldBoard = worldBoard;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        worldBoard.addOrganism(name, new Coordinates(x, y));
        worldBoard.drawWorld();
    }
}
