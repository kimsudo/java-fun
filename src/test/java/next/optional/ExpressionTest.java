package next.optional;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


public class ExpressionTest {
    @Test
    public void of() {
        assertThat(Expression.PLUS == Expression.of("+")).isTrue();
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void notValidExpression() {
        Expression.of("&");
    }
}
