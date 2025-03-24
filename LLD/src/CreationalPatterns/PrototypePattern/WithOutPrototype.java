package CreationalPatterns.PrototypePattern;


import java.util.ArrayList;
import java.util.List;


class GamePiece {
    public String getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    private String color;
    private int position;

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosition(int position) {
        this.position = position;
    }



    public GamePiece(String color,int position){
        this.color = color;
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }
}

class GameBoard {
    private List<GamePieceWith> pieces = new ArrayList<>();

    public void addPiece(GamePieceWith piece){
        pieces.add(piece);
    }

    public List<GamePieceWith> getPieces(){
        return pieces;
    }

    public void showBoardState(){
        for(GamePieceWith piece:pieces){
            System.out.println(piece);
        }
    }
}
public class WithOutPrototype {
    public static void main(String[] args) {
        GameBoardWith gameBoard = new GameBoardWith();
        gameBoard.addPiece(new GamePieceWith("Red",1));
        gameBoard.addPiece(new GamePieceWith("Blue",5));
        gameBoard.showBoardState();

        //Checkpoint this state
        GameBoardWith copiedBoard = new GameBoardWith();
        for(GamePieceWith piece: gameBoard.getPieces()){
            copiedBoard.addPiece(new GamePieceWith(piece.getColor(), piece.getPosition()));
        }

        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }
}
