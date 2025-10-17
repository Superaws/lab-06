package com.example.listycity;

/**
 * This is a class that defines a city
 * @author Ronan St. Amand
 * @see CityList
 * @version 1.0
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * This is a constructor for the City class
     * @param city
     * This is the name of the city being created
     * @param province
     * This is the name of the city's province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the City's name
     * @return
     * Return the City's name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * This returns the Province name
     * @return
     * Return the Province name
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * This sets the city name
     * @param city
     * The new name to set the City's name as
     */
    public void setCityName(String city) {
        this.city = city;
    }

    /**
     * This sets the province name
     * @param province
     * The new name to set the province name as
     */
    public void setProvinceName(String province) {
        this.province = province;
    }

    /**
     * This returns the result of comparing city's name with the param name
     * @param o
     * the object to be compared.
     * @return
     * The result of comparing city's name with the param name
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}