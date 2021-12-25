public class Main {

    public static void main(String[] args) {
        GUIBoard chessBoard = GUIBoard.getInstance();
        chessBoard.setVisible(true);
        BoardLog boardlog = new BoardLog();
        Board.attach(boardlog);
        Board.attach(chessBoard);
        Game.initGame();
    }

}
