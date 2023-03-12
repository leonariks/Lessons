package com.example.demo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloControllerTest.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getHello() throws Exception {
        mockMvc.perform(get("/spring/Hello"))
                .andExpect(status().isOk())
                .andExpect(view().name("Hello"))
                .andExpect(content().string(containsString("Приветствую, вы создали первое приложение на языке Java")));
    }

    @Test
    void getMessage() {
    }
}