import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class BoardLog implements Observer {
    private static final List<Piece[][]> boardLog = new ArrayList<Piece[][]>();
    private static int moveCount=-1;

    public static Piece[][] sendLatest(){
        if(moveCount>0){
            boardLog.remove(moveCount);
            //System.out.println("The size of boardLog "+ valueOf( boardLog.size()));
            moveCount--;
            //System.out.println("moveCount equals "+valueOf(moveCount));
            Game.switchSide();
            return boardLog.get(moveCount);
        }else{
            return boardLog.get(0);
        }
    }

    @Override
    public void update() {
        Piece[][] boardCopy = new Piece[8][8];
        for (int row = 0 ; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                boardCopy[row][col] = Board.sendBoard()[row][col];
            }
        }
        boardLog.add(boardCopy);
        moveCount++;
    }
}
