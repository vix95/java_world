import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("WeakerAccess")
public class MyFrame extends JFrame implements ActionListener {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 600;
    private static final int WIDTHBOARD = 500;
    private static final int HEIGHTBOARD = 500;
    private WorldBoard worldBoard;
    private final VirtualBoard worldArea;

    int turnCounter = 0;

    private JButton newGame;
    private JButton nextTurn;

    public MyFrame(int x, int y, WorldBoard worldBoard) {
        super("Java World");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(200, 200);
        this.setSize(WIDTH, HEIGHT);
        this.setLayout(new FlowLayout());

        worldArea = new VirtualBoard(x, y, worldBoard);
        worldArea.setBackground(Color.white);
        worldArea.setLocation(0, 100);
        worldArea.setPreferredSize(new Dimension(WIDTHBOARD, HEIGHTBOARD));
        this.add(worldArea);

        newGame = new JButton("New Game");
        newGame.addActionListener(this);
        getContentPane().add(BorderLayout.WEST, newGame);

        JLabel credentials = new JLabel("Created by Pawel Labuda", JLabel.CENTER);
        this.getContentPane().add(credentials);
    }

    public void setLabelOnArea(String label, int x, int y) {
        worldArea.setLabelOnArea(label, x, y);
    }

    public void clearSpecifiedField() {
        worldArea.clearArea();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == newGame) {
        }
    }
}
