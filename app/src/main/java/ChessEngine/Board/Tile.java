package ChessEngine.Board;

/**
 * Tile
 */
class Tile {

    Piece pieceType;
    Position postion;
    Boolean isOccupied;

    public Tile(Piece piece, Position postion){
        this.pieceType = piece;
        this.postion = postion;
        this.isOccupied = true;
    }

    public Tile(Position postion){
        this.postion = postion;
        this.isOccupied = false;
    }

    public Position getPosition(){
        return this.postion;
    }

    public Position setPosition(Position newPosition){
        this.postion = newPosition;
    }

    public Piece getPiece(){
        return this.pieceType;
    }

    public Piece setPiece(Piece newPiece){
        this.pieceType = newPiece;
    }

    public Boolean getIsOccupied(){
        return this.isOccupied;
    }

    public Boolean setIsOccupied(Boolean occupyFlag){
        this.isOccupied = occupyFlag;
    }


}