package com.example.demo.service;

import com.example.demo.model.HngModel;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Service
public class HngService {

    private static final String EMAIL = "van2jazz@gmail.com";
    private static final String GITHUB_URL = "https://github.com/van2jazz/your-repo";

    public HngModel getApiInfo() {
        String currentDatetime = Instant.now().atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
        return new HngModel(EMAIL, currentDatetime, GITHUB_URL);
    }
}
