import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("WeakerAccess")
public class RightClickMouse extends MouseAdapter {
    private int x;
    private int y;
    private final WorldBoard worldBoard;

    public RightClickMouse(WorldBoard worldBoard) {
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
            this.setX(event.getX());
            this.setY(event.getY());
            ContextMenu contextMenu = new ContextMenu(x, y, worldBoard);
            contextMenu.show(event.getComponent(), x, y);
        }
    }
}
