package com.example.SafetyAI.Service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {

        if(message.toLowerCase().contains("help") ||
                message.toLowerCase().contains("danger")) {
            return "SOS Triggered! Stay safe, help is coming.";
        }

        return "You said: " + message;
    }
}
