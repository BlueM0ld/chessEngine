package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;
import ChessEngine.Enums.Pieces;
import ChessEngine.Enums.Side;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{


    Position position;
    public Bishop(Position position, Side side){this.position = position;}

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }


    @Override
    public Pieces typeOfPiece() {
        return Pieces.B;
    }

    @Override
    public List<Position> movePositions(ChessBoard board) {
        List<Position> listOfMoves = new ArrayList<>();
        return listOfMoves;
    }

    @Override
    public Boolean enPassantBoolean() {
        return false;
    }
}
