package com.xworks.amazon;

import com.xworks.amazon.account.AmazonAccount;
import com.xworks.amazon.user.AmazonUser;

public class AmazonRunner {


    public static void main(String[] args) {
            AmazonUser amazonUser = new AmazonUser();
            amazonUser.setFirstName("Tejaswini");
            amazonUser.setLastName("Jagadish");
            amazonUser.setPhoneNumber("8884141141");
            amazonUser.setDob("03-12-2002");
            amazonUser.setEmailId("tejaswiniammu321@gmail.com");
            amazonUser.setUserName("tejaswini321");
            amazonUser.setPassword("Tejaswini@321");
            amazonUser.setConfirmPassword("Tejaswini@321");
            amazonUser.setPaymentMethod("Google Pay");

            AmazonAccount amazonAccount =new AmazonAccount();
            boolean created = amazonAccount.createAmazonUser(amazonUser);

            System.out.println("First Name: " + amazonUser.getFirstName());
            System.out.println("Last Name: " + amazonUser.getLastName());
            System.out.println("Phone Number: " +amazonUser.getPhoneNumber());
            System.out.println("Date of Birth: " +amazonUser.getDob());
            System.out.println("Email: " +amazonUser.getEmailId());
            System.out.println("Username: " + amazonUser.getUserName());
            System.out.println("Password: " + amazonUser.getPassword());
            System.out.println("Password: " + amazonUser.getConfirmPassword());
            System.out.println("Password: " + amazonUser.getPaymentMethod());




            if (userCreated){
                    System.out.println("the amazon user is:" + amazonUser.getGivenName());
                    System.out.println("the sur name is:" + amazonUser.getSurName());
                    System.out.println("the email is:" + amazonUser.getEmail());
                    System.out.println("the phone number is:" + amazonUser.getPhoneNumber());
                    System.out.println("the password is:" + amazonUser.getPassword());
                    System.out.println("the confirm pwd is:" + amazonUser.getcPwd());


        }
    }


