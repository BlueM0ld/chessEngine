package ChessEngine.Board;

import ChessEngine.ChessPieces.*;
import ChessEngine.Enums.Pieces;
import ChessEngine.Enums.Side;
import ChessEngine.Exceptions.IllegalPositionException;

import java.util.HashMap;

public class ChessBoard{

    Tile[][] board = new Tile[8][8];
    HashMap<Tile, Piece> whiteOccupiedTiles= new HashMap<>();
    HashMap<Tile, Piece> blackOccupiedTiles = new HashMap<>();

    //BLEH 
    public ChessBoard(char[] setup) throws IllegalPositionException{
        int boardPointer = 0;
        for (int rank = 7; rank >= 0; rank--) {
            for (int file = 0; file <8; file++) {
                Position tilePosition = new Position(rank, file);
                Tile tile =  setPiece(setup[boardPointer],tilePosition);
                board[rank][file] = tile;
                boardPointer++;
            }
        }
    }

    private Tile setPiece(char c, Position tilePosition) {
        Tile tile;
        Piece piece;
        Side side = isWhatSide(c);
        char setToLower = Character.toLowerCase(c);

        if(side.equals(Side.NONE)){
            return new Tile(tilePosition);
        }
        
        switch(setToLower){
            case 'k':
                // hmmmmmm this is sus....whoops
                piece = new King(tilePosition, side);
                break;

            case 'q':
                piece = new Queen(tilePosition, side);
                break;

            case 'b':
                piece = new Bishop(tilePosition, side);
                break;

            case 'n':
                piece = new Knight(tilePosition, side);
                break;

            case 'r':
                piece = new Rook(tilePosition,side);
                break;

            default:    //default is pawn
                piece = new Pawn(tilePosition,side);
                break;
        }
        tile = new Tile(piece, tilePosition);

        if(side.equals(Side.WHITE)){whiteOccupiedTiles.put(tile,piece);}
        if(side.equals(Side.BLACK)){blackOccupiedTiles.put(tile,piece);}
        return tile;
    }

    private Side isWhatSide(char c) {
        if(Character.isLowerCase(c)){return Side.BLACK;}
        if(Character.isUpperCase(c)){return Side.WHITE;}
        return Side.NONE;
    }

    public Tile[][] getBoard() {
        return board;
    }

    public void setBoard(Tile[][] board) {
        this.board = board;
    }

    public HashMap<Tile, Piece> getTilesOccupiedByWhite() {
        return whiteOccupiedTiles;
    }

    public HashMap<Tile, Piece> getTilesOccupiedByBlack() {
        return blackOccupiedTiles;
    }


    public Tile getTile(Position position){
        int file = position.getFile();
        int rank = position.getRank();

        return board[rank][file];
    }

    public Position getPosition(String chessNotationString) throws IllegalPositionException {
        
        int fileV= calculateFile(chessNotationString);
        int rankV= calculateRank(chessNotationString);

        return new Position(rankV,fileV);
    }

    public int calculateFile(String chessNotationString) {
        // a is 97
        char file =chessNotationString.charAt(0); //d 100

        return (int) file -97;
    }
    public int calculateRank(String chessNotationString) {
        char rank =chessNotationString.charAt(1); //d 100
        int changeRank = Character.getNumericValue(rank);
        return  changeRank-1;
    }

    public void printBoard(){
        for (int rank = 0; rank < 8; rank++) {
            for (int file = 0; file <8; file++) {
                Tile tile = board[file][rank];
                if(tile.isOccupied){System.out.print(tile.pieceType.typeOfPiece());}
                else{System.out.print(".");}
                System.out.print("  ");
            }
            System.out.println();
        
    }
}

}