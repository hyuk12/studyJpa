package jpabook.jpashop.exception;

public class NotEnoughSockException extends RuntimeException{

    public NotEnoughSockException() {
        super();
    }

    public NotEnoughSockException(String message) {
        super(message);
    }

    public NotEnoughSockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughSockException(Throwable cause) {
        super(cause);
    }

}
