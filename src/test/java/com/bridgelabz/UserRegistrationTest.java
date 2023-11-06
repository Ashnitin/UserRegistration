package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenValidFirstName(){
        UserRegistration ob=new UserRegistration();
        boolean firstName=ob.validFirstName("AshWini");
        Assertions.assertTrue(firstName);
    }


}
