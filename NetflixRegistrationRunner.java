class NetflixRegistrationRunner {
    public static void main(String[] args) {
        boolean isRegistered = NetflixRegistration.registration("raashi", true, "25-10-2004", "raashi@example.com", 8310597947L);
        System.out.println("Netflix Registration successful: " + isRegistered);
        if (isRegistered == true) {
            NetflixRegistration.getDetails();
        }
    }
}
