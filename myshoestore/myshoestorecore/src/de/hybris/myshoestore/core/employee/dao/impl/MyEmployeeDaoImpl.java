package de.hybris.myshoestore.core.employee.dao.impl;



import de.hybris.myshoestore.core.employee.dao.MyEmployeeDao;
import de.hybris.myshoestore.core.model.MyEmployeeModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

public class MyEmployeeDaoImpl implements MyEmployeeDao
{

    private static final Logger LOGGER = Logger.getLogger(MyEmployeeDaoImpl.class);
    private static final Logger LOG = Logger.getLogger(MyEmployeeDaoImpl.class);
    private FlexibleSearchService flexibleSearchService;
    private ModelService modelService;

    @Override
    public List<MyEmployeeModel> getMyEmployeeDetails()
    {
        LOG.info("##### MyEmployeeDaoImpl ######");
        final String query = "SELECT {PK} FROM {MyEmployee}";
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        return searchResult.getResult();
    }

    @Override
    public List<MyEmployeeModel> getSpecificMyEmployeeDetails(final String empId)
    {
        LOG.info("##### MyEmployeeDaoImpl ######");
        final Map<String, Object> params = new HashMap<String, Object>();
        final String query = "SELECT {PK} FROM {MyEmployee} WHERE {empId}=?empId";
        params.put("empId",empId);
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        searchQuery.addQueryParameters(params);
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        return searchResult.getResult() == null ? Collections.emptyList() : searchResult.getResult();
    }

    @Override
    public void createEmployee(MyEmployeeModel myEmployeeModel) {
        LOG.info("##### MyEmployeeDaoImpl ######");
        getModelService().save(myEmployeeModel);
    }

    @Override
    public void removeEmployee(List<MyEmployeeModel> employee) {
        LOG.info("##### MyEmployeeDaoImpl ######");
        validateParameterNotNull(employee, "Employee model cannot be null");
        getModelService().removeAll(employee);
    }

    @Override
    public void replaceEmployee(MyEmployeeModel employee, final String empId)
    {
        LOG.info("##### MyEmployeeDaoImpl ######");
        validateParameterNotNull(employee, "Employee model cannot be null, please enter employee details");
        getModelService().removeAll(getSpecificMyEmployeeDetails(empId));
        getModelService().save(employee);
    }

    public void updateEmployeeSalary(final String empId, final Double salary)
    {
        LOG.info("##### MyEmployeeDaoImpl ######");
        validateParameterNotNull(salary, "Salary cannot be null");
        for (MyEmployeeModel employee : getSpecificMyEmployeeDetails(empId)) {
            if (employee.getEmpId().equals(empId)) {
                getModelService().setAttributeValue(employee, "empSalary", salary);
                getModelService().save(employee);
                getModelService().refresh(employee);
            }
        }
    }

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
