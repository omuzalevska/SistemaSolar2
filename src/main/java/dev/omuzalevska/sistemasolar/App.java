package dev.omuzalevska.sistemasolar;

public class App {

        public static void main(String[] args) {
    
        Planet planet1 = new Planet("Jupiter", 79, 1.898E27, 1.43E6, 139820, 778, PlanetType.GASEOUS, true, 11.86, 0.41);
        Planet planet2 = new Planet("Mars", 2, 0.64171E12, 163.18E11, 6779, 227, PlanetType.TERRESTRIAL, true,  1.88, 1.03);

        System.out.println("Planet 1:\n" + planet1.getPlanetInfo());
        System.out.println("Density: " + planet1.calculateDensity() + " kg/km");
        System.out.println("Is it an outer planet? " + (planet1.isOuterPlanet() ? "Yes" : "No"));
        System.out.println("Orbital Period (years): " + planet1.getOrbitalPeriod());
        System.out.println("Rotation Period (days): " + planet1.getRotationPeriod()); 
        System.out.println();

        System.out.println("Planet 2:\n" + planet2.getPlanetInfo());
        System.out.println("Density: " + planet2.calculateDensity() + " kg/km");
        System.out.println("Is it an outer planet? " + (planet2.isOuterPlanet() ? "Yes" : "No"));
        System.out.println("Orbital Period (years): " + planet2.getOrbitalPeriod());
        System.out.println("Rotation Period (days): " + planet2.getRotationPeriod()); 
    }
}
