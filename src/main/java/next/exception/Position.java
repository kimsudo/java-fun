package next.exception;

public class Position {
    private int x;
    private int y;
    
    public Position(String position) {
        x = (int) (position.charAt(0) - 'a');
        y = Integer.parseInt(position.substring(1))-1;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}