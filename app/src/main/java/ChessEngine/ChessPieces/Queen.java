package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;

import java.util.List;

public class Queen extends Piece{
    Position position;

    public Queen(Position position){this.position = position;}
    @Override
    public String typeOfPiece() {
        return "QUEEN";
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
