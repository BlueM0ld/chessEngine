package ChessEngine.Board;

import ChessEngine.Exceptions.IllegalPositionException;

/**
 * Position
 */
public class Position {

    int file;
    int rank;
    public Position(int file, int rank) throws IllegalPositionException {
        if(rank >=0 || rank <7 && file >=0 || rank <7){
            this.file = file;
            this.rank = rank;
        }else {
            throw new IllegalPositionException("Invalid Position");
        }
    }

    public int getFile(){
        return this.file;
    }

    public int getRank(){
        return this.rank;
    }
}