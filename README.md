# World-Countries-And-Cities-Library
This is a simple android library which can be used to fetch all the countries and the major cities of each of these countries.
You can also fetch the 2-digit ISO country code of all the countries along with their names.
You can fetch the major cities under each of the countries by passing the 2-digit ISO country code.

<h2>Usage</h2>

Add the below line to the app level `build.gradle` file:

`implementation 'com.github.syed-zakriya:World-Countries-And-Cities-Library:1.3'`

Add the below dependency to the root level `build.gradle` file:

    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }

<h4>To get all the countries list and its 2-digit ISO country code use the below method:</h4>

`HashMap<String,String> allCountries = CountriesData.getInstance().getAllCountries();`

The cities of a country can be fetched in two ways.
<h4>1. Using country name:</h4>

`CitiesData.getInstance(context).getCitiesByCountryName("India");`

<h4>2. Using 2-digit ISO country code:</h4>

`CitiesData.getInstance(context).getCitiesByCountryCode("IN");`
        
