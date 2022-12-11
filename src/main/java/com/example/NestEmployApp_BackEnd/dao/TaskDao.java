package com.example.NestEmployApp_BackEnd.dao;

import com.example.NestEmployApp_BackEnd.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<Task,Integer> {
}
