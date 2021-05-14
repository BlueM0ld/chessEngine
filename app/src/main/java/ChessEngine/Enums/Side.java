package ChessEngine.Enums;

public enum Side {
    BLACK,
    WHITE;

    public Side turn(){
        if(this.equals( WHITE)){
            return BLACK;
        }else{
            return WHITE;
        }
    }
}
