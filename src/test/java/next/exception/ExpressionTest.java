package next.exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionTest {
    @Test
    public void of() {
        assertTrue(Expression.PLUS == Expression.of("+"));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void notValidExpression() {
        Expression.of("&");
    }
}
