package controller.model;

import model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DepartmentServiceImpl;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentServiceImpl service;

    public DepartmentController(DepartmentServiceImpl service) {
        this.service = service;
    }

    @GetMapping("{deptId}/salary/sum")
    public double sumByDept(@PathVariable int deptId) {
        return service.sum(deptId);
    }

    @GetMapping("{deptId}/salary/max")
    public Employee max(@PathVariable int deptId) {
        return service.maxSalary(deptId);
    }

    @GetMapping("{deptId}/salary/min")
    public Employee min(@PathVariable int deptId) {
        return service.minSalary(deptId);
    }

    @GetMapping("{deptId}/employees")
    public List<Employee> find(@PathVariable int deptId) {
        return service.findAllByDept(deptId);
    }

    @GetMapping("/employees")
    public Map<Integer, List<Employee>> group() {
        return service.groupDeDept();
    }
}