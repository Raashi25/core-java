package com.xworkzz.google.account;

import com.xworkzz.google.user.GoogleUser;

public class GoogleAccount {
    public boolean createGoogleUser(GoogleUser googleUser) {

        boolean googleUserCreated =false;
        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean dobValid = false;
        boolean emailValid = false;
        boolean emailVerifiedValid = false;
        boolean usernameValid = false;
        boolean passwordValid = false;
        boolean phoneValid = false;
        boolean recoveryEmailValid = false;

        if (googleUser.getFirstName() != null) {
            firstNameValid = true;
        } else {
            System.out.println("Invalid first name");
        }

        if (googleUser.getLastName() != null) {
            lastNameValid = true;
        } else {
            System.out.println("Invalid last name");
        }

        if (googleUser.getDob() != null) {
            dobValid = true;
        } else {
            System.out.println("Invalid date of birth");
        }

        if (googleUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("Invalid email");
        }

        if (googleUser.isEmailVerified()) {
            emailVerifiedValid = true;
        } else {
            System.out.println("Email not verified");
        }

        if (googleUser.getUsername() != null) {
            usernameValid = true;
        } else {
            System.out.println("Invalid username");
        }

        if (googleUser.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("Invalid password");
        }

        if (googleUser.getPhoneNumber() != null) {
            phoneValid = true;
        } else {
            System.out.println("Invalid phone number");
        }

        if (googleUser.getRecoveryEmail() != null) {
            recoveryEmailValid = true;
        } else {
            System.out.println("Invalid recovery email");
        }

        if (firstNameValid && lastNameValid && dobValid && emailValid && emailVerifiedValid &&
                usernameValid && passwordValid && phoneValid && recoveryEmailValid) {
            googleUserCreated = true;
        } else {
            System.out.println("Invalid credentials for Google account creation");
        }

        return googleUserCreated;



    }
    public void displayInfo() {
        GoogleUser googleUser;
        System.out.println("First Name: " + googleUser.getFirstName());
        System.out.println("Last Name: " + googleUser.getLastName());
        System.out.println("Date of Birth: " + googleUser.getDob());
        System.out.println("Email: " + googleUser.getEmail());
        System.out.println("Email Verified: " + googleUser.isEmailVerified());
        System.out.println("Username: " + googleUser.getUsername());
        System.out.println("Password: " + googleUser.getPassword());
        System.out.println("Phone Number: " + googleUser.getPhoneNumber());
        System.out.println("Recovery Email: " + googleUser.getRecoveryEmail());
        System.out.println("Profile Photo URL: " + googleUser.getProfilePhotoUrl());
    }
}



