package com.example.SafetyAI.Service;

import org.springframework.stereotype.Service;

@Service
public class SOSService {

    public void sendAlert(double lat, double lng, String mapLink) {
        System.out.println("🚨 SOS ALERT!");
        System.out.println("Latitude : " + lat);
        System.out.println("Longitude: " + lng);
        System.out.println("Map Link : " + mapLink);

        // TODO: Replace with real email/SMS alert
    }
}