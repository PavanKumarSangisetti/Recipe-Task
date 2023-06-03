package de.hybris.myshoestore.core.Interceptors;

import de.hybris.myshoestore.core.model.MyEmployeeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class MyEmployeeValidateInterceptor implements ValidateInterceptor<MyEmployeeModel>{

    @Override
    public void onValidate(MyEmployeeModel myEmployee, InterceptorContext ctx) throws InterceptorException {

        if (myEmployee.getEmpSalary() < 5000)
        {
            throw new InterceptorException("Employee cannot have Salary greater than 5000");
        }
    }

}

