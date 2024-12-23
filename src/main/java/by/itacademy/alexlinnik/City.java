package by.itacademy.alexlinnik;

import java.util.ArrayList;

public class City {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Moscow");
        city.add("Minsk");
        city.add("Brest");
        city.add("New York");
        city.add("Grodno");
        System.out.println(city);
        city.set(3, "Piter");
        int maxLength = city.get(0).length();
        String cityWithMaxLength = city.get(0);
        for (String cities : city) {
            if (cities.length() > maxLength) {
                cityWithMaxLength = cities;
                maxLength = cities.length();
            }
        }
        System.out.println(cityWithMaxLength);
    }
}
