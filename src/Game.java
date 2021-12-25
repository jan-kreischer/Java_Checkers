import java.util.List;

public class Game {
    private static List<Integer> move;

    private static int player = 0;
    public static void switchSide() {
        player=(player+1)%2;
    }

    static String checkSide(int i) {
        return switch (i) {
            case 0 -> "(RED)";
            case 1 -> "(white)";
            default -> "error!";
        };
    }
    public static int getPlayer(){
        return player;
    }

    public static void initGame(){

        Board.initBoard();

        //add observer

        Board.notifyAllObservers();

        Board.print();

        while (!Board.gameOver()) {
//            move = Input.getInput(player);//get user input
            move = GUIBoard.getInput(player);
            while (move.size()==0){
                move = GUIBoard.getInput(player);
            }
            while (!Board.check(move)){//multiple jump
                Board.printErrorMessage();
                Board.notifyAllObservers();
                move = GUIBoard.getInput(player);
            }
            Board.execute(move);
            if (Board.ifMultipleJump()){
                move = GUIBoard.getInput(player);
                while (!Board.check(move)){
                    Board.notifyAllObservers();
                    Board.printErrorMessage();
                    move = GUIBoard.getInput(player);
                }
                Board.execute(move);
            }

            switchSide();
        }
        switchSide();
        System.out.println("Game Over! "+checkSide(player)+" WON!!!");


    }

}
