import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double objectMass = 100;

        Planet mercury = new Planet("Mercury", 3.303e+23, 2.4397e6);
        Planet venus = new Planet("Venus", 4.869e+24, 6.0518e6);
        Planet earth = new Planet("Earth", 5.976e+24, 6.37814e6);
        Planet mars = new Planet("Mars", 6.421e+23, 3.3972e6);
        Planet jupiter = new Planet("Jupiter", 1.9e+27, 7.1492e7);
        Planet saturn = new Planet("Saturn", 5.688e+26, 6.0268e7);
        Planet uranus = new Planet("Uranus", 8.686e+25, 2.5559e7);
        Planet neptune = new Planet("Neptune", 1.024e+26, 2.4746e7);

        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        PlanetReporter planetReporter = new PlanetReporter();

        for (Planet planet : planets) {
            planetReporter.reportGravityStatus(planet, objectMass);
        }

    }
}
