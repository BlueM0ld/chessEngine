package ChessEngine.Enums;

public enum Pieces {
    // W_KING('K','♔'),
    // W_QUEEN('Q','♕'),
    // W_ROOK('R','♖'),
    // W_BISHOP('B','♗'),
    // W_KNIGHT('N','♘'),
    // W_PAWN('P','♙'),
    // KING('k','♚'),
    // QUEEN('q','♛'),
    // ROOK('r','♜'),
    // BISHOP('b','♝'),
    // KNIGHT('n','♞'),
    // PAWN('p','♟'),
    // EMPTY('.','⛶');

    K('♔','♚'), //King
    Q('♕','♛'), //Queen
    R('♖','♜'), //Rook
    B('♗','♝'), //Bishop
    N('♘','♞'), //Knight
    P('♙','♟'), //Pawn
    E('⛶'); //Empty

    /**
     *
     */
    char emptyTile;
    char asciiWhitePiece;
    char asciiBlackPiece;
    // char shortNamePiece;

    // Pieces(char shortNamePiece,char asciiPiece)   {
    //     this.asciiPiece = asciiPiece;
    //     this.shortNamePiece = shortNamePiece;
    // }
    Pieces(char emptyTile)   {
        this.emptyTile = emptyTile;
    }
    
    Pieces(char asciiWhitePiece,char asciiBlackPiece)   {
        this.asciiWhitePiece = asciiWhitePiece;
        this.asciiBlackPiece = asciiBlackPiece;
    }

    public char getWhitePiece(){
        return asciiWhitePiece;
    }

    // public char getBlackPieces(char c){
    //     for(Pieces piece : Pieces.values()){
    //         if(piece.name()== String.valueOf(c)){
    //             return piece.getBlackPiece();
    //         }
    //     }
    // }
    
    public static char getPieces(char c){
        String pieceType = Character.toString(c);
        if(c == '.'){return Pieces.E.emptyTile;}
        for(Pieces piece : Pieces.values()){
            if(piece.name().contains(pieceType.toUpperCase())){
                if(Character.isUpperCase(c) == true){
                 return piece.getWhitePiece();
                }else{
                 return piece.getBlackPiece();
                }
            }
        }
        return '0';
    }

    public char getBlackPiece(){
        return asciiBlackPiece;
    }

    // public void tellItLikeItIs(char shortNamePiece) {
    //     switch (shortNamePiece) {
    //         case 'K':
    //             System.out.println(Pieces.W_KING.asciiPiece);
    //             break;
    //         case 'k':
    //             System.out.println(Pieces.KING.asciiPiece);
    //             break;
    //         case 'Q':
    //             System.out.println(Pieces.W_QUEEN.asciiPiece);
    //             break;
    //         case 'q':
    //             System.out.println(Pieces.QUEEN.asciiPiece);
    //             break;                    
    //         case 'R':
    //             System.out.println(Pieces.W_ROOK.asciiPiece);
    //             break;
    //         case 'r':
    //             System.out.println(Pieces.ROOK.asciiPiece);
    //             break;                     
    //         case 'B':
    //             System.out.println(Pieces.W_BISHOP.asciiPiece);
    //             break;
    //         case 'b':
    //             System.out.println(Pieces.BISHOP.asciiPiece);
    //             break;     
    //         case 'N':
    //             System.out.println(Pieces.W_KNIGHT.asciiPiece);
    //             break;
    //         case 'n':
    //             System.out.println(Pieces.KNIGHT.asciiPiece);
    //             break;  
    //         case 'P':
    //             System.out.println(Pieces.W_PAWN.asciiPiece);
    //             break;
    //         case 'p':
    //             System.out.println(Pieces.PAWN.asciiPiece);
    //             break;                      
    //         default:
    //             System.out.println(Pieces.EMPTY.asciiPiece);
    //             break;
    //     }
    // }
}
