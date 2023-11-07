package com.omrfth.springmvc.demo.model;


import lombok.Data;

import java.util.List;

@Data
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteSystems;
}
