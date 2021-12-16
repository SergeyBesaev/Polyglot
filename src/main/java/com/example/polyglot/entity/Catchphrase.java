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
@Table(name = "catchphrases")
public class Catchphrase {

    @Id
    private int id;

    @Column(name = "phrase")
    private String phrase;

    @Column(name = "translate")
    private String translate;

}
