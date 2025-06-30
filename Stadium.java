class Stadium {

    static String stadiumName = "National Arena";
    static String location = "Mumbai";
    static String city = "Mumbai";
    static String state = "Maharashtra";
    static String surfaceType = "Grass";
    static String roofType = "Retractable";
    static String teamHome = "Mumbai FC";
    static String architect = "SOM Associates";
    static String openingDate = "2001";
    static String eventsHosted = "Football, Cricket";
    static String broadcastPartner = "Star Sports";

    static int seatingCapacity = 65000;
    static int numberOfGates = 20;
    static int vipBoxes = 50;
    static int restrooms = 100;
    static int parkingSpots = 5000;
    static int securityCameras = 200;
    static int foodStalls = 80;
    static int establishedYear = 2001;

    static double ticketPrice = 799.99;

    public static void main(String[] args) {
        System.out.println("Stadium Name: " + stadiumName);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Surface: " + surfaceType);
        System.out.println("Roof: " + roofType);
        System.out.println("Team: " + teamHome);
        System.out.println("Architect: " + architect);
        System.out.println("Opening: " + openingDate);
        System.out.println("Events: " + eventsHosted);
        System.out.println("Broadcast: " + broadcastPartner);
        System.out.println("Seats: " + seatingCapacity);
        System.out.println("Gates: " + numberOfGates);
        System.out.println("VIP Boxes: " + vipBoxes);
        System.out.println("Restrooms: " + restrooms);
        System.out.println("Parking: " + parkingSpots);
        System.out.println("Cameras: " + securityCameras);
        System.out.println("Stalls: " + foodStalls);
        System.out.println("Year: " + establishedYear);
        System.out.println("Ticket Price: ₹" + ticketPrice);
    }
}