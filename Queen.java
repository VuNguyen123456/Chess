public class Queen extends MajorPiece{
    /**
     * Constructor for Queen
     * @param color
     */
    public Queen(byte color){
        super(color);
    }

    @Override
    /**
     * return the letter name for that piece
     */
    public String getLetter(){
        return "Q";
    }
    /**
     * return the specific value for that type of piece
     */
    public byte getValue(){
        byte value = 9;
        if (getColor() == 1){
            value = 9;
        }
        else if (getColor() == 2){
            value = -9;
        }
        return value;
    }


}