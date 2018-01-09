package com.pl10.seichiba.converter;

import com.pl10.seichiba.entity.Country;
import com.pl10.seichiba.model.CountryModel;
import org.springframework.stereotype.Component;

@Component("countryConverter")
public class CountryConverter {

    public Country countryModelToCountry(CountryModel countryModel){
        Country country = new Country();
        country.setId(countryModel.getId());
        country.setName(countryModel.getName());
        return country;
    }

    public CountryModel countryToCountryModel(Country country){
        CountryModel countryModel = new CountryModel();
        countryModel.setId(country.getId());
        countryModel.setName(country.getName());
        return countryModel;
    }
}
