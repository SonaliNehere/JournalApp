package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.Repository.UserRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.engineeringdigest.journalApp.Entity.User;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testAdd(){
        assertEquals(4, 2+2);
    }

//    @Disabled
    @ParameterizedTest
    @CsvSource({
            "sonali",
            "sejal",
            "snehal"
    })
    public void testFindByUserName(String userName){
        assertNotNull(userRepository.findByUserName(userName));

        User user = userRepository.findByUserName(userName);
        assertTrue(!user.getJournalEntries().isEmpty(), "failed for : " + userName);

    }

    @ParameterizedTest
    @CsvSource({
            "1,1,3",
            "2,10,12",
            "3,6,9"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a+b);
    }

    @BeforeEach
    void set(){

    }

    @BeforeAll
    static void setall(){

    }

    @AfterAll
    static void setallafter(){

    }



}
