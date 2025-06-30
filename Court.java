class Court {

    static String courtName = "District Civil Court";
    static String location = "Mysuru, Karnataka";
    static int courtId = 2105;
    static String courtType = "Civil";
    static String judgeName = "Justice Radhika";
    static int totalJudges = 5;
    static int totalLawyers = 25;
    static int totalClerks = 10;
    static int totalSecurityStaff = 8;
    static int totalCasesHandled = 10500;
    static int activeCases = 430;
    static int pendingCases = 250;
    static int closedCases = 9820;
    static int numberOfCourtrooms = 6;
    static boolean hasCCTV = true;
    static boolean hasDigitalFiling = true;
    static boolean hasLibrary = true;
    static int numberOfChairs = 150;
    static String registrarName = "Anita Desai";
    static String workingHours = "10 AM to 5 PM";

    public static void main(String[] args) {
        System.out.println("Court Name: " + courtName);
        System.out.println("Location: " + location);
        System.out.println("Court ID: " + courtId);
        System.out.println("Court Type: " + courtType);
        System.out.println("Judge Name: " + judgeName);
        System.out.println("Total Judges: " + totalJudges);
        System.out.println("Total Lawyers: " + totalLawyers);
        System.out.println("Total Clerks: " + totalClerks);
        System.out.println("Total Security Staff: " + totalSecurityStaff);
        System.out.println("Total Cases Handled: " + totalCasesHandled);
        System.out.println("Active Cases: " + activeCases);
        System.out.println("Pending Cases: " + pendingCases);
        System.out.println("Closed Cases: " + closedCases);
        System.out.println("Number of Courtrooms: " + numberOfCourtrooms);
        System.out.println("Has CCTV: " + hasCCTV);
        System.out.println("Has Digital Filing: " + hasDigitalFiling);
        System.out.println("Has Library: " + hasLibrary);
        System.out.println("Number of Chairs: " + numberOfChairs);
        System.out.println("Registrar Name: " + registrarName);
        System.out.println("Working Hours: " + workingHours);
    }
}
