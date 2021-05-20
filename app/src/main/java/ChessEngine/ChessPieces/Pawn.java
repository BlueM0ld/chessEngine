package ChessEngine.ChessPieces;

import java.util.ArrayList;
import java.util.List;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;
import ChessEngine.Board.Tile;
import ChessEngine.Enums.Pieces;
import ChessEngine.Enums.Side;
import ChessEngine.Exceptions.IllegalPositionException;

/**
 * Pawn
 */
public class Pawn extends Piece{

    Position position;

    public Pawn(Position position, Side side){
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }
    
    @Override
    public Pieces typeOfPiece(){
        return Pieces.P;
    }

    @Override
    public List<Position> movePositions(ChessBoard board) {
        return null;
    }

    @Override
        public List<Position> movePositions(Tile tile,ChessBoard chessBoard){
            List <Position> listOfMoves = new ArrayList<>();
            //int currentRankPos = position.getRank();
            //TODO At the first move can move 1 square or 2 square else 1
            //TODO Capture is opposite piece is 1 square diagonal
    
            Position futurePosition;
            try {
                //Lmaooooooo gotta figure out black cause the moves are inverted....whoops
                futurePosition = new Position(this.position.getRank()+1, this.position.getFile());
            } catch (IllegalPositionException e) {
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
    public Boolean enPassantBoolean(){
        return false;
    };
}