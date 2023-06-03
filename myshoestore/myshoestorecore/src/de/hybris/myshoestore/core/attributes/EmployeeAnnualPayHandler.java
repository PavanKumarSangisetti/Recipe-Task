package de.hybris.myshoestore.core.attributes;


import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import de.hybris.myshoestore.core.model.MyEmployeeModel;


public class EmployeeAnnualPayHandler extends AbstractDynamicAttributeHandler<Double, MyEmployeeModel> {

    @Override
    public Double get(final MyEmployeeModel model)
    {
        double employeeAnnualPay = 0;
        try
        {
            employeeAnnualPay = 12 * model.getEmpSalary();
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }
        return employeeAnnualPay;
    }

}