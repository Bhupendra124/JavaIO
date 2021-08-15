package org.example;

import org.junit.Test;

import java.util.Arrays;

import static javashowcase.EmployeePayrollService.IOService.FILE_IO;

public class EmployeePayrollServiceTest {
    @Test

    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployeePayrollData [] arrayOfEmps={
                new EmployeePayrollData(1,"Bhupendra wadekar",100000.0),
                new EmployeePayrollData(2,"Salman Khan",200000.0),
                new EmployeePayrollData(3,"Amir Khan",300000.0)

        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService=new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(FILE_IO);
        employeePayrollService.printData(FILE_IO);
}
