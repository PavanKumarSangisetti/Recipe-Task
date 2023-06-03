package de.hybris.myshoestore.core.cadburry.service;

import de.hybris.myshoestore.core.model.CadburryModel;

import java.util.List;

public interface cadburryService
{
    public List<CadburryModel> getCadburryDetails();
    public void postCadburryDetails(CadburryModel cadburryModel);

    public List<CadburryModel> getSpecificCadburrydetails(final String products);
    public void updateProduct(final String products,final Double price);

    public void removeProduct(final String products);



}
