package com.example.SafetyAI.controller;

import com.example.SafetyAI.model.ChatRequest;
import com.example.SafetyAI.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class ChatController {
    public ChatController() {
        System.out.println("🔥 ChatController Loaded");
    }

    @Autowired
    private ChatService service;
    @GetMapping("/test")
    public String test() {
        return "Backend working!";
    }
    @PostMapping("/chat")
    public String chat(@RequestBody ChatRequest request) {
        return service.getReply(request.getMessage());
    }
    @PostMapping("/location")
    public void receiveLocation(@RequestBody Map<String, String> data) {
        System.out.println("Live Location: " + data);
    }
}