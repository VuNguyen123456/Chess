/*
* Names: Vu Nguyen
* netID: vnguy7
* G#: 01390056
* Lecture section: 004
* Lab section: 208
*/
// The Board method
public class Board {
    //field
    private static Piece[][] pieces;

    //helper
    /**
     * This method help the Board class to count all the chess piece present in it
     * @param name
     * @return
     */
    private static int countPiece(String name){
        int count = 0;
        for(int i = 0; i < pieces.length; ++i){
            for(int j = 0; j < pieces[i].length; ++j){
                if (pieces[i][j] == null){
                    count += 0;
                }
                else if (pieces[i][j].getLetter().equals(name)){
                    count += 1;
                }
            }
        }
        return count;
    }

    //non - parametric constructor
    //create a blank table of 8x8
    public Board(){
        pieces = new Piece[8][8];
    }

    //parametric constructor
    /**
     * Create a table with personal customization
     * @param pieces
     */
    public Board(Piece[][] pieces){
        this.pieces = pieces;
    }

    //method
    /**
     * This method set a piece on the Board
     * @param piece
     * @param x
     * @param y
     */
    public void setPiece(Piece piece, int x, int y){
        if ((x >= 1 && x<=8) && (y<=8 && y>=1 )){
        pieces[x-1][y-1] = piece;
        }
    }
    /**
     * Return a reference to the public array pieces for other class to use
     * @return
     */
    public static Piece[][] getPieces(){
        Piece[][] temp = pieces;
        return temp;
    }
    /**
     * Return the relative value of all the pieces in the boad
     * @return
     */
    public double relativeEvaluation(){
        double sum = 0;
        for(int i = 0; i < pieces.length; ++i){
            for(int j = 0; j < pieces[i].length; ++j){
                if (pieces[i][j] == null){
                    sum += 0;
                }
                else{
                    sum += pieces[i][j].getValue();
                }
            }
        }
        return sum;
    }
    /**
     * Return the adjusted value of all the pieces in the boad
     * @return
     */
    public double adjustedEvaluation(){
        double sum = 0;
        for(int i = 0; i < pieces.length; ++i){
            for(int j = 0; j < pieces[i].length; ++j){
                if (pieces[i][j] == null){
                    sum += 0;
                }
                else{
                    sum += pieces[i][j].computeAdjustedValue();
                }
            }
        }
        return sum;
    }
    /**
     * toString method to display the state of the board
     */
    public String toString(){
         String str = "Board has:\n";
         int majorCount = countPiece("R") + countPiece("Q");
         int minorCount = countPiece("N") + countPiece("B");
         str += "-King:" + countPiece("K") + "\n";
         str += "-Pawns:" + countPiece("") + "\n"; // might count all the hollow square but likely not
         str += "-MajorPieces:" + majorCount + "\n";
         str += "-MinorPieces:" + minorCount + "\n";
         return str;

    }
}