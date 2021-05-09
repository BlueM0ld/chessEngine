package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;

import java.util.List;


/**
 * Knight
 */
public class Knight extends Piece {

    Position position;

    public Knight(Position position){
        this.position = position;
    }

    @Override
    public String typeOfPiece(){
        return "KNIGHT";
    };
    
    @Override
    public List<Position> movePositions(ChessBoard chessBoard){

        return null;
    };

    @Override
    public Boolean enPassantBoolean(){
        return false;
    };
}