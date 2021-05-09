package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece{

    Position position;
    public Bishop(Position position){this.position = position;}
    @Override
    public String typeOfPiece() {
        return "BISHOP";
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
