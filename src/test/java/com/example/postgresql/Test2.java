package com.example.postgresql;

import com.example.postgresql.database.UserDetailsDb;
import com.example.postgresql.model.UserDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test2 {
    @Autowired
    private UserDetailsDb userDetailsDb;

    @Test
    void addUserDetailsTest()
    {
        UserDetails userDetails = new UserDetails();
        userDetails.setUsername("test2");
        userDetails.setGender("test2");
        userDetails.setLose_gain("test2");
        userDetails.setActual_weight(1);
        userDetails.setDesired_weight(1);
        userDetails.setAge(1);
        userDetails.setHeight("test");
        userDetails.setHours_of_sleep(1);
        userDetails.setCountry("test");
        userDetails.setHow_active("test");
        userDetails.setWhen_active("test");

        userDetails.setHealth_problems("test");
        userDetailsDb.save(userDetails);
    }

}
