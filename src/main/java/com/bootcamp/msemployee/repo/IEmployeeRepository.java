package com.bootcamp.msemployee.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.msemployee.entity.MEmployee;

@Repository
public interface IEmployeeRepository extends ReactiveMongoRepository<MEmployee, Integer> {

}
