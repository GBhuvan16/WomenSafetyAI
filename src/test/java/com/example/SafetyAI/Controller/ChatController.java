package com.example.SafetyAI.Controller;

import com.example.SafetyAI.Model.ChatRequest;
import com.example.SafetyAI.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class ChatController {

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