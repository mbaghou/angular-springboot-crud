package com.mbaghou.springboot.angular.tutorial.repository;

import com.mbaghou.springboot.angular.tutorial.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/***
Marwane BAGHOU
**/


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
