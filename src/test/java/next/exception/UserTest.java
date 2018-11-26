package next.exception;

import static org.junit.Assert.*;
import static next.exception.User.*;

import org.junit.Test;

public class UserTest {
    @Test
    public void whenFiltersWithoutOptional_thenCorrect() {
        assertTrue(ageIsInRange1(new User("crong", 35)));
        assertFalse(ageIsInRange1(new User("crong", 48)));
        assertFalse(ageIsInRange1(new User("crong", null)));
        assertFalse(ageIsInRange1(new User("crong", 29)));
        assertFalse(ageIsInRange1(null));
    }
    
    @Test
    public void whenFiltersWithOptional_thenCorrect() {
        assertTrue(ageIsInRange2(new User("crong", 35)));
        assertFalse(ageIsInRange2(new User("crong", 48)));
        assertFalse(ageIsInRange2(new User("crong", null)));
        assertFalse(ageIsInRange2(new User("crong", 29)));
        assertFalse(ageIsInRange2(null));
    }
}
