class GalaxyRunner {
    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.name = "Earth";
        planet.hasLife = true;

        SolarSystem solarSystem = new SolarSystem();
        solarSystem.name = "Solar System";
        solarSystem.noOfPlanets = 8;
        solarSystem.planet = planet;

        Galaxy galaxy = new Galaxy("Milky Way", "Spiral", solarSystem);
        galaxy.getGalaxyInfo();
    }
}