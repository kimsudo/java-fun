package next.optional;

import static org.junit.Assert.*;

import org.junit.Test;

import next.optional.Expression;

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
