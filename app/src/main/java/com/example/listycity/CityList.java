package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 * @author Ronan St. Amand
 * @see City
 * @version 1.0
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns if cities contains a given city
     * @param city
     * This is the city to check for
     * @return
     * Return if cities contains the city
     */
    public boolean hasCity(City city) {
        return this.cities.contains(city);
    }

    /**
     * This removes a city from cities if it contains the city, otherwise throws a RuntimeException
     * @param city
     */
    public void delete(City city) {
        if (!hasCity(city)) throw new RuntimeException("City not found");
        this.cities.remove(city);
    }

    /**
     * This returns the amount of cities in cities
     * @return
     * Return the amount of cities
     */
    public int countCities() {
        return this.cities.size();
    }
}
