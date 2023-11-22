package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {
    UserRegistration ob=new UserRegistration();
    @Test
    public void givenValidFirstName(){
        boolean firstName=ob.validFirstName("Ash");
        Assertions.assertTrue(firstName);
    }
    @Test
    public void givenValidLastName(){
        boolean lastName=ob.validLastName("Bankar");
        Assertions.assertTrue(lastName);
    }
    @Test
    public void givenValidEmail(){
        boolean email=ob.validEmail("ashwini.bankar11@gmail.com");
        Assertions.assertTrue(email);
    }
    @Test
    public void givenPreDefinedMobileFormat(){
        boolean mobile=ob.validMobile("91 7796226982");
        Assertions.assertTrue(mobile);
    }
    @Test
    public void givenPasswordRule4(){
        boolean pass=ob.validPassword("abCd58r78@");
        Assertions.assertTrue(pass);
    }
    @ParameterizedTest
    @CsvSource({
            "abc@yahoo.com,true",
            "abc,false",
            "abc100@yahoo.com,true",
            "abc@.com.my,false",
            "abc.100@yahoo.com,true",
            "abc111@abc.com,true",
            "abc123@.com.com,false",
            "abc100@abc.net,true",
            "abc@1.com,false",
            "abc()*@gmail.com,false",
            "abc+100@gmail.com,true",
            "abc.@gmail.com,true",
            "abc@abc@gmail.com,false",
    })
    public void sampleEmailTest(String email,boolean expected){
        boolean result=ob.validEmail(email);
        Assertions.assertEquals(expected,result);
    }
}
