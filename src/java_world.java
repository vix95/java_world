import java.awt.EventQueue;
import java.util.concurrent.TimeUnit;

public class java_world {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                WorldBoard worldBoard = new WorldBoard(20, 20);
            }
        });
    }
}
