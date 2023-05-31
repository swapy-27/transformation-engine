package com.project.integrator_engine.controller;


import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1") //ResponseBody+Controller --> esponseBody is the one which do majic of returning data converting it and putting into Response Body
public class Controller {


    //consuming api
    //producing api
    //


    @RequestMapping(value = "/{request-type}/{method-type}",method = {RequestMethod.GET,RequestMethod.POST})
    public ResponseEntity<Object> convertMessage(){

        return new ResponseEntity<>(null);
    };


    private ResponseEntity<String> forwardToCamelRoute(){
        return new ResponseEntity<>(null);
    };
}
