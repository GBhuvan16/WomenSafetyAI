package com.example.SafetyAI.Service;

import org.springframework.stereotype.Service;

@Service
public class SOSService {

    public void sendAlert(double lat, double lon) {
        System.out.println("SOS ALERT!");
        System.out.println("Location: " + lat + ", " + lon);
    }
}