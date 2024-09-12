package com.example.demo.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SalaryInfo;
@Repository
public interface SalaryInfoRepo extends JpaRepository<SalaryInfo, Integer> {

}
