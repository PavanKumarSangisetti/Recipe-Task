package de.hybris.myshoestore.storefront.controllers.pages;

 

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.myshoestore.core.enums.WorkTypeEnumeration;
import de.hybris.myshoestore.core.form.EmployeeForm;
import de.hybris.myshoestore.facades.employee.MyEmployeeFacade;
import de.hybris.myshoestore.facades.product.data.MyEmployeeData;
import de.hybris.myshoestore.storefront.controllers.ControllerConstants;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping(value = "/myemployee")
public class MyEmployeeDetailsController extends AbstractPageController
{
    @Autowired
    private MyEmployeeFacade myEmployeeFacade;
    private static final String MYEMPLOYEE_CMS_PAGE = "myEmployeeDetails";
    private static final String REDIRECT_TO_EMPLOYEES = REDIRECT_PREFIX + "/myemployee/employees";
    private static final String FORM_GLOBAL_ERROR = "form.global.error";
    private static final Logger LOG = Logger.getLogger(MyEmployeeDetailsController.class);

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String getAllEmployeeDetails(final Model model) throws CMSItemNotFoundException
    {
        LOG.info("######## MyEmployeeController ########");
        final List <MyEmployeeData> myEmployeeData= myEmployeeFacade.getMyEmployeeDetails();
        model.addAttribute("myEmployeeData", myEmployeeData);
        storeCmsPageInModel(model, getContentPageForLabelOrId(MYEMPLOYEE_CMS_PAGE));
        setUpMetaDataForContentPage(model, getContentPageForLabelOrId(MYEMPLOYEE_CMS_PAGE));
        return ControllerConstants.Views.Pages.Misc.MyEmployeeDetails;
    }

    @RequestMapping(value = "/create-employee", method = RequestMethod.GET)
    public String createEmployee(final Model model) throws CMSItemNotFoundException
    {
        LOG.info("######## MyEmployeeController ########");
        final EmployeeForm employeeForm = getPreparedEmployeeForm();
        model.addAttribute("employeeForm", new EmployeeForm());
        final ContentPageModel createEmployeePage = getContentPageForLabelOrId("create-employee");
        storeCmsPageInModel(model, createEmployeePage);
        setUpMetaDataForContentPage(model, createEmployeePage);
        return ControllerConstants.Views.Pages.Misc.CreateEmployee;
    }

    @RequestMapping(value = "/create-employee", method = RequestMethod.POST)
    public String createEmployee(final EmployeeForm employeeForm, final BindingResult bindingResult, final Model model,
                                 final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
        LOG.info("######## MyEmployeeController ########");
        if (bindingResult.hasErrors())
        {
            GlobalMessages.addErrorMessage(model, FORM_GLOBAL_ERROR);
            final ContentPageModel createEmployee = getContentPageForLabelOrId("create-employee");
            storeCmsPageInModel(model, createEmployee);
            setUpMetaDataForContentPage(model, createEmployee);
            return getViewForPage(model);
        }
        String returnAction = REDIRECT_TO_EMPLOYEES;
        final MyEmployeeData employee = new MyEmployeeData();
        employee.setEmpId(employeeForm.getEmpId());
        employee.setEmpName(employeeForm.getEmpName());
        employee.setEmpSalary(employeeForm.getEmpSalary());
        employee.setEmpWorkType(WorkTypeEnumeration.valueOf(employeeForm.getEmpWorkType()));

        model.addAttribute("employeeForm", new EmployeeForm());

        final ContentPageModel createEmployeePage = getContentPageForLabelOrId("create-employee");
        storeCmsPageInModel(model, createEmployeePage);
        setUpMetaDataForContentPage(model, createEmployeePage);

        getMyEmployeeFacade().createEmployee(employee);
        GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,
                "Employee Created!", null);

