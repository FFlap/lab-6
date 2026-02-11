package com.example.listycity;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExampleUnitTest {
    @Test
    public void add_addsCityToList() {
        CityList cityList = new CityList();
        City edmonton = new City("Edmonton", "Alberta");

        cityList.add(edmonton);

        List<City> cities = cityList.getCities();
        assertEquals(1, cities.size());
        assertEquals("Edmonton", cities.get(0).getCityName());
        assertEquals("Alberta", cities.get(0).getProvinceName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_sameCityObjectThrowsException() {
        CityList cityList = new CityList();
        City calgary = new City("Calgary", "Alberta");

        cityList.add(calgary);
        cityList.add(calgary);
    }

    @Test
    public void getCities_returnsCitiesSortedByName() {
        CityList cityList = new CityList();
        cityList.add(new City("Vancouver", "British Columbia"));
        cityList.add(new City("Calgary", "Alberta"));
        cityList.add(new City("Edmonton", "Alberta"));

        List<City> cities = cityList.getCities();

        assertEquals("Calgary", cities.get(0).getCityName());
        assertEquals("Edmonton", cities.get(1).getCityName());
        assertEquals("Vancouver", cities.get(2).getCityName());
        assertTrue(cities.size() == 3);
    }
}
