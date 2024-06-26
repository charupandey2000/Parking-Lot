package dev.charu.Exception;

public class parkingNotFoundException extends RuntimeException{

    public parkingNotFoundException(String message){
        super(message);
    }
}
