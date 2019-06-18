package com.countriesandcitieslib;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CitiesData {
    private Context mContext;
    private static CitiesData mCitiesData = null;
    private CitiesData(Context context){
        this.mContext = context;
    }

    public static CitiesData getInstance(Context c){
        if(mCitiesData==null)
            mCitiesData = new CitiesData(c);

        return mCitiesData;
    }

    public List<String> getCitiesByCountryName(String countryName){
        String countryCode = CountriesData.getInstance().getCountryCode(countryName);
        return getCitiesByCountryCode(countryCode);
    }

    public List<String> getCitiesByCountryCode(String countryCode){
        Integer arr = CountriesData.getInstance().getCityArrayReference(countryCode);
        String[] citiesArray = mContext.getResources().getStringArray(arr);
        return Arrays.asList(citiesArray);
    }
}
