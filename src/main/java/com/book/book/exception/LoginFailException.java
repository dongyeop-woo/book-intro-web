package com.book.book.exception;

public class LoginFailException extends RuntimeException {
    public LoginFailException() { super("로그인 실패."); }
}
