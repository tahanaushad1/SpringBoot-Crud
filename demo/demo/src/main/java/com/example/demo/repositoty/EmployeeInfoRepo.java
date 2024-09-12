package com.example.demo.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmplyeeInfo;
@Repository
public interface EmployeeInfoRepo extends JpaRepository<EmplyeeInfo, Integer>{

}
