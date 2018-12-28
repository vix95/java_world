import java.awt.EventQueue;

public class java_world {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { new WorldBoard(20, 20); }
        });
    }
}
