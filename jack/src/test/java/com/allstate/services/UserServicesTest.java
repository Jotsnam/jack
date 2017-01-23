package com.allstate.services;

import com.allstate.entities.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value={"/Sql/Seed.sql"})
public class UserServicesTest {

    @Autowired
    private UserServices service;


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void ShouldReturnTheCreatedUser() throws Exception{
        User u = new User();
        u.setName("Parag");
        User created = this.service.create(u);
        assertEquals("Parag",created.getName());
    }

    @Test
    public void ShouldReturnsListofAllUsers(){
        User u = new User();
        u.setName("Parag");
        this.service.create(u);
        List<User> userlist  = this.service.findall();
        assertEquals("Parag",userlist.get(1).getName());
        assertEquals(100000,userlist.get(1).getBalance());
    }

    @Test
    public void ShouldReturnsUserByID(){
        User u = new User();
        u.setName("Parag");
        this.service.create(u);
        assertEquals("Parag",this.service.findById(2).getName());
        assertEquals(100000,this.service.findById(2).getBalance());
    }

    @Test
    public void ShouldNotReturnsUserByBadID(){
        User u = new User();
        u.setName("Parag");
        this.service.create(u);
        assertNull(this.service.findById(3));
    }

}