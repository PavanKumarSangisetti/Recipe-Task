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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MyEmployee}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyEmployee extends GenericItem
{
	/** Qualifier of the <code>MyEmployee.empId</code> attribute **/
	public static final String EMPID = "empId";
	/** Qualifier of the <code>MyEmployee.empName</code> attribute **/
	public static final String EMPNAME = "empName";
	/** Qualifier of the <code>MyEmployee.empSalary</code> attribute **/
	public static final String EMPSALARY = "empSalary";
	/** Qualifier of the <code>MyEmployee.empWorkType</code> attribute **/
	public static final String EMPWORKTYPE = "empWorkType";
	/** Qualifier of the <code>MyEmployee.WorkTypeEnumeration</code> attribute **/
	public static final String WORKTYPEENUMERATION = "WorkTypeEnumeration";
	/** Relation ordering override parameter constants for EmployeeRelation from ((myshoestorecore))*/
	protected static String EMPLOYEERELATION_SRC_ORDERED = "relation.EmployeeRelation.source.ordered";
	protected static String EMPLOYEERELATION_TGT_ORDERED = "relation.EmployeeRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for EmployeeRelation from ((myshoestorecore))*/
	protected static String EMPLOYEERELATION_MARKMODIFIED = "relation.EmployeeRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(EMPID, AttributeMode.INITIAL);
		tmp.put(EMPNAME, AttributeMode.INITIAL);
		tmp.put(EMPSALARY, AttributeMode.INITIAL);
		tmp.put(EMPWORKTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empId</code> attribute.
	 * @return the empId - Employee ID
	 */
	public String getEmpId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMPID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empId</code> attribute.
	 * @return the empId - Employee ID
	 */
	public String getEmpId()
	{
		return getEmpId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empId</code> attribute. 
	 * @param value the empId - Employee ID
	 */
	public void setEmpId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMPID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empId</code> attribute. 
	 * @param value the empId - Employee ID
	 */
	public void setEmpId(final String value)
	{
		setEmpId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empName</code> attribute.
	 * @return the empName - Employee Name
	 */
	public String getEmpName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMPNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empName</code> attribute.
	 * @return the empName - Employee Name
	 */
	public String getEmpName()
	{
		return getEmpName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empName</code> attribute. 
	 * @param value the empName - Employee Name
	 */
	public void setEmpName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMPNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empName</code> attribute. 
	 * @param value the empName - Employee Name
	 */
	public void setEmpName(final String value)
	{
		setEmpName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empSalary</code> attribute.
	 * @return the empSalary - Employee salary
	 */
	public Double getEmpSalary(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, EMPSALARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empSalary</code> attribute.
	 * @return the empSalary - Employee salary
	 */
	public Double getEmpSalary()
	{
		return getEmpSalary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empSalary</code> attribute. 
	 * @return the empSalary - Employee salary
	 */
	public double getEmpSalaryAsPrimitive(final SessionContext ctx)
	{
		Double value = getEmpSalary( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empSalary</code> attribute. 
	 * @return the empSalary - Employee salary
	 */
	public double getEmpSalaryAsPrimitive()
	{
		return getEmpSalaryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empSalary</code> attribute. 
	 * @param value the empSalary - Employee salary
	 */
	public void setEmpSalary(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, EMPSALARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empSalary</code> attribute. 
	 * @param value the empSalary - Employee salary
	 */
	public void setEmpSalary(final Double value)
	{
		setEmpSalary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empSalary</code> attribute. 
	 * @param value the empSalary - Employee salary
	 */
	public void setEmpSalary(final SessionContext ctx, final double value)
	{
		setEmpSalary( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empSalary</code> attribute. 
	 * @param value the empSalary - Employee salary
	 */
	public void setEmpSalary(final double value)
	{
		setEmpSalary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empWorkType</code> attribute.
	 * @return the empWorkType - Employee Work Type
	 */
	public EnumerationValue getEmpWorkType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, EMPWORKTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.empWorkType</code> attribute.
	 * @return the empWorkType - Employee Work Type
	 */
	public EnumerationValue getEmpWorkType()
	{
		return getEmpWorkType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empWorkType</code> attribute. 
	 * @param value the empWorkType - Employee Work Type
	 */
	public void setEmpWorkType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, EMPWORKTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.empWorkType</code> attribute. 
	 * @param value the empWorkType - Employee Work Type
	 */
	public void setEmpWorkType(final EnumerationValue value)
	{
		setEmpWorkType( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("WorkTypeEnumeration");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(EMPLOYEERELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.WorkTypeEnumeration</code> attribute.
	 * @return the WorkTypeEnumeration - Employee WORK FROM HOME/OFFICE
	 */
	public Set<EnumerationValue> getWorkTypeEnumeration(final SessionContext ctx)
	{
		final List<EnumerationValue> items = getLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			"WorkTypeEnumeration",
			null,
			false,
			false
		);
		return new LinkedHashSet<EnumerationValue>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyEmployee.WorkTypeEnumeration</code> attribute.
	 * @return the WorkTypeEnumeration - Employee WORK FROM HOME/OFFICE
	 */
	public Set<EnumerationValue> getWorkTypeEnumeration()
	{
		return getWorkTypeEnumeration( getSession().getSessionContext() );
	}
	
	public long getWorkTypeEnumerationCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			"WorkTypeEnumeration",
			null
		);
	}
	
	public long getWorkTypeEnumerationCount()
	{
		return getWorkTypeEnumerationCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.WorkTypeEnumeration</code> attribute. 
	 * @param value the WorkTypeEnumeration - Employee WORK FROM HOME/OFFICE
	 */
	public void setWorkTypeEnumeration(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyEmployee.WorkTypeEnumeration</code> attribute. 
	 * @param value the WorkTypeEnumeration - Employee WORK FROM HOME/OFFICE
	 */
	public void setWorkTypeEnumeration(final Set<EnumerationValue> value)
	{
		setWorkTypeEnumeration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to WorkTypeEnumeration. 
	 * @param value the item to add to WorkTypeEnumeration - Employee WORK FROM HOME/OFFICE
	 */
	public void addToWorkTypeEnumeration(final SessionContext ctx, final EnumerationValue value)
	{
		addLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to WorkTypeEnumeration. 
	 * @param value the item to add to WorkTypeEnumeration - Employee WORK FROM HOME/OFFICE
	 */
	public void addToWorkTypeEnumeration(final EnumerationValue value)
	{
		addToWorkTypeEnumeration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from WorkTypeEnumeration. 
	 * @param value the item to remove from WorkTypeEnumeration - Employee WORK FROM HOME/OFFICE
	 */
	public void removeFromWorkTypeEnumeration(final SessionContext ctx, final EnumerationValue value)
	{
		removeLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from WorkTypeEnumeration. 
	 * @param value the item to remove from WorkTypeEnumeration - Employee WORK FROM HOME/OFFICE
	 */
	public void removeFromWorkTypeEnumeration(final EnumerationValue value)
	{
		removeFromWorkTypeEnumeration( getSession().getSessionContext(), value );
	}
	
}
