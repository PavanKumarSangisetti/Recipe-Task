package de.hybris.myshoestore.core.employee.service.impl;



import de.hybris.myshoestore.core.model.MyEmployeeModel;
import org.apache.log4j.Logger;
import de.hybris.myshoestore.core.employee.dao.MyEmployeeDao;
import de.hybris.myshoestore.core.employee.service.MyEmployeeService;
import java.util.List;

public class MyEmployeeServiceImpl implements MyEmployeeService
{

    private MyEmployeeDao myEmployeeDetailsDao;

    private static final Logger LOG = Logger.getLogger(MyEmployeeServiceImpl.class);

    @Override
    public List<MyEmployeeModel> getMyEmployeeDetails()
    {
        LOG.info("###### MyEmployeeServiceImpl ######");
        return myEmployeeDetailsDao.getMyEmployeeDetails();
    }

    @Override
    public List<MyEmployeeModel> getSpecificMyEmployeeDetails(String empId)
    {
        LOG.info("###### MyEmployeeServiceImpl ######");
        return myEmployeeDetailsDao.getSpecificMyEmployeeDetails(empId);
    }



    @Override
    public void createEmployee(MyEmployeeModel myEmployeeModel) {
        LOG.info("###### MyEmployeeServiceImpl ######");
        getMyEmployeeDetailsDao().createEmployee(myEmployeeModel);
    }

    @Override
    public void removeEmployee(final String empId) {
        LOG.info("###### MyEmployeeServiceImpl ######");
        List<MyEmployeeModel> employee = getSpecificMyEmployeeDetails(empId);
        getMyEmployeeDetailsDao().removeEmployee(employee);
    }

    @Override
    public void replaceEmployee(MyEmployeeModel employee, final String empId)
    {
        LOG.info("###### MyEmployeeServiceImpl ######");
        getMyEmployeeDetailsDao().replaceEmployee(employee, empId);
    }

    @Override
    public void updateEmployeeSalary(final String empId, final Double salary)
    {
        LOG.info("###### MyEmployeeServiceImpl ######");
        getMyEmployeeDetailsDao().updateEmployeeSalary(empId, salary);
    }
    public MyEmployeeDao getMyEmployeeDetailsDao() {
        return myEmployeeDetailsDao;
    }

    public void setMyEmployeeDetailsDao(MyEmployeeDao myEmployeeDetailsDao) {
        this.myEmployeeDetailsDao = myEmployeeDetailsDao;
    }
}
