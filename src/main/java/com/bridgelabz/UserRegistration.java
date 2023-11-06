package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private String firstName;
    private String lastName;
    private String email;

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
}
