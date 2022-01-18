package com.demo.controller;

import com.demo.service.EmployeeServices;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import  static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/test-context.xml","file:src/main/webapp/WEB-INF/spring-servlet.xml"})
@WebAppConfiguration
public class MainControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void shouldCreateMockMvc(){
        assertNotNull(mockMvc);
    }

    @Test
    public void homeTest() throws Exception{
        mockMvc.perform(get("/"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }

//    @Test
//    public void springLoginForm() throws Exception{
//        mockMvc.perform(get("/showMyLoginPage"))
//                .andExpect(MockMvcResultMatchers.view().name("fancy-login"));
//    }
//
//    @Test
//    public void accessDeniedPageTest() throws Exception{
//        mockMvc.perform(get("/access-denied"))
//                .andExpect(MockMvcResultMatchers.view().name("access-denied"));
//    }
}
