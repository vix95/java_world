import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

@SuppressWarnings("WeakerAccess")
public class BoardArea extends JPanel {
    private JLabel label;

    public BoardArea(WorldBoard worldBoard) {
        RightClickMouse rightClickMouse = new RightClickMouse(worldBoard);
        addMouseListener(rightClickMouse);
        setBackground(Color.white);
        label = new JLabel();
        add(label);
    }

    public void setLabel(String str) {
        label.setText(str);

        switch (str) {
            case "g":
                setBackground(Color.green);
                break;
            case "s":
                setBackground(Color.gray);
                break;
        }
    }

    public void clearField() {
        label.setText("");
        setBackground(Color.white);
    }
}
