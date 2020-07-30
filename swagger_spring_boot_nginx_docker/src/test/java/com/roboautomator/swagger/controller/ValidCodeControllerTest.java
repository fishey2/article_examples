package com.roboautomator.swagger.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ValidCodeController.class)
@AutoConfigureMockMvc
public class ValidCodeControllerTest {

    private static final String BASE_URI = "/api/valid/";

    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldReturn200WithCorrectCode() throws Exception {
        mockMvc
            .perform(get(BASE_URI + "abc123"))
            .andExpect(status().isOk())
            .andExpect(content().string("true"));
    }

    @Test
    void shouldReturn200WithIncorrectCode() throws Exception {
        mockMvc
            .perform(get(BASE_URI + "wrong_code"))
            .andExpect(status().isOk())
            .andExpect(content().string("false"));
    }

}
