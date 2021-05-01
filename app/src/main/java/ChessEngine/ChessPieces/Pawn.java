package ChessEngine.ChessPieces;

import java.util.List;

import ChessEngine.Board.Position;

/**
 * Pawn
 */
public class Pawn {

    Position position;

    public Pawn(Position postion){
        this.position = postion;
    }

    @Override
    public String typeOfPiece(){
        return "PAWN";
    };
    
    @Override
    public List<String> movePositions(){
        List <Position> listOfMoves = new ArrayList<>();
        //TODO At the first move can move 1 square or 2 square else 1
        //TODO Capture is opposite piece is 1 square diagonal
        //TODO If postion in front return no moves
    };

    @Override
    public Boolean enpassantBoolean(){

    };
}