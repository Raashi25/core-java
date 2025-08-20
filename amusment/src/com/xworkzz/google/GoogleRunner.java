package com.xworkzz.google;

import com.xworkzz.google.account.GoogleAccount;
import com.xworkzz.google.user.GoogleUser;

public class GoogleRunner {
    public static void main(String[] args) {

        // Create Google user
        GoogleUser googleUser = new GoogleUser();
        googleUser.setFirstName("Raashi");
        googleUser.setLastName("Lingaraj");
        googleUser.setDob("25-10-2004");
        googleUser.setEmail("raashihl25@gmail.com");
        googleUser.setEmailVerified(true);
        googleUser.setUsername("raashi321");
        googleUser.setPassword("Raashi@321");
        googleUser.setPhoneNumber("8884141141");
        googleUser.setRecoveryEmail("recovery.email@gmail.com");
        googleUser.setProfilePhotoUrl("https://example.com/profile-photo.jpg");

        // Create account service
        GoogleAccount googleService = new GoogleAccount();
        boolean created = googleService.createGoogleUser(googleUser);


        // Print user details

        // Print account creation status
        if (created) {
            System.out.println("Google account created successfully!");
        } else {
            System.out.println("Google account creation failed!");
        }
       googleUser.displayInfo();
    }
}