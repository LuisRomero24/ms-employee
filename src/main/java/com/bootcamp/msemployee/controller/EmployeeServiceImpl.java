package com.bootcamp.msemployee.controller;

import com.bootcamp.msemployee.entity.MEmployee;
import com.bootcamp.msemployee.repo.IEmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
    IEmployeeRepository iemployeeRepository;

    @Override
    public Mono<MEmployee>crearEmpleado(Mono<MEmployee> employeeMono) {
        return employeeMono.flatMap(iemployeeRepository::insert);
    }
    @Override
    public Flux<MEmployee> listarTodos(){
        return iemployeeRepository.findAll();
    }

}


