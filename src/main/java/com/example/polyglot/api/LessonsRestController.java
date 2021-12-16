package com.example.polyglot.api;

import com.example.polyglot.dto.VerbTwoLanguageDTO;
import com.example.polyglot.service.LessonOneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lessons")
public class LessonsRestController {

    private final LessonOneService service;

    public LessonsRestController(LessonOneService service) {
        this.service = service;
    }

    @GetMapping("/lesson-1")
    public ResponseEntity<VerbTwoLanguageDTO> getPhrase() {
        return ResponseEntity.ok(service.getDTO());
    }



}
