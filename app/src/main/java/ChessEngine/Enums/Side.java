package ChessEngine.Enums;

public enum Side {
    BLACK,
    WHITE,
    NONE;

    public Side turn(){
        if(this.equals( WHITE)){
            return BLACK;
        }else{
            return WHITE;
        }
    }
}
