public class java_world {
    public static void main(String[] args) {
        WorldBoard worldBoard = new WorldBoard(50, 50);

        worldBoard.newGame();

        for (int i = 0; i < 100; i++) {
            worldBoard.nextTurn();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
