package com.Souvik.cartServices.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

public class ErrorHandlerController implements ErrorController{

    @GetMapping("/error")
    public String customError(){
        return "The link you followed may be broken, or the page may have been removed.";
    }
    
}
