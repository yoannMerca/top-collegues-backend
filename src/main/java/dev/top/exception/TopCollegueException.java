package dev.top.exception;

public class TopCollegueException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TopCollegueException() {
        super();
    }

    public TopCollegueException(String message, Throwable cause) {
        super(message, cause);
    }

    public TopCollegueException(String message) {
        super(message);
    }

    public TopCollegueException(Throwable cause) {
        super(cause);
    }

}