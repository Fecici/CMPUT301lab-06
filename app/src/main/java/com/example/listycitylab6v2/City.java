package com.example.listycitylab6v2;


/**
 * This class represents the city object
 * */
public class City implements Comparable {

    private String city;
    private String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Compares cities based on city name field
     * @return -1 if the if this.city is less than its comparison
     * */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCity());
    }
}
