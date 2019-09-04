package com.wzf.common.exception;

public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 4742902691839838195L;

    public BaseException(String message){ super(message); }

    public BaseException(Throwable cause){super(cause);}

    public  BaseException(String message,Throwable cause){super(message,cause);}
}
