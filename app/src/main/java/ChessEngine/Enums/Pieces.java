package ChessEngine.Enums;

public enum Pieces {
    // KING,
    // QUEEN,
    // KNIGHT,
    // BISHOP,
    // ROOK,
    // PAWN,
    // K('♔','♚'), //King
    // Q('♕','♛'), //Queen
    // R('♖','♜'), //Rook
    // B('♗','♝'), //Bishop
    // N('♘','♞'), //Knight
    // P('♙','♟'), //Pawn
    // E('⛶'); //Empty
    K('k','K'), //King
    Q('q','Q'), //Queen
    R('r','R'), //Rook
    B('b','B'), //Bishop
    N('n','N'), //Knight
    P('p','P'), //Pawn
    E('.'); //Empty

    /**
     *
     */
    char emptyTile;
    char asciiWhitePiece;
    char asciiBlackPiece;

    Pieces() { }

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
    
    public char getBlackPiece(){
        return asciiBlackPiece;
    }

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

}
