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
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Cadburry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCadburry extends GenericItem
{
	/** Qualifier of the <code>Cadburry.qty</code> attribute **/
	public static final String QTY = "qty";
	/** Qualifier of the <code>Cadburry.price</code> attribute **/
	public static final String PRICE = "price";
	/** Qualifier of the <code>Cadburry.products</code> attribute **/
	public static final String PRODUCTS = "products";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(QTY, AttributeMode.INITIAL);
		tmp.put(PRICE, AttributeMode.INITIAL);
		tmp.put(PRODUCTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.price</code> attribute.
	 * @return the price - Price
	 */
	public Double getPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.price</code> attribute.
	 * @return the price - Price
	 */
	public Double getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.price</code> attribute. 
	 * @return the price - Price
	 */
	public double getPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.price</code> attribute. 
	 * @return the price - Price
	 */
	public double getPriceAsPrimitive()
	{
		return getPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.price</code> attribute. 
	 * @param value the price - Price
	 */
	public void setPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.price</code> attribute. 
	 * @param value the price - Price
	 */
	public void setPrice(final Double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.price</code> attribute. 
	 * @param value the price - Price
	 */
	public void setPrice(final SessionContext ctx, final double value)
	{
		setPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.price</code> attribute. 
	 * @param value the price - Price
	 */
	public void setPrice(final double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.products</code> attribute.
	 * @return the products - Name of the Product
	 */
	public String getProducts(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.products</code> attribute.
	 * @return the products - Name of the Product
	 */
	public String getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.products</code> attribute. 
	 * @param value the products - Name of the Product
	 */
	public void setProducts(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.products</code> attribute. 
	 * @param value the products - Name of the Product
	 */
	public void setProducts(final String value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.qty</code> attribute.
	 * @return the qty - Quantity
	 */
	public Integer getQty(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.qty</code> attribute.
	 * @return the qty - Quantity
	 */
	public Integer getQty()
	{
		return getQty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.qty</code> attribute. 
	 * @return the qty - Quantity
	 */
	public int getQtyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQty( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cadburry.qty</code> attribute. 
	 * @return the qty - Quantity
	 */
	public int getQtyAsPrimitive()
	{
		return getQtyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.qty</code> attribute. 
	 * @param value the qty - Quantity
	 */
	public void setQty(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.qty</code> attribute. 
	 * @param value the qty - Quantity
	 */
	public void setQty(final Integer value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.qty</code> attribute. 
	 * @param value the qty - Quantity
	 */
	public void setQty(final SessionContext ctx, final int value)
	{
		setQty( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cadburry.qty</code> attribute. 
	 * @param value the qty - Quantity
	 */
	public void setQty(final int value)
	{
		setQty( getSession().getSessionContext(), value );
	}
	
}
