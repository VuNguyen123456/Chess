public class Bishop extends MinorPiece  {

    /**
     * Constructor for Bishop
     * @param color
     */
    public Bishop(byte color) {
        super(color);
    }
    
    @Override
    /**
     * return the letter name for that piece
     */
    public String getLetter(){
        return "B";
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
