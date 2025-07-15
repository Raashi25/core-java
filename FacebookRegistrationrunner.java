class FacebookRegistrationrunner {
    public static void main(String[] args) {
        boolean isRegistered = FacebookRegistration.registration(
            "Raashi", true, "14-07-2003", "raashi@example.com", 9876543210L
        );

        System.out.println("Facebook Registration successful: " + isRegistered);
        if (isRegistered == true) {
            FacebookRegistration.getDetails();
        }
    }
}
