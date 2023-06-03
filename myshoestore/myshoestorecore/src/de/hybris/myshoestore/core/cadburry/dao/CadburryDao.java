package de.hybris.myshoestore.core.cadburry.dao;

import de.hybris.myshoestore.core.model.CadburryModel;

import java.util.List;

public interface CadburryDao
{
    public List<CadburryModel> getCadburryDetails();
    public void postCadburryDetails(CadburryModel cadburryModel);
    public List<CadburryModel> getSpecificCadburryDetails(final String products);
    public void updateProduct(final String products,final double price);
    public void removeProduct(List<CadburryModel> cadburry);

    
}
