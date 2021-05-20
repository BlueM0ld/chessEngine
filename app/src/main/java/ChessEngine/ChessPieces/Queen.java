package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;
import ChessEngine.Enums.Pieces;
import ChessEngine.Enums.Side;

import java.util.List;

public class Queen extends Piece{
    Position position;

    public Queen(Position position, Side side){this.position = position;}

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
        return Pieces.Q;
    }

    @Override
    public List<Position> movePositions(ChessBoard board) {
        return null;
    }

    @Override
    public Boolean enPassantBoolean() {
        return null;
    }
}
