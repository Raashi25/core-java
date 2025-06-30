class j {

    static String theatreName = "PVR";
    static String location = "Fiza Mall Mangalore";
    static String city = "Mangalore";
    static String state = "Karnataka";
    static String screenType = "IMAX 3D";
    static String soundSystem = "Dolby Atmos";
    static String seatingType = "Recliner & Sofa";
    static String currentMovie = "RRR - Reloaded";
    static String nextMovie = "Daskath";
    static String showTiming = "6:30 PM";
    static String snackOptions = "Popcorn, Nachos, Cold Drinks,Burger etc";

    static int numberOfScreens = 5;
    static int totalSeats = 620;
    static int vipSeats = 60;
    static int staffCount = 25;
    static int fireExits = 8;
    static int ticketCounters = 8;
    static int parkingSpots = 100;
    static int establishedYear = 2015;

    static double averageTicketPrice = 275.50;

    public static void main(String[] args) {

        System.out.println("=== Theatre Information ===");

        System.out.println("Theatre Name: " + theatreName);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Screen Type: " + screenType);
        System.out.println("Sound System: " + soundSystem);
        System.out.println("Seating Type: " + seatingType);
        System.out.println("Now Showing: " + currentMovie);
        System.out.println("Coming Soon: " + nextMovie);
        System.out.println("Show Timing: " + showTiming);
        System.out.println("Snacks Available: " + snackOptions);

        System.out.println("Number of Screens: " + numberOfScreens);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("VIP Seats: " + vipSeats);
        System.out.println("Staff Count: " + staffCount);
        System.out.println("Fire Exits: " + fireExits);
        System.out.println("Ticket Counters: " + ticketCounters);
        System.out.println("Parking Spots: " + parkingSpots);
        System.out.println("Established Year: " + establishedYear);

        System.out.println("Average Ticket Price: ₹" + averageTicketPrice);
    }
}