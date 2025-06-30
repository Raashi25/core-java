class ShoppingMall {

    static String mallName = "City Center";
    static String location = "Hamankatte";
    static String city = "Mangalore";
    static String state = "Karnataka";
    static String developer = "Infinity Developers";
    static String architect = "DLR Group";
    static String parkingType = "Basement + Multi-level";
    static String foodCourt = "Yes";
    static String anchorStores = "Zara, H&M, Reliance";
    static String movieTheatre = "Inox";
    static String musicPlayed = "Pop & Ambient";

    static int floors = 5;
    static int totalShops = 220;
    static int escalators = 18;
    static int elevators = 12;
    static int parkingSpots = 1500;
    static int securityStaff = 45;
    static int restrooms = 30;
    static int establishedYear = 2016;

    static double maintenanceCostPerMonth = 250000.75;

    public static void main(String[] args) {
        System.out.println("Mall: " + mallName);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Developer: " + developer);
        System.out.println("Architect: " + architect);
        System.out.println("Parking: " + parkingType);
        System.out.println("Food Court: " + foodCourt);
        System.out.println("Anchor Stores: " + anchorStores);
        System.out.println("Theatre: " + movieTheatre);
        System.out.println("Music: " + musicPlayed);
        System.out.println("Floors: " + floors);
        System.out.println("Shops: " + totalShops);
        System.out.println("Escalators: " + escalators);
        System.out.println("Elevators: " + elevators);
        System.out.println("Parking Spots: " + parkingSpots);
        System.out.println("Security: " + securityStaff);
        System.out.println("Restrooms: " + restrooms);
        System.out.println("Year: " + establishedYear);
        System.out.println("Maintenance: ₹" + maintenanceCostPerMonth);
    }
}