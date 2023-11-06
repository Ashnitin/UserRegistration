package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private String userInput;
    public UserRegistration() {
    }


    public boolean validFirstName(String userInput) {
        Pattern p =Pattern.compile("[A-Z][A-Za-z]{2,}");
        Matcher m=p.matcher(userInput);
        boolean b=m.matches();
        System.out.println(b);
        return b;
    }
}
