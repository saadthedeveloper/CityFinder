package com.mycompany.cityfinder;
import java.util.Scanner;

public class CityFinder {

    public static void main(String[] args) {
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"};
        String input;
        int n = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a city name located in USA: ");
        input = keyboard.nextLine();
        
       
        while (n < cities.length && !input.equalsIgnoreCase(cities[n])) {
            n++;
        }

        if (n < cities.length) {
            System.out.println("City found!");
        } else {
            System.out.println("City not found");
        }
    }
}
