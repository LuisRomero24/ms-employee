package com.bootcamp.msemployee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.bootcamp.msemployee.entity.MEmployee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    

    @PostMapping("crearEmpleado")
    //@ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<MEmployee>crearEmpleado(@RequestBody MEmployee employee){
        return employeeService.crearEmpleado(Mono.just(employee));
    }
    
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(value = "listarTodos",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<MEmployee> listarTodos(){
        return employeeService.listarTodos();
    }
}
