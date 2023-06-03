package de.hybris.myshoestore.core.Interceptors;

import de.hybris.myshoestore.core.model.MyEmployeeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

public class MyEmployeePrepareInterceptor implements PrepareInterceptor<MyEmployeeModel> {


    @Override
    public void onPrepare(MyEmployeeModel myEmployeeModel, InterceptorContext interceptorContext) throws InterceptorException {

        if(myEmployeeModel==null)
        {
            myEmployeeModel.setEmpId("null");
        }
        else {
            myEmployeeModel.setEmpId(myEmployeeModel.getEmpId());

        }
    }
}
