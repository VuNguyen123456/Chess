public class Knight extends MinorPiece {
    /**
     * Constructor for Knight
     * @param color
     */
    public Knight(byte color){
        super(color);
    }

    @Override
    /**
     * return the letter name for that piece
     */
    public String getLetter(){
        return "N";
    }
    /**
     * return the specific value for that type of piece
     */
    public byte getValue(){
        byte value = 3;
        if (getColor() == 1){
            value = 3;
        }
        else if (getColor() == 2){
            value = -3;
        }
        return value;
    }
}
