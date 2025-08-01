class Galaxy {
    String galaxyName;
    String type;
    SolarSystem solarSystem;

    Galaxy(String galaxyName, String type, SolarSystem solarSystem) {
        this.galaxyName = galaxyName;
        this.type = type;
        this.solarSystem = solarSystem;
    }

    void getGalaxyInfo() {
        System.out.println("Galaxy Name: " + galaxyName);
        System.out.println("Galaxy Type: " + type);
        solarSystem.getSolarSystemInfo();
    }
}

