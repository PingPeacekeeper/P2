package com.example.p2.exception;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BadCredentialsException.class)
    public GlobalErrorResponse badCredentialsExceptionHandler(final Exception e){
        return new GlobalErrorResponse(403,e.getMessage());

    }

    @ExceptionHandler(RuntimeException.class)
    public GlobalErrorResponse runtimeExceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
//        response.setStatus(HttpStatus.BAD_REQUEST.value());
        RuntimeException exception = (RuntimeException) e;
        return new GlobalErrorResponse(400, exception.getMessage());
    }
}
