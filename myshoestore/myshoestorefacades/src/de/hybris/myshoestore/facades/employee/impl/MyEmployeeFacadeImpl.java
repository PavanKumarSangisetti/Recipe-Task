package de.hybris.myshoestore.facades.employee.impl;




import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;

import de.hybris.myshoestore.core.model.MyEmployeeModel;
import de.hybris.myshoestore.core.employee.service.MyEmployeeService;
import de.hybris.myshoestore.facades.employee.MyEmployeeFacade;
import de.hybris.myshoestore.facades.populators.MyEmployeeDataReversePopulator;
import de.hybris.myshoestore.facades.product.data.MyEmployeeData;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.ArrayList;

import java.util.List;

public class MyEmployeeFacadeImpl implements MyEmployeeFacade
{
    private MyEmployeeService myEmployeeService;
    private ModelService modelService;
    private MyEmployeeDataReversePopulator myEmployeeDataReversePopulator;
    @Resource(name = "myEmployeeDataConverter")
    private Converter<MyEmployeeModel, MyEmployeeData> myEmployeeDataConverter;

    private static final Logger LOG = Logger.getLogger(MyEmployeeFacadeImpl.class);

    @Override
    public List<MyEmployeeData> getMyEmployeeDetails()
    {
        LOG.info("######### MyEmployeeFacadeImpl #############");
        final List<MyEmployeeData> employees = new ArrayList<MyEmployeeData>();
        final List<MyEmployeeModel> model = getMyEmployeeService().getMyEmployeeDetails();
        final List<MyEmployeeData> myEmployeeData = myEmployeeDataConverter.convertAll(model);
        employees.addAll(myEmployeeData);
        return employees;
    }

    @Override
    public List<MyEmployeeData> getSpecificEmployeeDetails(final String empId)
    {
        LOG.info("######### MyEmployeeFacadeImpl #############");
        final List<MyEmployeeData> employee = new ArrayList<MyEmployeeData>();
        final List<MyEmployeeModel> model = getMyEmployeeService().getSpecificMyEmployeeDetails(empId);
        final List<MyEmployeeData> myEmployeeData = myEmployeeDataConverter.convertAll(model);
        employee.addAll(myEmployeeData);
        return employee;
    }

    @Override
    public void createEmployee(MyEmployeeData myEmployeeData)
    {
        LOG.info("######### MyEmployeeFacadeImpl #############");
        final MyEmployeeModel myEmployeeModel = getModelService().create(MyEmployeeModel.class);
        getMyEmployeeDataReversePopulator().populate(myEmployeeData, myEmployeeModel);
        getMyEmployeeService().createEmployee(myEmployeeModel);
    }

    @Override
    public void removeEmployee(final String empId)
    {
        LOG.info("######### MyEmployeeFacadeImpl #############");
        getMyEmployeeService().removeEmployee(empId);
    }

    @Override
    public void replaceEmployee(final MyEmployeeData myEmployeeData, final String empId)
    {
        LOG.info("######### MyEmployeeFacadeImpl #############");
        final MyEmployeeModel myEmployeeModel = getModelService().create(MyEmployeeModel.class);
        getMyEmployeeDataReversePopulator().populate(myEmployeeData, myEmployeeModel);
        getMyEmployeeService().replaceEmployee(myEmployeeModel, empId);
    }

    @Override
    public void updateEmployeeSalary(final String empId, final Double salary)
    {
        LOG.info("######### MyEmployeeFacadeImpl #############");
        getMyEmployeeService().updateEmployeeSalary(empId, salary);
    }

    public MyEmployeeService getMyEmployeeService() {
        return myEmployeeService;
    }

    public void setMyEmployeeService(MyEmployeeService myEmployeeService) {
        this.myEmployeeService = myEmployeeService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public MyEmployeeDataReversePopulator getMyEmployeeDataReversePopulator() {
        return myEmployeeDataReversePopulator;
    }

    public void setMyEmployeeDataReversePopulator(MyEmployeeDataReversePopulator myEmployeeDataReversePopulator) {
        this.myEmployeeDataReversePopulator = myEmployeeDataReversePopulator;
    }

    public Converter<MyEmployeeModel, MyEmployeeData> getMyEmployeeDataConverter() {
        return myEmployeeDataConverter;
    }

    public void setMyEmployeeDataConverter(Converter<MyEmployeeModel, MyEmployeeData> myEmployeeDataConverter) {
        this.myEmployeeDataConverter = myEmployeeDataConverter;
    }
}
