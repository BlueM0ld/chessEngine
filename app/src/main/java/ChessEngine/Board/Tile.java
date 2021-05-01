package ChessEngine.Board;

/**
 * Tile
 */
class Tile {

    Piece pieceType;
    Position postion;

    public Tile(Piece piece, Position postion){
        this.pieceType = piece;
        this.postion = postion;
    }

    public Tile(){
    }
}