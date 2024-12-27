package com.traininglaura.stock.configuration.exception;


import com.traininglaura.stock.domain.exception.CategoryNullException;
import com.traininglaura.stock.domain.exception.NameEmptyException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@RequiredArgsConstructor
public class ControllerAdvisor {

    @ExceptionHandler(CategoryNullException.class)
    public ResponseEntity handleCategoryNullException(CategoryNullException exception) {
        return ResponseEntity.badRequest().body(
                new ExceptionCodeResponse(exception.getMessage(),
                        HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
                        LocalDateTime.now().toString()));
    }

    @ExceptionHandler(NameEmptyException.class)
    public ResponseEntity handleNameEmptyException(NameEmptyException exception) {
        return ResponseEntity.badRequest().body(
                new ExceptionCodeResponse(exception.getMessage(),
                        HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
                        LocalDateTime.now().toString()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        return ResponseEntity.badRequest().body(
                new ExceptionCodeResponse(exception.getMessage(),
                        HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
                        LocalDateTime.now().toString()));
    }
}
