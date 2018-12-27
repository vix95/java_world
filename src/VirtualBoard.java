import javax.swing.JPanel;
import java.awt.GridLayout;

@SuppressWarnings("WeakerAccess")
public class VirtualBoard extends JPanel {
    private final BoardArea[][] organismArray;
    private final int x;
    private final int y;

    public VirtualBoard(int x, int y, WorldBoard worldBoard) {
        this.x = x;
        this.y = y;
        setLayout(new GridLayout(x, y, 0, 0));
        this.organismArray = new BoardArea[x][y];

        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                organismArray[i][j] = new BoardArea(x, y, worldBoard);
                add(organismArray[i][j]);
            }
        }
    }

    public void setLabelOnArea(String label, int x, int y) {
        organismArray[x][y].setLabel(label);
    }

    public void clearArea() {
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                this.organismArray[i][j].clearField();
            }
        }
    }
}
