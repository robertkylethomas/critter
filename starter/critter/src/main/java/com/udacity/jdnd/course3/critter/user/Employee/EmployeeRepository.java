package com.udacity.jdnd.course3.critter.user.Employee;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  List<Employee> findBySkillsIn(Set<EmployeeSkill> skills);
}
