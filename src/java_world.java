import java.awt.EventQueue;

public class java_world {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                WorldBoard worldBoard = new WorldBoard(20, 20);

                for (int i = 0; i < 50; i++) {
                    worldBoard.nextTurn();
                }
            }
        });
    }
}
