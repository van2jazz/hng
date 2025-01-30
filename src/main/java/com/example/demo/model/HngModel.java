package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HngModel {

    private String email;

    @JsonProperty("current_datetime")
    private String currentDateTime;

    @JsonProperty("github_url")
    private String githubUrl;


    public HngModel(String email, String currentDateTime, String githubUrl) {
        this.email = email;
        this.currentDateTime = currentDateTime;
        this.githubUrl = githubUrl;
    }

    public String getEmail() {
        return email;
    }


    public String getCurrentDateTime() {
        return currentDateTime;
    }



    public String getGithubUrl() {
        return githubUrl;
    }

}
