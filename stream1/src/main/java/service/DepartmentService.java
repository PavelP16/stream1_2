package service;

import model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    double sum(int departmentId);

    Employee maxSalary(int departmentId);

    Employee minSalary(int departmentId);

    List<Employee> findAllByDept(int departmentId);

    Map<Integer, List<Employee>> groupDeDept();
}