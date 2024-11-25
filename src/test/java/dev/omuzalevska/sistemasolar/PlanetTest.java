package dev.omuzalevska.sistemasolar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PlanetTest {

    @Test
    void testPlanetConstructorAndGetters() {
        Planet planet = new Planet(
                "Earth", 1, 5.972E24, 1.08321E12, 12742, 149, PlanetType.TERRESTRIAL, true, 1.0, 1.0);

        assertEquals("Earth", planet.getName());
        assertEquals(1, planet.getNumberOfMoons());
        assertEquals(5.972E24, planet.getMass());
        assertEquals(1.08321E12, planet.getVolume());
        assertEquals(12742, planet.getDiameter());
        assertEquals(149, planet.getDistanceFromSun());
        assertEquals(PlanetType.TERRESTRIAL, planet.getPlanetType());
        assertTrue(planet.isVisibleFromEarth());
        assertEquals(1.0, planet.getOrbitalPeriod());
        assertEquals(1.0, planet.getRotationPeriod());
    }

    @Test
    void testCalculateDensity() {
        Planet planet = new Planet("Earth", 1, 5.972E24, 1.08321E12, 12742, 149, PlanetType.TERRESTRIAL, true, 1.0, 1.0);
        double expectedDensity = 5.972E24 / 1.08321E12;
        assertEquals(expectedDensity, planet.calculateDensity(), 1E-5);
    }

    @Test
    void testIsOuterPlanet() {
        
        Planet mars = new Planet("Mars", 2, 6.4171E23, 1.6318E11, 6779, 227, PlanetType.TERRESTRIAL, true, 1.88, 1.03);
        assertThat("Mars should not be an outer planet", mars.isOuterPlanet(), is(false));
    }

    @Test
    void testSetters() {
        Planet planet = new Planet(
                "Venus", 0, 4.867E24, 9.2843E11, 12104, 108, PlanetType.TERRESTRIAL, true, 0.62, 243.0);

        planet.setName("Mercury");
        planet.setNumberOfMoons(0);
        planet.setMass(3.285E23);
        planet.setVolume(6.083E10);
        planet.setDiameter(4879);
        planet.setDistanceFromSun(58);
        planet.setPlanetType(PlanetType.TERRESTRIAL);
        planet.setVisibleFromEarth(true);
        planet.setOrbitalPeriod(0.24);
        planet.setRotationPeriod(58.6);

        assertEquals("Mercury", planet.getName());
        assertEquals(0, planet.getNumberOfMoons());
        assertEquals(3.285E23, planet.getMass());
        assertEquals(6.083E10, planet.getVolume());
        assertEquals(4879, planet.getDiameter());
        assertEquals(58, planet.getDistanceFromSun());
        assertEquals(PlanetType.TERRESTRIAL, planet.getPlanetType());
        assertTrue(planet.isVisibleFromEarth());
        assertEquals(0.24, planet.getOrbitalPeriod());
        assertEquals(58.6, planet.getRotationPeriod());
    }

    @Test
    void testGetPlanetInfo() {
        Planet earth = new Planet(
                "Earth", 1, 5.972E24, 1.08321E12, 12742, 149, PlanetType.TERRESTRIAL, true, 1.0, 1.0);

        String info = earth.getPlanetInfo();
        assertTrue(info.contains("Name: Earth"));
        assertTrue(info.contains("Number of moons: 1"));
        assertTrue(info.contains("Mass (kg): 5.972E24"));
        assertTrue(info.contains("Volume (km): 1.08321E12"));
        assertTrue(info.contains("Diameter (km): 12742"));
        assertTrue(info.contains("Distance from the Sun (million km): 149"));
        assertTrue(info.contains("Planet type: TERRESTRIAL"));
        assertTrue(info.contains("Visible from Earth: Yes"));
        assertTrue(info.contains("Orbital Period (years): 1.0"));
        assertTrue(info.contains("Rotation Period (days): 1.0"));
    }
}
