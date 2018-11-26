package next.optionals;

import static org.junit.Assert.*;

import org.junit.Test;

import next.optionals.Expression;

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
