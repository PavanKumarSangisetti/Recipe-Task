package de.hybris.myshoestore.facades.populators;




import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.log4j.Logger;
import org.springframework.util.Assert;
import de.hybris.myshoestore.core.model.MyEmployeeModel;

 import de.hybris.myshoestore.facades.product.data.MyEmployeeData;


public class MyEmployeeDataPopulator implements Populator<MyEmployeeModel, MyEmployeeData>
{

    private static final Logger LOG = Logger.getLogger(MyEmployeeDataPopulator.class);

    @Override
    public void populate(final MyEmployeeModel source, final MyEmployeeData target) throws ConversionException
    {
        LOG.info("########## MyEmployeeDetailsDataPopulator ###########");
        Assert.notNull(source, "Parameter source can not be null");
        Assert.notNull(target, "Parameter target can not be null");
        target.setEmpId(source.getEmpId());
        target.setEmpName(source.getEmpName());
        target.setEmpSalary(source.getEmpSalary());
        target.setEmpWorkType(source.getEmpWorkType());
        target.setEmpAnnualPay(source.getEmpAnnualPay());
    }

}

