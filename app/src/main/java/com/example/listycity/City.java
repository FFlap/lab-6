package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    /**
     * The city name.
     */
    private String city;

    /**
     * The province name.
     */
    private String province;

    /**
     * Creates a city with a name and province.
     *
     * @param city the city name
     * @param province the province name
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     *
     * @return the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the province name.
     *
     * @return the province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares city objects by city name.
     *
     * @param other the other city
     * @return negative if this city is before other, positive if after, 0 if equal
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Compares two city objects by city and province values.
     *
     * @param obj the object to compare
     * @return true if both city and province match
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof City)) {
            return false;
        }
        City other = (City) obj;
        return Objects.equals(this.city, other.city)
                && Objects.equals(this.province, other.province);
    }

    /**
     * Returns a hash code based on city and province.
     *
     * @return hash code for this city object
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
