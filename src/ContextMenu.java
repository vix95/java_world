import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class ContextMenu extends JPopupMenu {
    public ContextMenu(int x, int y, WorldBoard worldBoard) {
        JMenuItem[] menuLabel = new JMenuItem[2];
        menuLabel[0] = new JMenuItem("Grass");
        menuLabel[1] = new JMenuItem("Sheep");

        for(JMenuItem item : menuLabel) {
            add(item);
            item.addActionListener(new NewOrganism(item.getText(), x, y, worldBoard));
        }
    }
}
