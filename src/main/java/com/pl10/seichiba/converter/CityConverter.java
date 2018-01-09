package com.pl10.seichiba.converter;

import com.pl10.seichiba.entity.City;
import com.pl10.seichiba.model.CityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cityConverter")
public class CityConverter {

    @Autowired
    @Qualifier("countryConverter")
    private CountryConverter countryConverter;

    public City cityModelToCity(CityModel cityModel){
        City city = new City();
        city.setCountry(countryConverter.countryModelToCountry(cityModel.getCountryModel()));
        city.setId(cityModel.getId());
        city.setName(cityModel.getName());
        return city;
    }

    public CityModel cityToCityModel(City city){
        CityModel cityModel = new CityModel();
        cityModel.setCountryModel(countryConverter.countryToCountryModel(city.getCountry()));
        cityModel.setId(cityModel.getId());
        cityModel.setName(cityModel.getName());
        return cityModel;
    }
}
