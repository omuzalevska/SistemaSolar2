package dev.omuzalevska.sistemasolar;

public class Planet {
   
    private String name = "";
    private int numberOfMoons = 0;
    private double mass = 0.0;
    private double volume = 0.0;
    private int diameter = 0;
    private int distanceFromSun = 0; // in millions of kilometers
    private PlanetType planetType;   // GASEOUS, TERRESTRIAL, DWARF
    private boolean visibleFromEarth = false;
    private double orbitalPeriod = 0.0; // in years
    private double rotationPeriod = 0.0;// in days

    public Planet(String name, int numberOfMoons, double mass, double volume, int diameter,
               int distanceFromSun, PlanetType planetType, boolean visibleFromEarth, 
               double orbitalPeriod, double rotationPeriod) {
    this.name = name;
    this.numberOfMoons = numberOfMoons;
    this.mass = mass;
    this.volume = volume;
    this.diameter = diameter;
    this.distanceFromSun = distanceFromSun;
    this.planetType = planetType;
    this.visibleFromEarth = visibleFromEarth;
    this.orbitalPeriod = orbitalPeriod;
    this.rotationPeriod = rotationPeriod;
    }


    public String getPlanetInfo() {
        return "Name: " + name +
               "\nNumber of moons: " + numberOfMoons +
               "\nMass (kg): " + mass +
               "\nVolume (km): " + volume +
               "\nDiameter (km): " + diameter +
               "\nDistance from the Sun (million km): " + distanceFromSun +
               "\nPlanet type: " + planetType +
               "\nVisible from Earth: " + (visibleFromEarth ? "Yes" : "No")+
               "\nOrbital Period (years): " + orbitalPeriod +
               "\nRotation Period (days): " + rotationPeriod;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(double rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public double calculateDensity() {
        if (volume != 0) {
            return mass / volume;
        } else {
            return 0; 
        }
    }
  
    public boolean isOuterPlanet() {
        // between 2.1 and 3.4 AU
        double distanceInKm = distanceFromSun * 149597870; // Convert millions kilometers to kilometers
        return distanceInKm > 2.1 * 149597870000.0 && distanceInKm < 3.4 * 149597870000.0;
    }


    public String getName() {
        return name;
    }


    public int getNumberOfMoons() {
        return numberOfMoons;
    }


    public double getMass() {
        return mass;
    }


    public double getVolume() {
        return volume;
    }


    public int getDiameter() {
        return diameter;
    }


    public int getDistanceFromSun() {
        return distanceFromSun;
    }


    public PlanetType getPlanetType() {
        return planetType;
    }


    public boolean isVisibleFromEarth() {
        return visibleFromEarth;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }


    public void setMass(double mass) {
        this.mass = mass;
    }


    public void setVolume(double volume) {
        this.volume = volume;
    }


    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }


    public void setDistanceFromSun(int distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }


    public void setPlanetType(PlanetType planetType) {
        this.planetType = planetType;
    }


    public void setVisibleFromEarth(boolean visibleFromEarth) {
        this.visibleFromEarth = visibleFromEarth;
    }  
    
    

}
