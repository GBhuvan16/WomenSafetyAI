package com.example.SafetyAI.controller;

import com.example.SafetyAI.service.SOSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class SOSController {

    @Autowired
    private SOSService sosService;

    @PostMapping("/sos")
    public String sendSOS(@RequestBody Map<String, String> data) {
        String lat = data.get("lat");
        String lng = data.get("lng");
        String link = data.get("link");

        if (lat == null || lng == null) {
            return "Missing location data.";
        }

        sosService.sendAlert(Double.parseDouble(lat), Double.parseDouble(lng), link);
        return "SOS sent successfully!";
    }
}