package de.hybris.myshoestore.core.newcronjob.dao.service;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.Date;
import java.util.List;

public interface HLAccessDataService {
    public List<OrderModel> getOrderDataByDate(Date date);
}
