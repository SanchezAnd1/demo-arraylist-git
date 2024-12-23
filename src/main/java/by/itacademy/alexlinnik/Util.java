package by.itacademy.alexlinnik;

import java.util.ArrayList;

public class Util {
    public static String cityWithMaxLength(ArrayList<String> cities) {
        int maxLength = cities.get(0).length();
        String cityWithMaxLength = cities.get(0);
        for (String city : cities) {
            if (city.length() > maxLength) {
                cityWithMaxLength = city;
                maxLength = city.length();
            }
        }
        return cityWithMaxLength;
    }

    public static String findCityWithMinLength(ArrayList<String> cities) {
        int minLength = cities.get(0).length();
        String cityMinLength = cities.get(0);
        for (String city : cities) {
            if (city.length() < minLength) {
                minLength = city.length();
                cityMinLength = city;
            }

        }
        return cityMinLength;
    }

    static public String findCityByFirstLetter(ArrayList<String> cities, char firstLetter) {
        String tempChar = "" + firstLetter;

        for (String city : cities) {
            if (city.toLowerCase().charAt(0) == tempChar.toLowerCase().charAt(0)) {
                return city;
            }
        }
        return "";
    }
}



