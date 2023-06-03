package de.hybris.myshoestore.core.employee.service;



import java.util.List;


//import de.hybris.myshoestore.facades.product.data.MyEmployeeData;
import de.hybris.myshoestore.core.enums.WorkTypeEnumeration;
import de.hybris.myshoestore.core.model.MyEmployeeModel;

public interface MyEmployeeService
{
    public List<MyEmployeeModel> getMyEmployeeDetails();
    public List<MyEmployeeModel> getSpecificMyEmployeeDetails(final String empId);
    public void createEmployee(MyEmployeeModel myEmployeeModel);
    public void removeEmployee(final String empId);
    public void replaceEmployee(MyEmployeeModel employee, final String empId);
    public void updateEmployeeSalary(final String empId, final Double salary);

}
