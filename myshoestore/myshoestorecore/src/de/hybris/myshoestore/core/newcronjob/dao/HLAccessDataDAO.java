package de.hybris.myshoestore.core.newcronjob.dao;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.Date;
import java.util.List;

public interface HLAccessDataDAO {

    public List<OrderModel> getOrderDataByDate(Date date);
}
