package com.test.testweb.controller;

import com.test.testweb.controller.utils.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class projectExpectionAdvice {
    @ExceptionHandler
    public R doExpection(Exception ex){
        ex.printStackTrace();
        return new R(false,"出现错误");
    }
}
