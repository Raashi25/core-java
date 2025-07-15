class NetflixRegistration {
    static String fullName;
    static boolean isIndian;
    static String dob;
    static String email;
    static long mobileNumber;

    public static boolean registration(String gName, boolean gIndian, String gDob, String gEmail, long gMobile) {
        boolean isRegistrationValid = false;

        boolean isValidated = NetflixRegistrationValidator.validateUser(gName, gIndian, gDob, gEmail, gMobile);
        if (isValidated == true) {
            isRegistrationValid = true;
        } else {
            System.out.println("Try again later.");
        }

        return isRegistrationValid;
    }

    public static void getDetails() {
        fullName = NetflixRegistrationValidator.fullName;
        isIndian = NetflixRegistrationValidator.isIndian;
        dob = NetflixRegistrationValidator.dob;
        email = NetflixRegistrationValidator.email;
        mobileNumber = NetflixRegistrationValidator.mobileNumber;

        System.out.println("Full Name      : " + fullName);
        System.out.println("Indian Resident: " + isIndian);
        System.out.println("Date of Birth  : " + dob);
        System.out.println("Email          : " + email);
        System.out.println("Mobile Number  : " + mobileNumber);
    }
}


class NetflixRegistrationValidator {
    static String fullName;
    static boolean isIndian;
    static String dob;
    static String email;
    static long mobileNumber;

    public static boolean validateUser(String gName, boolean gIndian, String gDob, String gEmail, long gMobile) {
        boolean isNameValid = false;
        boolean isIndianValid = false;
        boolean isDobValid = false;
        boolean isEmailValid = false;
        boolean isMobileValid = false;
        boolean isUserValidated = false;

        if (gName != null) {
            fullName = gName;
            isNameValid = true;
        } else {
            System.out.println("Please provide a valid name.");
        }

        if (gIndian == true) {
            isIndian = gIndian;
            isIndianValid = true;
        } else {
            System.out.println("Only Indian residents can register.");
        }

        if (gDob != null) {
            dob = gDob;
            isDobValid = true;
        } else {
            System.out.println("Please provide a valid date of birth.");
        }

        if (gEmail != null && gEmail.contains("@")) {
            email = gEmail;
            isEmailValid = true;
        } else {
            System.out.println("Please provide a valid email.");
        }

        if (gMobile != 0) {
            mobileNumber = gMobile;
            isMobileValid = true;
        } else {
            System.out.println("Please provide a valid mobile number.");
        }

        if (isNameValid && isIndianValid && isDobValid && isEmailValid && isMobileValid) {
            isUserValidated = true;
        } else {
            System.out.println("Registration failed.");
        }

        return isUserValidated;
    }
}
