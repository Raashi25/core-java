package com.xworks.amazon.account;

import com.xworks.amazon.user.AmazonUser;


    public class AmazonAccount {
        AmazonUser amazonUser;

        public  boolean createAmazonUser(AmazonUser amazonUser){

            boolean AmazonUserCreated=false;
            boolean firstNameValid=false;
            boolean lastNameValid=false;
            boolean phoneNumberValid=false;
            boolean dobValid=false;
            boolean emailIdValid=false;
            boolean userNameValid=false;
            boolean passwordValid=false;
            boolean confirmPasswordValid=false;
            boolean pamentMethodValid=false;


            if(amazonUser.getFirstName()!=null){
                firstNameValid=true;
            }else{
                System.out.println("invalid first name");
            }

            if(amazonUser.getLastName()!=null){
                lastNameValid=true;
            }else{
                System.out.println("invalid last name");
            }

            if(amazonUser.getPhoneNumber()!=null){
                phoneNumberValid=true;
            }else {
                System.out.println("invalid phone number");
            }

            if(amazonUser.getDob()!=null){
                dobValid=true;
            }else {
                System.out.println("invalid date of birth");
            }

            if(amazonUser.getEmailId()!=null){
                emailIdValid=true;
            }else {
                System.out.println("invalid email id");
            }

            if(amazonUser.getUserName()!=null){
                userNameValid=true;
            }else {
                System.out.println("invalid user name");
            }

            if(amazonUser.getPassword()!=null){
                passwordValid=true;
            }else {
                System.out.println("invalid password ");
            }

            if(amazonUser.getConfirmPassword()!=null){
                confirmPasswordValid=true;
            }else {
                System.out.println("invalid confirm password");
            }

            if(amazonUser.getPaymentMethod()!=null){
                pamentMethodValid=true;
            }else {
                System.out.println("invalid payment method");
            }

            if(firstNameValid && lastNameValid && phoneNumberValid && dobValid && emailIdValid && userNameValid && passwordValid && confirmPasswordValid && pamentMethodValid){
                AmazonUserCreated=true;
            }else{
                System.out.println("invalid credential");
            }

            return AmazonUserCreated;
        }




    }

