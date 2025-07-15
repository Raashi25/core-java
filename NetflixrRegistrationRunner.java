class NetflixRegistrationRunner {
    public static void main(String[] args) {
        boolean isRegistered = NetflixRegistration.registration("Chethan", true, "17-08-2003", "chethan@example.com", 9876543210L);
        System.out.println("Netflix Registration successful: " + isRegistered);
        if (isRegistered == true) {
            NetflixRegistration.getDetails();
        }
    }
}
