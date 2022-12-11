package com.example.NestEmployApp_BackEnd.controller;

import com.example.NestEmployApp_BackEnd.dao.TaskDao;
import com.example.NestEmployApp_BackEnd.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TaskController {
    @Autowired
    private TaskDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addtask",consumes = "application/json",produces = "application/json")
    public Map<String,String> addTask(@RequestBody Task t)
    {
        System.out.println(t.getEmpcode());
        System.out.println(t.getTask().toString());
        System.out.println(t.getStatus().toString());
        HashMap<String,String> map=new HashMap<>();
        dao.save(t);
        map.put("status","success");
        return map;
    }
}
