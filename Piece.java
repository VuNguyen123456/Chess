public abstract class Piece {
    private byte color;

    //contructor
    /**
     * Contructor of the piece color
     * @param color
     */
    public Piece (byte color){
        if(color == 1 || color == 2){
            this.color = color;
        }
        else{
            this.color = 1;
        }
    }

    //method
    /**
     * Return the color of the piece
     * @return
     */
    public byte getColor(){
        return color;
    }
    /**
     * return the String Location of the specific piece on the board
     * @return
     */
    public String getStringLocation(){
        char column = 'a';
        int row = 0;
       for (int i = 0; i < Board.getPieces().length; ++i){
        if(i == 0){
            column = 'a';
        }
        else if (i == 1){
            column = 'b';
        }
        else if (i == 2){
            column = 'c';
        }
        else if (i == 3){
            column = 'd';
        }
        else if (i == 4){
            column = 'e';
        }
        else if (i == 5){
            column = 'f';
        }
        else if (i == 6){
            column = 'g';
        }
        else if (i == 7){
            column = 'h';
        }
        for (int j = 0; j < Board.getPieces()[i].length; ++j){
            if(this == Board.getPieces()[i][j]){
                row = j + 1;
                return column + String.valueOf(row);
            }
        }
       } 
       return "";
    }
    /**
     * Return the computed value of a specific piece base on it value and the location it is on the board
     * @return
     */
    public double computeAdjustedValue(){
        double distanceX = 0;
        double distanceY = 0;
        double result;
        for(int i =0; i< Board.getPieces().length; ++i){
            for(int j = 0; j < Board.getPieces()[i].length; ++j){
                if (this == Board.getPieces()[i][j]){
                    distanceX = i;
                    distanceY = j;
                }
            }
        }
        distanceX = Math.abs(distanceX - 3.5);
        distanceY = Math.abs(distanceY - 3.5);
        result = getValue() * (5-distanceX) * (5-distanceY);
        return result;
    }
    /**
     * the toString method that return the letter and the location of the chess piece
     */
    public String toString(){
        return getLetter( )+ getStringLocation();

    }

    //abstract methods
    public abstract String getLetter();
    public abstract byte getValue();

}
