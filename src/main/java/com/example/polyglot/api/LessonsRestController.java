package com.example.polyglot.api;

import com.example.polyglot.dto.VerbTwoLanguageDTO;
import com.example.polyglot.entity.Verb;
import com.example.polyglot.service.ILessonOneService;
import com.example.polyglot.service.LessonOneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lessons")
public class LessonsRestController {

    private final ILessonOneService service;

    public LessonsRestController(ILessonOneService service) {
        this.service = service;
    }

    @GetMapping("/lesson-1-phrase")
    public ResponseEntity<VerbTwoLanguageDTO> getPhrase() {
        return ResponseEntity.ok(service.getDTO());
    }

    @GetMapping("/lesson-1-all")
    public ResponseEntity<List<VerbTwoLanguageDTO>> getLessonOneController() {
        return ResponseEntity.ok(service.fetchListForLessonOne());
    }


}
