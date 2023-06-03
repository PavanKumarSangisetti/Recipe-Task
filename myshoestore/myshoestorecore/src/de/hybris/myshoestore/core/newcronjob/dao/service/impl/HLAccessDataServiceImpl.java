package de.hybris.myshoestore.core.newcronjob.dao.service.impl;

import de.hybris.myshoestore.core.newcronjob.dao.HLAccessDataDAO;
import de.hybris.myshoestore.core.newcronjob.dao.service.HLAccessDataService;
import de.hybris.platform.core.model.order.OrderModel;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

public class HLAccessDataServiceImpl implements HLAccessDataService {

    @Resource(name = "hLAccessDataDAO")
    private HLAccessDataDAO hLAccessDataDAO;
    @Override
    public List<OrderModel> getOrderDataByDate(Date date) {
        return hLAccessDataDAO.getOrderDataByDate(date);
    }
}
