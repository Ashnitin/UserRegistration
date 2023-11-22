package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
interface ValidateUserEntry{
    boolean validate(String input);
}
public class UserRegistration {
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String password;
    public UserRegistration() {
    }


    public boolean validFirstName(String firstName)  {
        ValidateUserEntry validFirstName=fname->Pattern.matches("[A-Z][A-Za-z]{2,}",fname);
        try {
            if(validFirstName.validate(firstName)) {
                return true;
            }
            else{
                throw new UserRegistrationException("Enter Valid FirstName");
            }
        }
        catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean validLastName(String lastName) {
        ValidateUserEntry validLastName=lname->Pattern.matches("[A-Z][A-Za-z]{2,}", lname);
        try {
            if (validLastName.validate(lastName)) {
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid LastName");
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean validEmail(String email) {
        ValidateUserEntry validEmail=vEmail->Pattern.matches("[a-z A-Z 0-9 _/-/.()+]+[@][a-z]+[/.][a-z]{2,3}",vEmail );
        try {
            if (validEmail.validate(email)) {
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid Email");
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean validMobile(String mobile) {
        ValidateUserEntry validMobile=vMobile->Pattern.matches("^[9]+[1]+\\s[0-9]{10}$",vMobile );
        try {
            if (validMobile.validate(mobile)) {
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid Mobile");
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }

    public boolean validPassword(String password) {
        ValidateUserEntry validPass=vPass->Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$",vPass );
        try {
            if (validPass.validate(password)) {
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid Email");
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }
}
