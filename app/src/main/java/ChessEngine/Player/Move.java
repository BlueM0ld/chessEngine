package ChessEngine.Player;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ChessEngine.Board.ChessBoard;
import ChessEngine.Board.Position;
import ChessEngine.Board.Tile;
import ChessEngine.ChessPieces.Piece;
import ChessEngine.Enums.Side;
import ChessEngine.Exceptions.IllegalPositionException;



public class Move {


    private static HashMap<Tile, Piece> pieces;

	public static void readMove(String playerInput, Side player, ChessBoard board) {

	    //Need to figure out how it works for shorter notations e.g Pa2a3: Pawn from tile a2 to tile a3
        Pattern p = Pattern.compile("(K?|Q?|N?|B?|R?|P)([a-h][0-7])?(x?)([a-h][0-7])");
        Matcher m = p.matcher(playerInput);
        boolean validMove = m.matches(); // Need it so it matches regex

        // String playerMove = m.group(0);
        String piece = m.group(1);
        String fromTileCn= m.group(2);
        //String takePiece = m.group(3);
        String toTileCn = m.group(4);

        if(player.equals(Side.BLACK)){pieces = board.getTilesOccupiedByBlack();}
        else{pieces = board.getTilesOccupiedByWhite();}


        verifyMove(board, piece, fromTileCn, toTileCn);


    }

    private static void verifyMove(ChessBoard board, String piece, String fromTileCn, String toTileCn) {
        try {
            Position pieceOldPos = board.getPosition(fromTileCn);
            Tile oldPieceTile = board.getTile(pieceOldPos);

            Position pieceNewPos = board.getPosition(toTileCn);
            //System.out.println(pieceNewPos.getChessNotation());
            
            Tile newPieceTile = board.getTile(pieceNewPos);

            List<Position> positionByPiece = getAllPossibleMoves(board, piece);

            for (Position position : positionByPiece) {
                if((pieceNewPos.getChessNotation()).equals(position.getChessNotation())){
                    move(oldPieceTile,newPieceTile);
                    System.out.println("Valid");
                    break;
                }
            }

        } catch (IllegalPositionException e) {
            // TODO catch block
            e.printStackTrace();
        }
    }

    public static void move(Tile fromOldTile, Tile toNewTile) {
        toNewTile.setPiece(fromOldTile.getPiece());
        toNewTile.setIsOccupied(true);

        fromOldTile.removePiece(); 
        fromOldTile.setIsOccupied(false);
        
    }


    public static List<Position> getAllPossibleMoves(ChessBoard board,String piece){
       //get all white pieces
       List<Position> newPiecePositionsList = new ArrayList<>();
        //get tiles that are occupied by side would be better than all
        for(final Tile tile: pieces.keySet()){
            if(tile.getPiece().typeOfPiece().toString().equals(piece)){
              List<Position> a = tile.getPiece().movePositions(tile,board);
              newPiecePositionsList.addAll(a);
            }
        }
        return newPiecePositionsList;    
    }




    public static Side moveTurn(Side player ) {
        System.out.print("Player " + player + " :") ; // add in enum for allegiance 
        player = player.turn();
        return player;
    }
}
