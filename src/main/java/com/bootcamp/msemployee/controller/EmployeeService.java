package com.bootcamp.msemployee.controller;

import com.bootcamp.msemployee.entity.MEmployee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Mono<MEmployee> crearEmpleado(Mono<MEmployee> employee);
    Flux<MEmployee>listarTodos();
}
