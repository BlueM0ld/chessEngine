package ChessEngine.ChessPieces;

import java.util.ArrayList;
import java.util.List;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;
import ChessEngine.Enums.Pieces;
import ChessEngine.Enums.Side;
import ChessEngine.Exceptions.IllegalPositionException;

public class Rook extends Piece {

    Position position;

    public Rook(Position position, Side side){this.position = position;}

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
        return Pieces.R;
    }

    @Override
    public List<Position> movePositions(ChessBoard board) {
        List<Position> listOfMoves = new ArrayList<>();
        int currentFilePosition = position.getFile();
        int currentRankPosition = position.getRank();

        // Position futurePosition;

        try{
            for(int i = 0; i<8 ; i++) {
                listOfMoves.add(new Position(i, currentRankPosition));
                listOfMoves.add(new Position(currentFilePosition, i));
            }
        }catch (IllegalPositionException e){
            System.out.println("Illegal move caught");
        }
        return null;
    }

    @Override
    public Boolean enPassantBoolean() {
        return false;
    }
}
