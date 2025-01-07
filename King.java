public class King extends Piece{
    /**
     * Constructor for King
     * @param color
     */
    public King (byte color){
        super(color);
    }
    
    @Override
    /**
     * return the letter name for that piece
     */
    public String getLetter(){
        return "K";
    } 
    /**
     * return the specific value for that type of piece
     */
    public byte getValue(){
        byte value = 1;
        if (getColor() == 1){
            value = 1;
        }
        else if (getColor() == 2){
            value = -1;
        }
        return value;
    }

}
