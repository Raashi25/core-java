class Apartment {

    static String apartmentName = "Palm Grove Heights";
    static String location = "Electronic City";
    static String city = "Bangalore";
    static String state = "Karnataka";
    static String developer = "Prestige Group";
    static String apartmentType = "3 BHK";
    static String flooring = "Vitrified Tiles";
    static String paintType = "Asian Paints Royale";
    static String liftBrand = "Otis";
    static String securitySystem = "CCTV & Smart Lock";
    static String amenities = "Pool, Gym, Garden";

    static int blocks = 8;
    static int floorsPerBlock = 12;
    static int totalFlats = 320;
    static int elevators = 16;
    static int parkingSlots = 340;
    static int guards = 12;-*
    static int clubHouses = 2;
    static int builtYear = 2020;

    static double maintenancePerMonth = 2850.50;

    public static void main(String[] args) {
        System.out.println("Apartment: " + apartmentName);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Developer: " + developer);
        System.out.println("Type: " + apartmentType);
        System.out.println("Flooring: " + flooring);
        System.out.println("Paint: " + paintType);
        System.out.println("Lift: " + liftBrand);
        System.out.println("Security: " + securitySystem);
        System.out.println("Amenities: " + amenities);
        System.out.println("Blocks: " + blocks);
        System.out.println("Floors: " + floorsPerBlock);
        System.out.println("Flats: " + totalFlats);
        System.out.println("Elevators: " + elevators);
        System.out.println("Parking: " + parkingSlots);
        System.out.println("Guards: " + guards);
        System.out.println("Club Houses: " + clubHouses);
        System.out.println("Year: " + builtYear);
        System.out.println("Maintenance: ₹" + maintenancePerMonth);
    }
}