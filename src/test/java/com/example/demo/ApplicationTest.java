package com.example.demo;

import com.example.demo.model.HngModel;
import com.example.demo.service.HngService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;



@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTest {


    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private HngService hngService;

    @Test
    void testPublicApiService() {
        HngModel response = hngService.getApiInfo();
        assert response.getEmail().equals("van2jazz@gmail.com");
        assert response.getGithubUrl().equals("https://github.com/van2jazz/hng");
        assert response.getCurrentDateTime().matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z");
    }

    @Test
    void testApiEndpoint() throws Exception {
        mockMvc.perform(get("/api"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.email", is("van2jazz@gmail.com")))
                .andExpect(jsonPath("$.github_url", is("https://github.com/van2jazz/hng")))
                .andExpect(jsonPath("$.current_datetime", matchesPattern("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z")));
    }
}


