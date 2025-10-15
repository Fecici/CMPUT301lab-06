package com.example.listycitylab6v2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;


public class CityListTest {

    private CityList mockCityList() {
        CityList citylist = new CityList();
        citylist.add(mockCity());
        return citylist;
    }

    private City mockCity(){
        return new City("Ed", "Ab");
    }

    @Test
    public void testAdd(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    public void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    public void testGetCities() {
        CityList citylist = mockCityList();

        assertEquals(0, mockCity().compareTo(citylist.getCities().get(0)));
        City city = new City("Char", "PEI");
        citylist.add(city);
        assertEquals(0, city.compareTo(citylist.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(citylist.getCities().get(1)));
    }

    @Test
    public void testHasCity() {
        CityList citylist = mockCityList();
        City city = new City("EDMONTONTONTONT", "ab");

        citylist.add(city);
        citylist.hasCity(city);
        assertEquals(1, citylist.getCities().size());
    }

    @Test
    public void testHasCityException() {
        CityList cityList = mockCityList();
        City city = new City("Test", "dummy");

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.hasCity(city);
        });
    }
}
