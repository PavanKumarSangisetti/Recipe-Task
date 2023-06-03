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
import de.hybris.myshoestore.core.jalo.Ingredient;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Recipe}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedRecipe extends GenericItem
{
	/** Qualifier of the <code>Recipe.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Recipe.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Recipe.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Recipe.ingredient</code> attribute **/
	public static final String INGREDIENT = "ingredient";
	/** Relation ordering override parameter constants for RecipeIngredientRelation from ((myshoestorecore))*/
	protected static String RECIPEINGREDIENTRELATION_SRC_ORDERED = "relation.RecipeIngredientRelation.source.ordered";
	protected static String RECIPEINGREDIENTRELATION_TGT_ORDERED = "relation.RecipeIngredientRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for RecipeIngredientRelation from ((myshoestorecore))*/
	protected static String RECIPEINGREDIENTRELATION_MARKMODIFIED = "relation.RecipeIngredientRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.code</code> attribute.
	 * @return the code - Unique identifier for the recipe.
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.code</code> attribute.
	 * @return the code - Unique identifier for the recipe.
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.code</code> attribute. 
	 * @param value the code - Unique identifier for the recipe.
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.code</code> attribute. 
	 * @param value the code - Unique identifier for the recipe.
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute.
	 * @return the description - Description of the recipe.
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.description</code> attribute.
	 * @return the description - Description of the recipe.
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description - Description of the recipe.
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.description</code> attribute. 
	 * @param value the description - Description of the recipe.
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.ingredient</code> attribute.
	 * @return the ingredient
	 */
	public Set<Ingredient> getIngredient(final SessionContext ctx)
	{
		final List<Ingredient> items = getLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			"Ingredient",
			null,
			false,
			false
		);
		return new LinkedHashSet<Ingredient>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.ingredient</code> attribute.
	 * @return the ingredient
	 */
	public Set<Ingredient> getIngredient()
	{
		return getIngredient( getSession().getSessionContext() );
	}
	
	public long getIngredientCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			"Ingredient",
			null
		);
	}
	
	public long getIngredientCount()
	{
		return getIngredientCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.ingredient</code> attribute. 
	 * @param value the ingredient
	 */
	public void setIngredient(final SessionContext ctx, final Set<Ingredient> value)
	{
		setLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPEINGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.ingredient</code> attribute. 
	 * @param value the ingredient
	 */
	public void setIngredient(final Set<Ingredient> value)
	{
		setIngredient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ingredient. 
	 * @param value the item to add to ingredient
	 */
	public void addToIngredient(final SessionContext ctx, final Ingredient value)
	{
		addLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPEINGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ingredient. 
	 * @param value the item to add to ingredient
	 */
	public void addToIngredient(final Ingredient value)
	{
		addToIngredient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ingredient. 
	 * @param value the item to remove from ingredient
	 */
	public void removeFromIngredient(final SessionContext ctx, final Ingredient value)
	{
		removeLinkedItems( 
			ctx,
			true,
			MyshoestoreCoreConstants.Relations.RECIPEINGREDIENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RECIPEINGREDIENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ingredient. 
	 * @param value the item to remove from ingredient
	 */
	public void removeFromIngredient(final Ingredient value)
	{
		removeFromIngredient( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Ingredient");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(RECIPEINGREDIENTRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.title</code> attribute.
	 * @return the title - Title of the recipe.
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.title</code> attribute.
	 * @return the title - Title of the recipe.
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.title</code> attribute. 
	 * @param value the title - Title of the recipe.
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.title</code> attribute. 
	 * @param value the title - Title of the recipe.
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
