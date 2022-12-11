package com.example.NestEmployApp_BackEnd.dao;

import com.example.NestEmployApp_BackEnd.model.Employ;
import org.springframework.data.repository.CrudRepository;

public interface EmployDao extends CrudRepository<Employ,Integer> {
}
