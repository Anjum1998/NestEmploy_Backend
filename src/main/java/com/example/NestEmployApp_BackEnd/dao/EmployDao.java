package com.example.NestEmployApp_BackEnd.dao;

import com.example.NestEmployApp_BackEnd.model.Employ;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployDao extends CrudRepository<Employ,Integer> {
    @Query(value = "SELECT `id`, `company`, `designation`, `empcode`, `empname`, `mobile`, `password`, `salary`, `username` FROM `employ_detail` WHERE `username`= :username AND `password`= :password",nativeQuery = true)
    List<Employ> EmployLogin(@Param("username") String username,@Param("password") String password);
}
