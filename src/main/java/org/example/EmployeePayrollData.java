package org.example;

public class EmployeePayrollData {
    int id;
    String data;
    Double salary;

    public EmployeePayrollData(int id, String data, Double salary) {
        this.id = id;
        this.data = data;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", salary=" + salary +
                '}';
    }
}
