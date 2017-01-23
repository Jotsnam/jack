package com.allstate.controller;

import com.allstate.entities.User;
import com.allstate.services.UserServices;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserServices service;

    @Test
    public void setService() throws Exception {

    }

    @Test
    public void create() throws Exception {

    }

    @Test
    public void shouldCreateUser() throws Exception {
        // stub
        User user = new User();
        user.setName("Jotsna");
        user.setBalance(50000);
        when(this.service.create(any())).thenReturn(user);

        // request
        MockHttpServletRequestBuilder request = post("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"yahoo\", \"balance\":500}");

        // assertion
        this.mvc.perform(request)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Jotsna")))
                .andExpect(jsonPath("$.balance", is(50000)));
    }

}