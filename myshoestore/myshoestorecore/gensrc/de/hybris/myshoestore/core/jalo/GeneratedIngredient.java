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
import de.hybris.myshoestore.core.jalo.Recipe;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Ingredient}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedIngredient extends Recipe
{
	/** Qualifier of the <code>Ingredient.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Ingredient.units</code> attribute **/
	public static final String UNITS = "units";
	/** Qualifier of the <code>Ingredient.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	/** Qualifier of the <code>Ingredient.recipe</code> attribute **/
	public static final String RECIPE = "recipe";
	/** Relation ordering override parameter constants for RecipeIngredientRelation from ((myshoestorecore))*/
	protected static String RECIPEINGREDIENTRELATION_SRC_ORDERED = "relation.RecipeIngredientRelation.source.ordered";
	protected static String RECIPEINGREDIENTRELATION_TGT_ORDERED = "relation.RecipeIngredientRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for RecipeIngredientRelation from ((myshoestorecore))*/
	protected static String RECIPEINGREDIENTRELATION_MARKMODIFIED = "relation.RecipeIngredientRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Recipe.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(UNITS, AttributeMode.INITIAL);
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Recipe");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(RECIPEINGREDIENTRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.name</code> attribute.
	 * @return the name - Name of the ingredient.
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.name</code> attribute.
	 * @return the name - Name of the ingredient.
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.name</code> attribute. 
	 * @param value the name - Name of the ingredient.
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.name</code> attribute. 
	 * @param value the name - Name of the ingredient.
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.quantity</code> attribute.
	 * @return the quantity - Quantity of the ingredient.
	 */
	public Double getQuantity(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, QUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.quantity</code> attribute.
	 * @return the quantity - Quantity of the ingredient.
	 */
	public Double getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.quantity</code> attribute. 
	 * @return the quantity - Quantity of the ingredient.
	 */
	public double getQuantityAsPrimitive(final SessionContext ctx)
	{
		Double value = getQuantity( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.quantity</code> attribute. 
	 * @return the quantity - Quantity of the ingredient.
	 */
	public double getQuantityAsPrimitive()
	{
		return getQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.quantity</code> attribute. 
	 * @param value the quantity - Quantity of the ingredient.
	 */
	public void setQuantity(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, QUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.quantity</code> attribute. 
	 * @param value the quantity - Quantity of the ingredient.
	 */
	public void setQuantity(final Double value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.quantity</code> attribute. 
	 * @param value the quantity - Quantity of the ingredient.
	 */
	public void setQuantity(final SessionContext ctx, final double value)
	{
		setQuantity( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.quantity</code> attribute. 
	 * @param value the quantity - Quantity of the ingredient.
	 */
	public void setQuantity(final double value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.recipe</code> attribute.
	 * @return the recipe
	 */
	public Set<Recipe> getRecipe(final SessionContext ctx)
	{
		final List<Recipe> items = getLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			"Recipe",
			null,
			false,
			false
		);
		return new LinkedHashSet<Recipe>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.recipe</code> attribute.
	 * @return the recipe
	 */
	public Set<Recipe> getRecipe()
	{
		return getRecipe( getSession().getSessionContext() );
	}
	
	public long getRecipeCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			"Recipe",
			null
		);
	}
	
	public long getRecipeCount()
	{
		return getRecipeCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.recipe</code> attribute. 
	 * @param value the recipe
	 */
	public void setRecipe(final SessionContext ctx, final Set<Recipe> value)
	{
		setLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPEINGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.recipe</code> attribute. 
	 * @param value the recipe
	 */
	public void setRecipe(final Set<Recipe> value)
	{
		setRecipe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipe. 
	 * @param value the item to add to recipe
	 */
	public void addToRecipe(final SessionContext ctx, final Recipe value)
	{
		addLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPEINGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipe. 
	 * @param value the item to add to recipe
	 */
	public void addToRecipe(final Recipe value)
	{
		addToRecipe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipe. 
	 * @param value the item to remove from recipe
	 */
	public void removeFromRecipe(final SessionContext ctx, final Recipe value)
	{
		removeLinkedItems( 
			ctx,
			false,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPEINGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipe. 
	 * @param value the item to remove from recipe
	 */
	public void removeFromRecipe(final Recipe value)
	{
		removeFromRecipe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.units</code> attribute.
	 * @return the units - Units of measurement for the ingredient.
	 */
	public EnumerationValue getUnits(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UNITS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingredient.units</code> attribute.
	 * @return the units - Units of measurement for the ingredient.
	 */
	public EnumerationValue getUnits()
	{
		return getUnits( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.units</code> attribute. 
	 * @param value the units - Units of measurement for the ingredient.
	 */
	public void setUnits(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UNITS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingredient.units</code> attribute. 
	 * @param value the units - Units of measurement for the ingredient.
	 */
	public void setUnits(final EnumerationValue value)
	{
		setUnits( getSession().getSessionContext(), value );
	}
	
}
