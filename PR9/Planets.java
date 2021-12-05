import java.awt.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Planets {
    private static void print(List<String> planets, String text){
        System.out.print(text);
        System.out.println(planets);
    }

    private static void add(List<String> planets, String planet){
        planets.add(planet);
    }

    private static void remove(List<String> planets, String planet) {
        while (planets.contains(planet))
            planets.remove(planet);
    }

    private static void edit(List<String> planets, String planet, String newPlanet){
        if (planets.contains(planet))
            planets.set(planets.indexOf(planet), newPlanet);
    }

    private static void shuffle(List<String> planets) {
        Collections.shuffle(planets);
    }

    private static String getRandom(List<String> planets) {
        Random rand = new Random();
        return planets.get(rand.nextInt(planets.size()));
    }

    private static Integer getIndex(List<String> planets, String planet) {
        return planets.indexOf(planet);
    }

    private static boolean checkExist(List<String> planets, String planet){
        return planets.contains(planet);
    }

    // --- From Docs

    // --- Moving of all elements
    private static void rotate(List<String> planets, int distance){
        Collections.rotate(planets, distance);
    }

    // --- Swapping of planets by indexes
    private static void swap(List<String> planets, int i, int j){
        Collections.swap(planets, i, j);
    }

    // --- Main

    public static void main(String[] args) {
        String Mercury = new String("Меркурий");
        String Venus = new String("Венера");
        String Earth = new String("Земля");
        String Mars = new String("Марс");

        String Ceres = new String("Церера");

        String Jupiter = new String("Юпитер");
        String Saturn = new String("Сатурн");
        String Uranus = new String("Уран");
        String Neptune = new String("Нептун");
        String Pluto = new String("Плутон");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(Mercury, Venus, Earth, Mars));
        List<String> solarSystemUnmodif = List.of(Jupiter, Saturn, Uranus, Neptune, Pluto);

        print(solarSystem, "Solar system: ");
        print(solarSystemUnmodif, "Unmodif. list: ");

        add(solarSystem, Ceres);
        print(solarSystem, "\nAdded Ceres: ");

        remove(solarSystem, Ceres);
        print(solarSystem, "And then removed: ");

        edit(solarSystem, Mars, Ceres);
        print(solarSystem, "\nEdited Mars to Ceres: ");

        shuffle(solarSystem);
        print(solarSystem, "Messed all up: ");

        System.out.println("\nRandom planets:");
        System.out.print(getRandom(solarSystem) + "; ");
        System.out.print(getRandom(solarSystem) + "; ");
        System.out.println(getRandom(solarSystemUnmodif) + ".\n");

        System.out.println("Let's check that Earth exists in list: ");
        System.out.println((checkExist(solarSystem, Earth)) ? "Exists" : "Doesn't exist");

        if(checkExist(solarSystem, Earth)) {
            System.out.print("Next, let's get index of Earth:\nit's on place #");
            System.out.println(getIndex(solarSystem, Earth));
            print(solarSystem, "In: ");
        }

        print(solarSystem, "\nRotate this list by 2 to right: ");
        rotate(solarSystem, 2);
        print(solarSystem, "It is: ");

        swap(solarSystem, 0, solarSystem.size() - 1);
        print(solarSystem, "\nAnd now swap 1st and last planets: ");
    }
}
