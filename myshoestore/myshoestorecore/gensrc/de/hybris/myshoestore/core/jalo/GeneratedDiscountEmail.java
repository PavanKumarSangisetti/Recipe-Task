/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 03-Jun-2023, 10:30:16 AM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.myshoestore.core.jalo;

import de.hybris.myshoestore.core.constants.MyshoestoreCoreConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.AbstractOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.commerceservices.jalo.process.StoreFrontCustomerProcess DiscountEmail}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDiscountEmail extends StoreFrontCustomerProcess
{
	/** Qualifier of the <code>DiscountEmail.cart</code> attribute **/
	public static final String CART = "cart";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontCustomerProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CART, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountEmail.cart</code> attribute.
	 * @return the cart
	 */
	public AbstractOrder getCart(final SessionContext ctx)
	{
		return (AbstractOrder)getProperty( ctx, CART);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiscountEmail.cart</code> attribute.
	 * @return the cart
	 */
	public AbstractOrder getCart()
	{
		return getCart( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountEmail.cart</code> attribute. 
	 * @param value the cart
	 */
	public void setCart(final SessionContext ctx, final AbstractOrder value)
	{
		setProperty(ctx, CART,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiscountEmail.cart</code> attribute. 
	 * @param value the cart
	 */
	public void setCart(final AbstractOrder value)
	{
		setCart( getSession().getSessionContext(), value );
	}
	
}
