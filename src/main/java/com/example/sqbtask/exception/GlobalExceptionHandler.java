package com.example.sqbtask.exception;

import com.example.sqbtask.exception.customexception.IncorrectCredentialsException;
import com.example.sqbtask.exception.customexception.InvalidWalletOrPhone;
import com.example.sqbtask.exception.customexception.WalletNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({InvalidWalletOrPhone.class})
    public ResponseEntity<Object> handlerInvalidWalletOrPhone(InvalidWalletOrPhone exception, WebRequest webRequest) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", exception.getMessage());
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({WalletNotFound.class})
    public ResponseEntity<Object> handleWalletNotFound(WalletNotFound exception, WebRequest webRequest) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", exception.getMessage());
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({IncorrectCredentialsException.class})
    public ResponseEntity<Object> handleIncorrectCredentials(IncorrectCredentialsException exception, WebRequest webRequest) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", exception.getMessage());
        return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
    }

}
