package com.vishnu.firstspringbootapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HomeController {

    // it will go and look the property file and inject it from there
    @Value("${app.version}")
    private String appVersion;

    @GetMapping
    @RequestMapping("/")
    public Map getStatus() {
        Map<String, String> map = new LinkedHashMap();
        map.put("app-version", appVersion);
        return map;

    }
}
