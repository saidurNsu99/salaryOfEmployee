package salaryOfEmployee.app.salaryOfEmployee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeService {
    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

    public Employee getEmployeeById(Long id) {
        return new Employee();
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        return new Employee();
    }

    public void deleteEmployee(Long id) {
        //ILoggerFactory.class("inside delete method");
        log.debug("inside delete method");
    }
}