        return returnAction;
    }

    @RequestMapping(value = "/update-employee", method = RequestMethod.GET)
    public String updateEmployee(final Model model) throws CMSItemNotFoundException
    {
        LOG.info("######## MyEmployeeController ########");
        final EmployeeForm employeeForm = getPreparedEmployeeForm();
        model.addAttribute("employeeForm", new EmployeeForm());
        final ContentPageModel updateEmployeePage = getContentPageForLabelOrId("update-employee");
        storeCmsPageInModel(model, updateEmployeePage);
        setUpMetaDataForContentPage(model, updateEmployeePage);
        return ControllerConstants.Views.Pages.Misc.UpdateEmployee;
    }

    @RequestMapping(value = "/update-employee", method = RequestMethod.POST)
    public String updateEmployee(final EmployeeForm employeeForm, final BindingResult bindingResult, final Model model,
                                 final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
        LOG.info("######## MyEmployeeController ########");
        if (bindingResult.hasErrors())
        {
            GlobalMessages.addErrorMessage(model, FORM_GLOBAL_ERROR);
            final ContentPageModel updateEmployee = getContentPageForLabelOrId("update-employee");
            storeCmsPageInModel(model, updateEmployee);
            setUpMetaDataForContentPage(model, updateEmployee);
            return getViewForPage(model);
        }
        String returnAction = REDIRECT_TO_EMPLOYEES;
        final MyEmployeeData employee = new MyEmployeeData();
        employee.setEmpId(employeeForm.getEmpId());
        employee.setEmpName(employeeForm.getEmpName());
        employee.setEmpSalary(employeeForm.getEmpSalary());
        employee.setEmpWorkType(WorkTypeEnumeration.valueOf(employeeForm.getEmpWorkType()));

        model.addAttribute("employeeForm", new EmployeeForm());

        final ContentPageModel updateEmployeePage = getContentPageForLabelOrId("update-employee");
        storeCmsPageInModel(model, updateEmployeePage);
        setUpMetaDataForContentPage(model, updateEmployeePage);
        if(getMyEmployeeFacade().getSpecificEmployeeDetails(employee.getEmpId()).isEmpty())
        {
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.ERROR_MESSAGES_HOLDER, "Employee Not Found", null);
            return REDIRECT_PREFIX + "update-employee";
        }
        getMyEmployeeFacade().replaceEmployee(employee,employeeForm.getEmpId());
        GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,
                "Employee Updated!", null);

        return returnAction;
    }

    @RequestMapping(value = "/update-employee-salary", method = RequestMethod.GET)
    public String updateEmployeeSalary(final Model model) throws CMSItemNotFoundException
    {
        LOG.info("######## MyEmployeeController ########");
        model.addAttribute("employeeForm", new EmployeeForm());
        final ContentPageModel updateEmployeeSalaryPage = getContentPageForLabelOrId("update-employee-salary");
        storeCmsPageInModel(model, updateEmployeeSalaryPage);
        setUpMetaDataForContentPage(model, updateEmployeeSalaryPage);
        return ControllerConstants.Views.Pages.Misc.UpdateEmployeeSalary;
    }

    @RequestMapping(value = "/update-employee-salary", method = RequestMethod.POST)
    public String updateEmployeeSalary(final EmployeeForm employeeForm, final BindingResult bindingResult, final Model model,
                                       final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
        LOG.info("######## MyEmployeeController ########");
        if(employeeForm.getEmpId() == null)
        {
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.ERROR_MESSAGES_HOLDER, "Please Enter Employee ID", null);
            return REDIRECT_PREFIX + "update-employee-salary";
        }
        if(getMyEmployeeFacade().getSpecificEmployeeDetails(employeeForm.getEmpId()).isEmpty())
        {
            GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.ERROR_MESSAGES_HOLDER, "Employee Not Found", null);
            return REDIRECT_PREFIX + "update-employee-salary";
        }
        if (bindingResult.hasErrors())
        {
            GlobalMessages.addErrorMessage(model, FORM_GLOBAL_ERROR);
            final ContentPageModel updateEmployeeSalary = getContentPageForLabelOrId("update-employee-salary");
            storeCmsPageInModel(model, updateEmployeeSalary);
            setUpMetaDataForContentPage(model, updateEmployeeSalary);
            return getViewForPage(model);
        }
        String returnAction = REDIRECT_TO_EMPLOYEES;

        final List <MyEmployeeData> myEmployeeData = myEmployeeFacade.getSpecificEmployeeDetails(employeeForm.getEmpId());

        model.addAttribute("employeeForm", new EmployeeForm());

        final ContentPageModel updateEmployeeSalary = getContentPageForLabelOrId("update-employee-salary");
        storeCmsPageInModel(model, updateEmployeeSalary);
        setUpMetaDataForContentPage(model, updateEmployeeSalary);

        getMyEmployeeFacade().updateEmployeeSalary(employeeForm.getEmpId(), employeeForm.getEmpSalary());
        GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,
                "Employee Salary Updated!", null);

        return returnAction;
    }

    @RequestMapping(value = "/delete-employee/{empId}", method = RequestMethod.POST)
    public String deleteEmployee(@PathVariable final String empId,
                                 final RedirectAttributes redirectAttributes) throws CMSItemNotFoundException
    {
        LOG.info("######## MyEmployeeController ########");

        String returnAction = REDIRECT_TO_EMPLOYEES;

        getMyEmployeeFacade().removeEmployee(empId);
        GlobalMessages.addFlashMessage(redirectAttributes, GlobalMessages.CONF_MESSAGES_HOLDER,
                "Employee Removed with ID - " + empId + "!" , null);

        return returnAction;
    }

    protected EmployeeForm getPreparedEmployeeForm()
    {
        final EmployeeForm employeeForm = new EmployeeForm();
        employeeForm.setEmpId("Employee ID");
        employeeForm.setEmpName("Employee Name");
        employeeForm.setEmpSalary(0);
        employeeForm.setEmpWorkType("Employee WorkType");
        return employeeForm;
    }

    public MyEmployeeFacade getMyEmployeeFacade()
    {
        return myEmployeeFacade;
    }
    public void setMyEmployeeFacade(final MyEmployeeFacade myEmployeeFacade)
    {
        this.myEmployeeFacade = myEmployeeFacade;
    }

}