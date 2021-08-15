package org.example;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class EmployeePayrollService {
    public enum IOService {CONSOLE_IO,FILE_IO,DB_IO, REST_IO}
    private List<EmployeePayrollData> employeePayrollList;
   // public enum IOService {CONSOLE_IO, FILE_IO,DB_IO,REST_IO}
    public  EmployeePayrollService(){}
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList){
        this.employeePayrollList=employeePayrollList;
    }


    public static void main(String[] args) {
        ArrayList<EmployeePayrollData>  employeePayrollList=new ArrayList<>();
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader=new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void readEmployeePayrollData(Scanner consoleInputReader){
        System.out.println("Enter Employee ID: ");
        int id=consoleInputReader.nextInt();
        System.out.println("Enter Employee Name :");
        String name=consoleInputReader.next();
        System.out.println("Enter Employee Salary: ");
        double salary=consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name,salary));
    }

    public void readEmployeePayrollData(IOService ioService){
        if (ioService.equals(IOService.FILE_IO))
            this.employeePayrollList=new EmployeePayrollFileIOService().readData();
        return employeePayrollList.size();
    }
    private void writeEmployeePayrollData(IOService ioService){
        if (ioService.equals(IOService.CONSOLE_IO))
            employeePayrollList.stream().forEach(System.out::println);
        else if (ioService.equals(IOService.FILE_IO))
            new EmployeePayrollService.IOService().w
        System.out.println("\nWriting Employee Payroll Roaster to Console \n"+ employeePayrollList);
    }


}
