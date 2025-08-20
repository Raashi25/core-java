package com.amazon.register;



public class AmazonRunner {
    public static void main(String[] args) {


        Register register = new Register();


        register.setFirstName("shivraj");
        register.setSecName(null);
        register.setPassword("45678");
        register.setConPassword("45678");-

        Validation validation = new Validation();

        if(validation.val(register)){
            validation.getInfo();
        }else System.out.println("Invalid");
    }
}

