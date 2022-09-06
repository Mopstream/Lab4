package service;

public class ImpressFail extends RuntimeException{

    public ImpressFail() {
        super("Не того впечатляешь. Клоун.");
    }

    public ImpressFail(String message) {
        super(message);
    }

    public ImpressFail(String message, Throwable cause) {
        super(message, cause);
    }

    public ImpressFail(Throwable cause) {
        super(cause);
    }

    public ImpressFail(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}