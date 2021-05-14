package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece{

    Position position;
    //Maybe it will be easier ( ;-;)
    int [][] potentialMove = {
            {1,-1},
            {1,0},
            {1,1},
            {0,-1},
            {0,1},
            {-1,-1},
            {-1,0},
            {-1,1}
    };

    public King(Position position){this.position = position;}
    @Override
    public String typeOfPiece() {
        return "KING";
    }

    @Override
    public List<Position> movePositions(ChessBoard board) {
        List <Position> listOfMoves = new ArrayList<>();
        // int kingFile = position.getFile();
        // int kingRank = position.getRank();
        // for(int i = 0; i<potentialMove.length; i++){

        //     listOfMoves.add(new Position(kingFile+potentialMove[i][i]));
        // }
        return listOfMoves;
    }

    @Override
    public Boolean enPassantBoolean() {
        return null;
    }
}
