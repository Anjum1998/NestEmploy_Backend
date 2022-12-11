package com.example.NestEmployApp_BackEnd.controller;

import com.example.NestEmployApp_BackEnd.dao.EmployDao;
import com.example.NestEmployApp_BackEnd.model.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployController {
    @Autowired
    private EmployDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemp",consumes = "application/json" ,produces = "application/json")
    public Map<String,String> AddEmploy(@RequestBody Employ e)
    {
        System.out.println(e.getEmpcode());
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompany().toString());
        System.out.println(e.getMobile());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        HashMap<String,String> map=new HashMap<>();
        dao.save(e);
        map.put("status","success");

        return map;
    }
}
