package CreationalPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;
interface Prototype<T> {
    T clone();
}
class GamePieceWith implements Prototype<GamePieceWith>{
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



    public GamePieceWith(String color, int position){
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

    @Override
    public GamePieceWith clone() {
        return new GamePieceWith(this.color,this.position);
    }
}

class GameBoardWith implements Prototype<GameBoardWith> {
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

    @Override
    public GameBoardWith clone() {
        GameBoardWith newBoard = new GameBoardWith();
        for(GamePieceWith piece:pieces){
            newBoard.addPiece(piece.clone());
        }
        return newBoard;
    }
}


public class WithPrototype {
    public static void main(String[] args) {
        GameBoardWith gameBoard = new GameBoardWith();
        gameBoard.addPiece(new GamePieceWith("Red",1));
        gameBoard.addPiece(new GamePieceWith("Blue",5));
        gameBoard.showBoardState();

        //Checkpoint this state
        GameBoardWith copiedBoard = gameBoard.clone();

        System.out.println("Copied Board");
        copiedBoard.showBoardState();
    }
}
