package com.app.error.controller;

import com.app.error.exception.CustomException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.view.RedirectView;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    protected RedirectView handleNull(NullPointerException e){
        e.printStackTrace();
        return new RedirectView("/");
    }

    @ExceptionHandler(CustomException.class)
    protected RedirectView handleCustomException(CustomException customException){
        return new RedirectView("/member/login?login=false");
    }
}