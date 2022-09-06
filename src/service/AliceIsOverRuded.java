package service;

public class AliceIsOverRuded extends Exception {

    public AliceIsOverRuded() {
        super("Алиса перевозмущена");
    }
    public AliceIsOverRuded(String message) {
        super(message);
    }

    public AliceIsOverRuded(String message, Throwable cause) {
        super(message, cause);
    }

    public AliceIsOverRuded(Throwable cause) {
        super(cause);
    }

    public AliceIsOverRuded(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}