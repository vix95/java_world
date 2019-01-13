import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

@SuppressWarnings("WeakerAccess")
public class BoardArea extends JPanel {
    private JLabel label;

    public BoardArea(int x, int y, WorldBoard worldBoard) {
        RightClickMouse rightClickMouse = new RightClickMouse(x, y, worldBoard);
        addMouseListener(rightClickMouse);
        setBackground(Color.white);
        label = new JLabel();
        add(label);
    }

    public void setLabel(String str) {
        label.setText(str);

        switch (str) {
            case "g":
                setBackground(Color.green); break;

            case "s":
                setBackground(Color.gray); break;

            case "w":
                setBackground(Color.darkGray); break;

            case "m":
                setBackground(Color.red); break;
        }
    }

    public void clearField() {
        label.setText("");
        setBackground(Color.white);
    }
}
