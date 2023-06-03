package de.hybris.myshoestore.facades.converterss;


import de.hybris.platform.commercefacades.user.data.CadburryData;

import java.util.List;

public interface CadburryFacade {
    public List<CadburryData> getCadburryDetails();
    public void postCadburryDetails(final CadburryData cadburryData);

    public List<CadburryData> getSpecificCadburryDetails(final String products);

    public void removeProduct(final String products);
    public void updateProduct(final String products,final double price);

}
