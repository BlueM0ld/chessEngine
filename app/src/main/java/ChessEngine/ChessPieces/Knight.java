package ChessEngine.ChessPieces;

/**
 * Knight
 */
public class Knight extends PieceInterface {

    Position position;

    public Knight(Position postion){
        this.position = postion;
    }

    @Override
    public String typeOfPiece(){
        return "KNIGHT";
    };
    
    @Override
    public List<String> movePositions(){

    };

    @Override
    public Boolean enpassantBoolean(){};
}