package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;

import java.util.List;

public abstract class Piece {

    public abstract String typeOfPiece();
    public abstract List<Position> movePositions(ChessBoard board);
    public abstract Boolean enPassantBoolean();
}
