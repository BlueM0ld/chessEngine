package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;
import ChessEngine.Enums.Pieces;
import ChessEngine.Enums.Side;

import java.util.List;


/**
 * Knight
 */
public class Knight extends Piece {

    Position position;

    public Knight(Position position, Side side){
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
        return Pieces.N;
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