package com.example.polyglot.api;

import com.example.polyglot.dto.DictionaryVerbDTO;
import com.example.polyglot.entity.Catchphrase;
import com.example.polyglot.entity.Noun;
import com.example.polyglot.service.DictionaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dictionary")
public class DictionaryRestController {

    private final DictionaryService service;

    public DictionaryRestController(DictionaryService service) {
        this.service = service;
    }

    @GetMapping("/verbs-all")
    public ResponseEntity<List<DictionaryVerbDTO>> getAllVerbs() {
        return ResponseEntity.ok(service.getAllVerbs());
    }

    @GetMapping("/random-verb")
    public ResponseEntity<DictionaryVerbDTO> getRandomVerb() {
        return ResponseEntity.ok(service.getRandomVerb());
    }

    @GetMapping("/nouns-all")
    public ResponseEntity<List<Noun>> getAllNouns() {
        return ResponseEntity.ok(service.getAllNouns());
    }

    @GetMapping("/random-noun")
    public ResponseEntity<Noun> getRandomNoun() {
        return ResponseEntity.ok(service.getRandomNoun());
    }

    @GetMapping("/catchphrase-all")
    public ResponseEntity<List<Catchphrase>> getAllCatchPhrase() {
        return ResponseEntity.ok(service.getAllCatchPhrase());
    }

    @GetMapping("/random-phrase")
    public ResponseEntity<Catchphrase> getRandomCatchPhrase() {
        return ResponseEntity.ok(service.getRandomCatchPhrase());
    }


}
