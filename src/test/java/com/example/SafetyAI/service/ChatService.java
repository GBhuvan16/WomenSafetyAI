package com.example.SafetyAI.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ChatService {

    private static final List<String> DANGER_KEYWORDS =
            List.of("help", "danger", "sos", "emergency", "attack", "unsafe");

    public String getReply(String message) {
        if (message == null || message.isBlank()) {
            return "Please enter a message.";
        }

        String lower = message.toLowerCase();
        boolean isDanger = DANGER_KEYWORDS.stream().anyMatch(lower::contains);

        if (isDanger) {
            return "🚨 SOS Triggered! Stay safe, help is on the way.";
        }

        // TODO: Replace with real AI API call
        return "You said: " + message;
    }
}