package com.example.SafetyAI.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@CrossOrigin
public class SOSController {

    @PostMapping("/sos")
    public String sendSOS(@RequestBody Map<String, String> data) {

        System.out.println("🚨 SOS ALERT RECEIVED");
        System.out.println("Latitude: " + data.get("lat"));
        System.out.println("Longitude: " + data.get("lng"));
        System.out.println("Map Link: " + data.get("link"));



        return "SOS sent successfully!";
    }
}