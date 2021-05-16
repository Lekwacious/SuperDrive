package com.lekwacious.cloudstorage.exceptions;

public class NoteException extends RuntimeException {
    public NoteException(String message) {
        super(message);
    }

    public NoteException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoteException(Throwable cause) {
        super(cause);
    }

    public NoteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
