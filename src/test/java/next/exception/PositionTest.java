package next.exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {
    @Test
    public void create_00() {
        Position p = new Position("a1");
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }
    
    @Test
    public void create_77() {
        Position p = new Position("h8");
        assertEquals(7, p.getX());
        assertEquals(7, p.getY());
    }

    @Test (expected = InValidPositionException.class)
    public void 길이가_2가_아닌_경우() {
        new Position("a");
    }
    
    @Test (expected = InValidPositionException.class)
    public void notValid_0보다_작은_X() {
        new Position("Z1");
    }
    
    @Test (expected = InValidPositionException.class)
    public void notValid_7보다_큰_X() {
        new Position("i1");
    }
    
    @Test (expected = InValidPositionException.class)
    public void notValid_0보다_작은_Y() {
        new Position("a0");
    }
    
    @Test (expected = InValidPositionException.class)
    public void notValid_7보다_큰_Y() {
        new Position("a9");
    }

}
