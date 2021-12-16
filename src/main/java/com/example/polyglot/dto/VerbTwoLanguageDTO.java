package com.example.polyglot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VerbTwoLanguageDTO {

    private String engForm;
    private String rusForm;

}
