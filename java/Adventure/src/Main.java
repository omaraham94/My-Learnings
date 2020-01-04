import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 100);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        temp = new HeavenlyBody("Venus", 200);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        temp = new HeavenlyBody("Earth", 300);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        temp = new HeavenlyBody("Mars", 400);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        temp = new HeavenlyBody("Jupiter", 500);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        temp = new HeavenlyBody("Saturn", 600);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        temp = new HeavenlyBody("Uranus", 700);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        temp = new HeavenlyBody("Neptune", 800);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        temp = new HeavenlyBody("Pluto", 900);
        planets.add(temp);
        solarSystem.put(temp.getName(), temp);

        System.out.println("Planets are");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

    }
}
