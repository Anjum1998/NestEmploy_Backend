package com.example.NestEmployApp_BackEnd.dao;

import com.example.NestEmployApp_BackEnd.model.Task;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface TaskDao extends CrudRepository<Task,Integer> {
    @Query(value = "SELECT  e.`company`, e.`designation`, e.`empcode`, e.`empname`, e.`mobile`,t.task,t.status FROM `employ_detail` e JOIN task t ON e.empcode=t.empcode",nativeQuery = true)
    List<Map<String,String>> ViewAllTask();


    @Query(value = "SELECT `id`, `empcode`, `status`, `task` FROM `task` WHERE `empcode`= :empcode",nativeQuery = true)
    List<Task> EmployViewTask(@Param("empcode") Integer empcode);

    @Modifying
    @Transactional
    @Query(value = "UPDATE `task` SET `status`= :status WHERE `id`=:id",nativeQuery = true)
    void UpdateStatus(@Param("id") Integer id,@Param("status") String status);

}
