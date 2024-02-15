package salaryOfEmployee.app.salaryOfEmployee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void calculateAndTransferSalary(double lowestGradeBasicSalary, double companyAccountBalance) {
        // Calculate salary for each employee and transfer to their bank account
        // Check company account balance and add funds if necessary
    }
}
