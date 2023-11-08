package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String password;
    public UserRegistration() {
    }


    public boolean validFirstName(String firstName)  {
        try {
            if(Pattern.matches("[A-Z][A-Za-z]{2,}",firstName)) {
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
        try {
            if (Pattern.matches("[A-Z][A-Za-z]{2,}", lastName)) {
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
        try {
            if (Pattern.matches("[a-z A-Z 0-9 _/-/.()+]+[@][a-z]+[/.][a-z]{2,3}",email )) {
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
        try {
            if (Pattern.matches("^[9]+[1]+\\s[0-9]{10}$",mobile )) {
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid Mobile");
            }
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }

    public boolean valisPassword(String password) {
        try {
            if (Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$",password )) {
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
