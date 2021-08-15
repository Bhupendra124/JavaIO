package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollDataList;
    public enum IOService {CONSOLE_IO, FILE_IO,DB_IO,REST_IO}
    public  EmployeePayrollService(){}
    public EmployeePayrollService(List<EmployeePayrollData>employeePayrollDataList){}


    public static void main(String[] args) {
        ArrayList<EmployeePayrollData>  employeePayrollDataArrayList=new ArrayList<>();
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeePayrollDataArrayList);
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
        employeePayrollDataList.add(new EmployeePayrollData(id, name,salary));
    }
    private void writeEmployeePayrollData(){
        System.out.println("\nWriting Employee Payroll Roaster to Console \n"+employeePayrollDataList);
    }
}
