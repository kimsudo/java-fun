package next.exception;

public class InValidPositionException extends Exception {
    private static final long serialVersionUID = 1L;

    public InValidPositionException() {
        super();
    }

    public InValidPositionException(String message) {
        super(message);
    }
}
