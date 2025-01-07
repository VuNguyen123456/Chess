public class Rook extends MajorPiece{
    /**
     * Constructor for Rook
     * @param color
     */
    public Rook(byte color){
        super(color);
    }
    
    @Override
    /**
     * return the letter name for that piece
     */
    public String getLetter(){
        return "R";
    }
    /**
     * return the specific value for that type of piece
     */
    public byte getValue(){
        byte value = 5;
        if (getColor() == 1){
            value = 5;
        }
        else if (getColor() == 2){
            value = -5;
        }
        return value;
    }
}
