class SolarSystem {
    String name;
    int noOfPlanets;
    Planet planet;

    void getSolarSystemInfo() {
        System.out.println("Solar System Name: " + name);
        System.out.println("Number of Planets: " + noOfPlanets);
        planet.getPlanetInfo();
    }
}
