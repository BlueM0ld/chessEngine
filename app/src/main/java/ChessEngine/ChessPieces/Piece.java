package ChessEngine.ChessPieces;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;
import ChessEngine.Board.Tile;
import ChessEngine.Enums.Pieces;

import java.util.List;

public abstract class Piece {

    public abstract Position getPosition();
    public abstract void setPosition(Position position);
    public Pieces typeOfPiece(){ return Pieces.E; };
    public abstract List<Position> movePositions(ChessBoard board);
    public abstract Boolean enPassantBoolean();
	public List<Position> movePositions(Tile tile,ChessBoard chessBoard) {return null;}
    // public Map<PieceType,Position> movePositions(Tile tile,ChessBoard chessBoard) {
	// 	return null;
	// }
}
