package com.ItsFRZ.CustomCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ItsFRZ.CustomCrud.Model.EmployeModel;

@Repository
public interface EmployeRepository extends JpaRepository<EmployeModel, Integer> {

}
