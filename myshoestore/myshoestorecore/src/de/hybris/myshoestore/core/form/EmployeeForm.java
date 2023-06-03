package de.hybris.myshoestore.core.form;

public class EmployeeForm {
    private String empId;
    private String empName;
    private double empSalary;
    private String empWorkType;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpWorkType() {
        return empWorkType;
    }

    public void setEmpWorkType(String empWorkType) {
        this.empWorkType = empWorkType;
    }
}
