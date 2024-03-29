package ChessEngine.Board;

import ChessEngine.ChessPieces.Piece;
import ChessEngine.Enums.Pieces;

/**
 * Tile
 */
public class Tile {

    Piece pieceType;
    Position position;
    Boolean isOccupied;

    public Tile(Piece pieceType, Position position){
        this.pieceType = pieceType;
        this.isOccupied = true;
        this.position = position;
    }

    public Tile(Position position){
        this.position = position;
        this.isOccupied = false;
    }

    public Position getPosition(){
        return this.position;
    }

    public void setPosition(Position newPosition){
        this.position = newPosition;
    }

    public Piece getPiece(){
        return this.pieceType;
    }

    public void setPiece(Piece newPiece){
        this.pieceType = newPiece;
    }

    public Boolean getIsOccupied(){
        return this.isOccupied;
    }

    public void setIsOccupied(Boolean occupyFlag){
        this.isOccupied = occupyFlag;
    }

    public void removePiece() {
        this.pieceType = null;
    }


}