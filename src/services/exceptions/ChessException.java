package services.exceptions;

public class ChessException extends BoardException {

    public static final long seralVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
