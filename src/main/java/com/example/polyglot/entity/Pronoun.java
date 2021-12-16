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
@Table(name = "pronouns")
public class Pronoun {

    @Id
    private int id;

    @Column(name = "eng_pronoun")
    private String engPronoun;

    @Column(name = "rus_pronoun")
    private String rusPronoun;

}
