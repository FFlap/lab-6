package com.example.listycity;

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
}
