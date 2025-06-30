class Satellite {

    static String satelliteName = "INSAT-3DR";
    static String country = "India";
    static String agency = "ISRO";
    static String launchVehicle = "GSLV-F05";
    static String launchSite = "Sriharikota";
    static String missionType = "Weather Observation";
    static String orbitType = "Geostationary";
    static String communicationBand = "C-band, S-band";
    static String builtBy = "ISRO Satellite Centre";
    static String fuelType = "Mono-propellant";
    static String controlCenter = "Master Control Facility, Hassan";

    static int missionDurationYears = 10;
    static int solarPanels = 2;
    static int transponders = 8;
    static int sensors = 5;
    static int launchYear = 2016;
    static int altitudeKm = 36000;
    static int powerWatts = 1200;
    static int trackingAntennas = 3;

    static double satelliteMassKg = 2211.0;

    public static void main(String[] args) {
        System.out.println("Satellite: " + satelliteName);
        System.out.println("Country: " + country);
        System.out.println("Agency: " + agency);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Mission: " + missionType);
        System.out.println("Orbit: " + orbitType);
        System.out.println("Band: " + communicationBand);
        System.out.println("Built By: " + builtBy);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Control: " + controlCenter);
        System.out.println("Duration: " + missionDurationYears);
        System.out.println("Solar Panels: " + solarPanels);
        System.out.println("Transponders: " + transponders);
        System.out.println("Sensors: " + sensors);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Altitude: " + altitudeKm);
        System.out.println("Power: " + powerWatts);
        System.out.println("Antennas: " + trackingAntennas);
        System.out.println("Mass: " + satelliteMassKg + " kg");
    }
}