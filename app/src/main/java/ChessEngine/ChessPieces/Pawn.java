package ChessEngine.ChessPieces;

import java.util.ArrayList;
import java.util.List;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.IllegalMoveException;
import ChessEngine.Board.Position;
import ChessEngine.Board.Tile;

/**
 * Pawn
 */
public class Pawn extends Piece{

    Position position;

    public Pawn(Position position){
        this.position = position;
    }

    @Override
    public String typeOfPiece(){
        return "PAWN";
    };
    
    @Override
    public List<Position> movePositions(ChessBoard chessBoard){
        List <Position> listOfMoves = new ArrayList<>();
        int currentFilePos = position.getFile();
        //TODO At the first move can move 1 square or 2 square else 1
        //TODO Capture is opposite piece is 1 square diagonal

        Position futurePosition;
        try {
            futurePosition = new Position(currentFilePos+1, position.getRank());
        } catch (IllegalMoveException e) {
            e.printStackTrace();
            return listOfMoves;
        }
        //Get future position of the chess piece
        final Tile futureMove =chessBoard.getTile(futurePosition);

//        if (!futureMove.getIsOccupied() && futureMove.getPosition().getFile() == 7){
           //TODO Promote Pawn
//        }
         if(!futureMove.getIsOccupied()) listOfMoves.add(futurePosition);

        return listOfMoves;
    };

    @Override
    public Boolean enpassantBoolean(){
        return false;
    };
}