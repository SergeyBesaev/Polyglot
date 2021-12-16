package com.example.polyglot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "verbs")
public class DictionaryVerbDTO {

    @Id
    private int id;

    @Column(name = "engbase")
    private String original;

    @Column(name = "engsimplepast")
    private String simplePast;

    @Column(name = "engthird")
    private String engThird;

    @Column(name = "rusbase")
    private String rusTranslation;

}
