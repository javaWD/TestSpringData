package cn.com.esrichina.fuckmaven.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cn.com.esrichina.fuckmaven.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByFirstName(String firstName);

    List<Employee> findByLastName(String lastName);
}

