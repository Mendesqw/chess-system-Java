package services.exceptions;

public class ChessException extends RuntimeException{
    
    public  static final long seralVersionUID = 1L;


    public ChessException(String msg){
        super(msg);
    }
}
