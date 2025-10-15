package com.example.listycitylab6v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
* This class holds the City objects
* */
public class CityList {

    private List<City> cities = new ArrayList<>();


    /**
     * Adds a city to the list if the city does not already exist in it
     * @param city:
     *      this is a candidate city to add
     *
     * @exception IllegalArgumentException: if the city already exists within the list
     * */
    public void add(City city) {

        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }

        cities.add(city);
    }

    /**
     * Returns a sorted list of cities
     * @return returns a sorted list
     * */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Check if a city is present in the list. If it does then remove it from the list
     * @throws IllegalArgumentException: if city not in list
     * @return int: length of city list
     * */
    public int hasCity(City city) {

        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }

        cities.remove(city);

        return cities.toArray().length;
    }
}
