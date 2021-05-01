package ChessEngine.Board;

/**
 * Position
 */
public class Position {

    String file;
    String rank;
    public Position(String file, String rank){
        this.file = file;
        this.rank = rank;
    }

    public String getFile(){
        return this.file;
    }

    public String getRank(){
        return this.rank;
    }
}