package com.example.polyglot.service;

import com.example.polyglot.dto.VerbTwoLanguageDTO;
import com.example.polyglot.entity.Verb;

import java.util.List;

public interface ILessonOneService {

    VerbTwoLanguageDTO getDTO();
    List<VerbTwoLanguageDTO> fetchListForLessonOne();

}
