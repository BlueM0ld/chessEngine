package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.IllegalMoveException;
import ChessEngine.Board.Position;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

    Position position;

    public Rook(Position position){this.position = position;}

    @Override
    public String typeOfPiece() {
        return "ROOK";
    }

    @Override
    public List<Position> movePositions(ChessBoard board) {
        List<Position> listOfMoves = new ArrayList<>();
        int currentFilePosition = position.getFile();
        int currentRankPosition = position.getRank();

        Position futurePosition;

        try{
            for(int i = 0; i<8 ; i++) {
                listOfMoves.add(new Position(i, currentRankPosition));
                listOfMoves.add(new Position(currentFilePosition, i));
            }
        }catch (IllegalMoveException e){
            System.out.println("Illegal move caught");
        }
        return null;
    }

    @Override
    public Boolean enPassantBoolean() {
        return false;
    }
}
