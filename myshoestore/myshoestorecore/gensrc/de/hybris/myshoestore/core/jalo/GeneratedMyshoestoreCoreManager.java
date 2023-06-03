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
import de.hybris.myshoestore.core.jalo.ApparelProduct;
import de.hybris.myshoestore.core.jalo.ApparelSizeVariantProduct;
import de.hybris.myshoestore.core.jalo.ApparelStyleVariantProduct;
import de.hybris.myshoestore.core.jalo.Cadburry;
import de.hybris.myshoestore.core.jalo.CustomBannerOffersComponent;
import de.hybris.myshoestore.core.jalo.DiscountEmail;
import de.hybris.myshoestore.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.myshoestore.core.jalo.HLOrderExportCronJob;
import de.hybris.myshoestore.core.jalo.Ingredient;
import de.hybris.myshoestore.core.jalo.MyEmployee;
import de.hybris.myshoestore.core.jalo.Recipe;
import de.hybris.myshoestore.core.jalo.components.YoutubeVideoComponent;
import de.hybris.platform.deeplink.jalo.media.BarcodeMedia;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>MyshoestoreCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyshoestoreCoreManager extends Extension
{
	/** Relation ordering override parameter constants for Customer2ProductRelation from ((myshoestorecore))*/
	protected static String CUSTOMER2PRODUCTRELATION_SRC_ORDERED = "relation.Customer2ProductRelation.source.ordered";
	protected static String CUSTOMER2PRODUCTRELATION_TGT_ORDERED = "relation.Customer2ProductRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Customer2ProductRelation from ((myshoestorecore))*/
	protected static String CUSTOMER2PRODUCTRELATION_MARKMODIFIED = "relation.Customer2ProductRelation.markmodified";
	/** Relation ordering override parameter constants for EmployeeRelation from ((myshoestorecore))*/
	protected static String EMPLOYEERELATION_SRC_ORDERED = "relation.EmployeeRelation.source.ordered";
	protected static String EMPLOYEERELATION_TGT_ORDERED = "relation.EmployeeRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for EmployeeRelation from ((myshoestorecore))*/
	protected static String EMPLOYEERELATION_MARKMODIFIED = "relation.EmployeeRelation.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("LoyaltyPoints", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("CustomAttribute", AttributeMode.INITIAL);
		tmp.put("productQRCode", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Cadburry createCadburry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.CADBURRY );
			return (Cadburry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Cadburry : "+e.getMessage(), 0 );
		}
	}
	
	public Cadburry createCadburry(final Map attributeValues)
	{
		return createCadburry( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomBannerOffersComponent createCustomBannerOffersComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.CUSTOMBANNEROFFERSCOMPONENT );
			return (CustomBannerOffersComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomBannerOffersComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CustomBannerOffersComponent createCustomBannerOffersComponent(final Map attributeValues)
	{
		return createCustomBannerOffersComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountEmail createDiscountEmail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.DISCOUNTEMAIL );
			return (DiscountEmail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DiscountEmail : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountEmail createDiscountEmail(final Map attributeValues)
	{
		return createDiscountEmail( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public HLOrderExportCronJob createHLOrderExportCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.HLORDEREXPORTCRONJOB );
			return (HLOrderExportCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating HLOrderExportCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public HLOrderExportCronJob createHLOrderExportCronJob(final Map attributeValues)
	{
		return createHLOrderExportCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public Ingredient createIngredient(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.INGREDIENT );
			return (Ingredient)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Ingredient : "+e.getMessage(), 0 );
		}
	}
	
	public Ingredient createIngredient(final Map attributeValues)
	{
		return createIngredient( getSession().getSessionContext(), attributeValues );
	}
	
	public MyEmployee createMyEmployee(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.MYEMPLOYEE );
			return (MyEmployee)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MyEmployee : "+e.getMessage(), 0 );
		}
	}
	
	public MyEmployee createMyEmployee(final Map attributeValues)
	{
		return createMyEmployee( getSession().getSessionContext(), attributeValues );
	}
	
	public Recipe createRecipe(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.RECIPE );
			return (Recipe)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Recipe : "+e.getMessage(), 0 );
		}
	}
	
	public Recipe createRecipe(final Map attributeValues)
	{
		return createRecipe( getSession().getSessionContext(), attributeValues );
	}
	
	public YoutubeVideoComponent createYoutubeVideoComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MyshoestoreCoreConstants.TC.YOUTUBEVIDEOCOMPONENT );
			return (YoutubeVideoComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating YoutubeVideoComponent : "+e.getMessage(), 0 );
		}
	}
	
	public YoutubeVideoComponent createYoutubeVideoComponent(final Map attributeValues)
	{
		return createYoutubeVideoComponent( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.CustomAttribute</code> attribute.
	 * @return the CustomAttribute
	 */
	public String getCustomAttribute(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, MyshoestoreCoreConstants.Attributes.Product.CUSTOMATTRIBUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.CustomAttribute</code> attribute.
	 * @return the CustomAttribute
	 */
	public String getCustomAttribute(final Product item)
	{
		return getCustomAttribute( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.CustomAttribute</code> attribute. 
	 * @param value the CustomAttribute
	 */
	public void setCustomAttribute(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, MyshoestoreCoreConstants.Attributes.Product.CUSTOMATTRIBUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.CustomAttribute</code> attribute. 
	 * @param value the CustomAttribute
	 */
	public void setCustomAttribute(final Product item, final String value)
	{
		setCustomAttribute( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customer</code> attribute.
	 * @return the customer - Customer
	 */
	public Set<Customer> getCustomer(final SessionContext ctx, final Product item)
	{
		final List<Customer> items = item.getLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			"Customer",
			null,
			false,
			false
		);
		return new LinkedHashSet<Customer>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.customer</code> attribute.
	 * @return the customer - Customer
	 */
	public Set<Customer> getCustomer(final Product item)
	{
		return getCustomer( getSession().getSessionContext(), item );
	}
	
	public long getCustomerCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			"Customer",
			null
		);
	}
	
	public long getCustomerCount(final Product item)
	{
		return getCustomerCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customer</code> attribute. 
	 * @param value the customer - Customer
	 */
	public void setCustomer(final SessionContext ctx, final Product item, final Set<Customer> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.customer</code> attribute. 
	 * @param value the customer - Customer
	 */
	public void setCustomer(final Product item, final Set<Customer> value)
	{
		setCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customer. 
	 * @param value the item to add to customer - Customer
	 */
	public void addToCustomer(final SessionContext ctx, final Product item, final Customer value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customer. 
	 * @param value the item to add to customer - Customer
	 */
	public void addToCustomer(final Product item, final Customer value)
	{
		addToCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customer. 
	 * @param value the item to remove from customer - Customer
	 */
	public void removeFromCustomer(final SessionContext ctx, final Product item, final Customer value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customer. 
	 * @param value the item to remove from customer - Customer
	 */
	public void removeFromCustomer(final Product item, final Customer value)
	{
		removeFromCustomer( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return MyshoestoreCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.LoyaltyPoints</code> attribute.
	 * @return the LoyaltyPoints - Loyalty Points of User
	 */
	public Integer getLoyaltyPoints(final SessionContext ctx, final Customer item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomer.getLoyaltyPoints requires a session language", 0 );
		}
		return (Integer)item.getLocalizedProperty( ctx, MyshoestoreCoreConstants.Attributes.Customer.LOYALTYPOINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.LoyaltyPoints</code> attribute.
	 * @return the LoyaltyPoints - Loyalty Points of User
	 */
	public Integer getLoyaltyPoints(final Customer item)
	{
		return getLoyaltyPoints( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @return the LoyaltyPoints - Loyalty Points of User
	 */
	public int getLoyaltyPointsAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Integer value = getLoyaltyPoints( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @return the LoyaltyPoints - Loyalty Points of User
	 */
	public int getLoyaltyPointsAsPrimitive(final Customer item)
	{
		return getLoyaltyPointsAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @return the localized LoyaltyPoints - Loyalty Points of User
	 */
	public Map<Language,Integer> getAllLoyaltyPoints(final SessionContext ctx, final Customer item)
	{
		return (Map<Language,Integer>)item.getAllLocalizedProperties(ctx,MyshoestoreCoreConstants.Attributes.Customer.LOYALTYPOINTS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @return the localized LoyaltyPoints - Loyalty Points of User
	 */
	public Map<Language,Integer> getAllLoyaltyPoints(final Customer item)
	{
		return getAllLoyaltyPoints( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @param value the LoyaltyPoints - Loyalty Points of User
	 */
	public void setLoyaltyPoints(final SessionContext ctx, final Customer item, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCustomer.setLoyaltyPoints requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, MyshoestoreCoreConstants.Attributes.Customer.LOYALTYPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @param value the LoyaltyPoints - Loyalty Points of User
	 */
	public void setLoyaltyPoints(final Customer item, final Integer value)
	{
		setLoyaltyPoints( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @param value the LoyaltyPoints - Loyalty Points of User
	 */
	public void setLoyaltyPoints(final SessionContext ctx, final Customer item, final int value)
	{
		setLoyaltyPoints( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @param value the LoyaltyPoints - Loyalty Points of User
	 */
	public void setLoyaltyPoints(final Customer item, final int value)
	{
		setLoyaltyPoints( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @param value the LoyaltyPoints - Loyalty Points of User
	 */
	public void setAllLoyaltyPoints(final SessionContext ctx, final Customer item, final Map<Language,Integer> value)
	{
		item.setAllLocalizedProperties(ctx,MyshoestoreCoreConstants.Attributes.Customer.LOYALTYPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.LoyaltyPoints</code> attribute. 
	 * @param value the LoyaltyPoints - Loyalty Points of User
	 */
	public void setAllLoyaltyPoints(final Customer item, final Map<Language,Integer> value)
	{
		setAllLoyaltyPoints( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WorkTypeEnumeration.MyEmployee</code> attribute.
	 * @return the MyEmployee
	 */
	public Set<MyEmployee> getMyEmployee(final SessionContext ctx, final EnumerationValue item)
	{
		final List<MyEmployee> items = item.getLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			"MyEmployee",
			null,
			false,
			false
		);
		return new LinkedHashSet<MyEmployee>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>WorkTypeEnumeration.MyEmployee</code> attribute.
	 * @return the MyEmployee
	 */
	public Set<MyEmployee> getMyEmployee(final EnumerationValue item)
	{
		return getMyEmployee( getSession().getSessionContext(), item );
	}
	
	public long getMyEmployeeCount(final SessionContext ctx, final EnumerationValue item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			"MyEmployee",
			null
		);
	}
	
	public long getMyEmployeeCount(final EnumerationValue item)
	{
		return getMyEmployeeCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WorkTypeEnumeration.MyEmployee</code> attribute. 
	 * @param value the MyEmployee
	 */
	public void setMyEmployee(final SessionContext ctx, final EnumerationValue item, final Set<MyEmployee> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>WorkTypeEnumeration.MyEmployee</code> attribute. 
	 * @param value the MyEmployee
	 */
	public void setMyEmployee(final EnumerationValue item, final Set<MyEmployee> value)
	{
		setMyEmployee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to MyEmployee. 
	 * @param value the item to add to MyEmployee
	 */
	public void addToMyEmployee(final SessionContext ctx, final EnumerationValue item, final MyEmployee value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to MyEmployee. 
	 * @param value the item to add to MyEmployee
	 */
	public void addToMyEmployee(final EnumerationValue item, final MyEmployee value)
	{
		addToMyEmployee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from MyEmployee. 
	 * @param value the item to remove from MyEmployee
	 */
	public void removeFromMyEmployee(final SessionContext ctx, final EnumerationValue item, final MyEmployee value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.EMPLOYEERELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEERELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from MyEmployee. 
	 * @param value the item to remove from MyEmployee
	 */
	public void removeFromMyEmployee(final EnumerationValue item, final MyEmployee value)
	{
		removeFromMyEmployee( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.myshoestoreProductlist</code> attribute.
	 * @return the myshoestoreProductlist - Product
	 */
	public Set<Product> getMyshoestoreProductlist(final SessionContext ctx, final Customer item)
	{
		final List<Product> items = item.getLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			"Product",
			null,
			false,
			false
		);
		return new LinkedHashSet<Product>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.myshoestoreProductlist</code> attribute.
	 * @return the myshoestoreProductlist - Product
	 */
	public Set<Product> getMyshoestoreProductlist(final Customer item)
	{
		return getMyshoestoreProductlist( getSession().getSessionContext(), item );
	}
	
	public long getMyshoestoreProductlistCount(final SessionContext ctx, final Customer item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			"Product",
			null
		);
	}
	
	public long getMyshoestoreProductlistCount(final Customer item)
	{
		return getMyshoestoreProductlistCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.myshoestoreProductlist</code> attribute. 
	 * @param value the myshoestoreProductlist - Product
	 */
	public void setMyshoestoreProductlist(final SessionContext ctx, final Customer item, final Set<Product> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.myshoestoreProductlist</code> attribute. 
	 * @param value the myshoestoreProductlist - Product
	 */
	public void setMyshoestoreProductlist(final Customer item, final Set<Product> value)
	{
		setMyshoestoreProductlist( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to myshoestoreProductlist. 
	 * @param value the item to add to myshoestoreProductlist - Product
	 */
	public void addToMyshoestoreProductlist(final SessionContext ctx, final Customer item, final Product value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to myshoestoreProductlist. 
	 * @param value the item to add to myshoestoreProductlist - Product
	 */
	public void addToMyshoestoreProductlist(final Customer item, final Product value)
	{
		addToMyshoestoreProductlist( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from myshoestoreProductlist. 
	 * @param value the item to remove from myshoestoreProductlist - Product
	 */
	public void removeFromMyshoestoreProductlist(final SessionContext ctx, final Customer item, final Product value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.CUSTOMER2PRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMER2PRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from myshoestoreProductlist. 
	 * @param value the item to remove from myshoestoreProductlist - Product
	 */
	public void removeFromMyshoestoreProductlist(final Customer item, final Product value)
	{
		removeFromMyshoestoreProductlist( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productQRCode</code> attribute.
	 * @return the productQRCode
	 */
	public BarcodeMedia getProductQRCode(final SessionContext ctx, final Product item)
	{
		return (BarcodeMedia)item.getProperty( ctx, MyshoestoreCoreConstants.Attributes.Product.PRODUCTQRCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productQRCode</code> attribute.
	 * @return the productQRCode
	 */
	public BarcodeMedia getProductQRCode(final Product item)
	{
		return getProductQRCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productQRCode</code> attribute. 
	 * @param value the productQRCode
	 */
	public void setProductQRCode(final SessionContext ctx, final Product item, final BarcodeMedia value)
	{
		item.setProperty(ctx, MyshoestoreCoreConstants.Attributes.Product.PRODUCTQRCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productQRCode</code> attribute. 
	 * @param value the productQRCode
	 */
	public void setProductQRCode(final Product item, final BarcodeMedia value)
	{
		setProductQRCode( getSession().getSessionContext(), item, value );
	}
	
}
