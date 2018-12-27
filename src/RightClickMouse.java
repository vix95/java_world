import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("WeakerAccess")
public class RightClickMouse extends MouseAdapter {
    private int x;
    private int y;
    private final WorldBoard worldBoard;

    public RightClickMouse(int x, int y, WorldBoard worldBoard) {
        this.x = x;
        this.y = y;
        this.worldBoard = worldBoard;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        if (MouseEvent.BUTTON3 == event.getButton()) {
            this.setY(event.getX());
            this.setX(event.getY());
            ContextMenu contextMenu = new ContextMenu(x, y, worldBoard);
            contextMenu.show(event.getComponent(), event.getX(), event.getY());
        }
    }
}
