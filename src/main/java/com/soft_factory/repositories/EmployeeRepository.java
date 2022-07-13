package com.soft_factory.repositories;

import com.soft_factory.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
