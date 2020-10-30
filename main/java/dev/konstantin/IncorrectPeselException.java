package dev.konstantin;

public class IncorrectPeselException extends RuntimeException{

    public IncorrectPeselException(String message) {
        super(message);
    }

}
