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
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.myshoestore.core.jalo.HLOrderExportCronJob HLOrderExportCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedHLOrderExportCronJob extends CronJob
{
	/** Qualifier of the <code>HLOrderExportCronJob.dateExport</code> attribute **/
	public static final String DATEEXPORT = "dateExport";
	/** Qualifier of the <code>HLOrderExportCronJob.exportMedia</code> attribute **/
	public static final String EXPORTMEDIA = "exportMedia";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DATEEXPORT, AttributeMode.INITIAL);
		tmp.put(EXPORTMEDIA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HLOrderExportCronJob.dateExport</code> attribute.
	 * @return the dateExport
	 */
	public Date getDateExport(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEEXPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HLOrderExportCronJob.dateExport</code> attribute.
	 * @return the dateExport
	 */
	public Date getDateExport()
	{
		return getDateExport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HLOrderExportCronJob.dateExport</code> attribute. 
	 * @param value the dateExport
	 */
	public void setDateExport(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEEXPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HLOrderExportCronJob.dateExport</code> attribute. 
	 * @param value the dateExport
	 */
	public void setDateExport(final Date value)
	{
		setDateExport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HLOrderExportCronJob.exportMedia</code> attribute.
	 * @return the exportMedia
	 */
	public Collection<Media> getExportMedia(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, EXPORTMEDIA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HLOrderExportCronJob.exportMedia</code> attribute.
	 * @return the exportMedia
	 */
	public Collection<Media> getExportMedia()
	{
		return getExportMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HLOrderExportCronJob.exportMedia</code> attribute. 
	 * @param value the exportMedia
	 */
	public void setExportMedia(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, EXPORTMEDIA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HLOrderExportCronJob.exportMedia</code> attribute. 
	 * @param value the exportMedia
	 */
	public void setExportMedia(final Collection<Media> value)
	{
		setExportMedia( getSession().getSessionContext(), value );
	}
	
}
