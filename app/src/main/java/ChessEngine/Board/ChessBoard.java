package ChessEngine.Board;

import ChessEngine.Enums.Pieces;
import ChessEngine.Exceptions.IllegalPositionException;

public class ChessBoard{

    public void generateBoard() throws IllegalPositionException{

        //TODO: Generate Board
        char[] standardBoardSetup ={
            'R','N','B','Q','K','B','N','R',
            'P','P','P','P','P','P','P','P',
            '.','.','.','.','.','.','.','.',
            '.','.','.','.','.','.','.','.',
            '.','.','.','.','.','.','.','.',
            '.','.','.','.','.','.','.','.',
            'p','p','p','p','p','p','p','p',
            'r','n','b','q','k','b','n','r',
        };

        for(int i = 0; i<=standardBoardSetup.length-1;){
            //System.out.print(Pieces.);
            // if(i<14){Pieces.getPieces(standardBoardSetup[i],"W");}
            // if(i>49){Pieces.getPieces(standardBoardSetup[i],"B");}
           // System.out.print(Pieces.getPieces(standardBoardSetup[i]));
            System.out.print(Pieces.getPieces(standardBoardSetup[i]));
            i++;
            System.out.print("  ");
            if(i%8==0){System.out.println();}
            // System.out.println(Pieces.E);
        }
        
        // for(int rank=0; rank<8;rank++){
        //     for(int file=0; file<8;file++){
        //         System.out.print(Pieces.P.getWhitePiece());
        //         System.out.print(' ');
        //         // Tile empty = new Tile(new Position(rank,file));
        //     }
        //     System.out.println();
        // }
    }



    public Tile getTile(Position position){
        return null;
    }
}