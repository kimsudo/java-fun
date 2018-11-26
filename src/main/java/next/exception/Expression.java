package next.exception;

enum Expression {
    PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/");

    private String expression;

    Expression(String expression) {
      this.expression = expression;
    }
    
    static Expression of(String expression) {
        return null;
    }
}
