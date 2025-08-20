package com.xworks.amazon.user;

public class AmazonUser {


        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String dob;
        private String emailId;
        private String userName;
        private String password;
        private String confirmPassword;
        private String paymentMethod;

        public void setFirstName(String firstName){
            this.firstName=firstName;
        }
        public String getFirstName(){
            return firstName;
        }

        public void setLastName(String lastName){
            this.lastName=lastName;
        }
        public String getLastName(){
            return lastName;
        }

        public void setPhoneNumber(String phoneNumber){
            this.phoneNumber=phoneNumber;
        }
        public String getPhoneNumber(){
            return phoneNumber;
        }

        public void setDob(String dob){
            this.dob=dob;
        }
        public String getDob(){
            return dob;
        }

        public void setEmailId(String emailId){
            this.emailId=emailId;
        }
        public String getEmailId(){
            return emailId;
        }

        public void setUserName(String userName){
            this.userName=userName;
        }
        public String getUserName(){
            return userName;
        }

        public void setPassword(String password){
            this.password=password;
        }
        public String getPassword(){
            return password;
        }

        public void setConfirmPassword(String confirmPassword){
            this.confirmPassword=confirmPassword;
        }
        public String getConfirmPassword(){
            return confirmPassword;
        }

        public void setPaymentMethod(String paymentMethod){
            this.paymentMethod=paymentMethod;
        }
        public String getPaymentMethod(){
            return paymentMethod;
        }


    }

