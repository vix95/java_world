import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

@SuppressWarnings("WeakerAccess")
public class ContextMenu extends JPopupMenu {
    private int menuLength;
    private JMenuItem[] menuLabel;

    public ContextMenu(int x, int y, WorldBoard worldBoard) {
        this.menuLength = 1;
        menuLabel = new JMenuItem[menuLength];
        menuLabel[0] = new JMenuItem("Grass");

        for(int i = 0; i < menuLength; i++) {
            add(menuLabel[i]);
            menuLabel[i].addActionListener(new NewOrganism(menuLabel[i].getText(), x, y, worldBoard));
        }
    }
}
