package com.example.polyglot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Entity
@Table(name = "verbs")
public class Verb {

    @Id
    @JsonIgnore
    private int id;

    @Column(name = "engbase")
    private String engBase;

    @Column(name = "engthird")
    private String engThird;

    @Column(name = "engsimplepast")
    private String engSimplePast;

    @Column(name = "rusbase")
    private String rusBase;

    @Column(name = "ruspresenti")
    private String rusPresentI;

    @Column(name = "ruspresentwe")
    private String rusPresentWe;

    @Column(name = "ruspresentyou")
    private String rusPresentYou;

    @Column(name = "ruspresentthey")
    private String rusPresentThey;

    @Column(name = "ruspresentheshe")
    private String rusPresentHeShe;

    @Column(name = "rusfuturei")
    private String rusFutureI;

    @Column(name = "rusfuturewe")
    private String rusFutureWe;

    @Column(name = "rusfutureyou")
    private String rusFutureYou;

    @Column(name = "rusfuturethey")
    private String rusFutureThey;

    @Column(name = "rusfutureheshe")
    private String rusFutureHeShe;

    @Column(name = "ruspastyouhei")
    private String rusPastYouHeI;

    @Column(name = "ruspastwethey")
    private String rusPastWeThey;

    @Column(name = "ruspastshe")
    private String rusPastShe;

}
