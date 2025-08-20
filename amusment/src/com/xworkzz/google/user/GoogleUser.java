package com.xworkzz.google.user;

public class GoogleUser {


        private String firstName;
        private String lastName;
        private String dob;
        private String email;
        private boolean emailVerified;
        private String username;
        private String password;
        private String phoneNumber;
        private String recoveryEmail;
        private String profilePhotoUrl;

        // First Name
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getFirstName() {
            return firstName;
        }

        // Last Name
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getLastName() {
            return lastName;
        }

        // Date of Birth
        public void setDob(String dob) {
            this.dob = dob;
        }
        public String getDob() {
            return dob;
        }

        // Email
        public void setEmail(String email) {
            this.email = email;
        }
        public String getEmail() {
            return email;
        }

        // Email Verified
        public void setEmailVerified(boolean emailVerified) {
            this.emailVerified = emailVerified;
        }
        public boolean isEmailVerified() {
            return emailVerified;
        }

        // Username
        public void setUsername(String username) {
            this.username = username;
        }
        public String getUsername() {
            return username;
        }

        // Password
        public void setPassword(String password) {
            this.password = password;
        }
        public String getPassword() {
            return password;
        }

        // Phone Number
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }

        // Recovery Email
        public void setRecoveryEmail(String recoveryEmail) {
            this.recoveryEmail = recoveryEmail;
        }
        public String getRecoveryEmail() {
            return recoveryEmail;
        }

        // Profile Photo URL
        public void setProfilePhotoUrl(String profilePhotoUrl) {
            this.profilePhotoUrl = profilePhotoUrl;
        }
        public String getProfilePhotoUrl() {
            return profilePhotoUrl;
        }
    }

