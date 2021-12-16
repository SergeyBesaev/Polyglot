package com.example.polyglot.entity;

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
@Table(name = "conjunctions")
public class Conjunction {

    @Id
    private int id;

    @Column(name = "eng")
    private String eng;

    @Column(name = "transcription")
    private String transcription;

    @Column(name = "rus")
    private String rus;

    @Column(name = "section")
    private String section;

    @Column(name = "subsection")
    private String subsection;

    @Column(name = "note")
    private String note;

}
