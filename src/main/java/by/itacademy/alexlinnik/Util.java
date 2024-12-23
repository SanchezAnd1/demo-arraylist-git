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
}
