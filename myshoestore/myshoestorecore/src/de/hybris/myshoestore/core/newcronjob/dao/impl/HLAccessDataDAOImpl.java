package de.hybris.myshoestore.core.newcronjob.dao.impl;

import de.hybris.myshoestore.core.newcronjob.dao.HLAccessDataDAO;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class HLAccessDataDAOImpl implements HLAccessDataDAO {

    @Autowired
    public FlexibleSearchService flexibleSearchService;

    public static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    @Override
    public List<OrderModel> getOrderDataByDate(Date date) {
        final String query = "SELECT {pk} FROM {Order} WHERE {modifiedtime} BETWEEN ?startTimeOfDay AND ?endTimeOfDay";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_FORMAT);

        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        flexibleSearchQuery.addQueryParameter("startTimeOfDay", simpleDateFormat.format(atStartOfDay(date)));
        flexibleSearchQuery.addQueryParameter("endTimeOfDay", simpleDateFormat.format(atEndOfDay(date)));

        final SearchResult<OrderModel> result = flexibleSearchService.search(flexibleSearchQuery);
        if(null != result){
            result.getResult();
        }

        return Collections.emptyList();
    }

    private static Date atEndOfDay(Date date) {
        return DateUtils.addMilliseconds(DateUtils.ceiling(date, Calendar.DATE), -1);
    }

    private static Date atStartOfDay(Date date) {
        return DateUtils.truncate(date, Calendar.DATE);
    }

}
