package com.example.polyglot.service;

import com.example.polyglot.dto.VerbTwoLanguageDTO;
import com.example.polyglot.entity.Pronoun;
import com.example.polyglot.entity.Verb;
import com.example.polyglot.entity.enums.VerbForms;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;

@Service
@Transactional(readOnly = true)
public class LessonOneService {

    @PersistenceContext
    private EntityManager entityManager;

    public VerbTwoLanguageDTO getDTO() {
        VerbTwoLanguageDTO dto = new VerbTwoLanguageDTO();
        Verb verb = getRandomVerb();
        String form = getRandomFormOfVerb();
        Pronoun pronoun = getRandomPronoun();

        if (form.equals("FutureQuestion")) {
            dto.setEngForm("Will " + pronoun.getEngPronoun().toLowerCase() + " " + verb.getEngBase() + "?");
            switch (pronoun.getEngPronoun()) {
                case "I":
                    dto.setRusForm("Я " + verb.getRusFutureI() + "?");
                    return dto;
                case "You":
                    dto.setRusForm("Ты " + verb.getRusFutureYou() + "?");
                    return dto;
                case "We":
                    dto.setRusForm("Мы " + verb.getRusFutureWe() + "?");
                    return dto;
                case "They":
                    dto.setRusForm("Они " + verb.getRusFutureThey() + "?");
                    return dto;
                case "He":
                    dto.setRusForm("Он " + verb.getRusFutureHeShe() + "?");
                    return dto;
                default:
                    dto.setRusForm("Она " + verb.getRusFutureHeShe() + "?");
                    return dto;
            }
        }

        if (form.equals("FutureStatement")) {
            dto.setEngForm(pronoun.getEngPronoun() + " will " + verb.getEngBase());
            switch (pronoun.getEngPronoun()) {
                case "I":
                    dto.setRusForm("Я " + verb.getRusFutureI());
                    return dto;
                case "You":
                    dto.setRusForm("Ты " + verb.getRusFutureYou());
                    return dto;
                case "We":
                    dto.setRusForm("Мы " + verb.getRusFutureWe());
                    return dto;
                case "They":
                    dto.setRusForm("Они " + verb.getRusFutureThey());
                    return dto;
                case "He":
                    dto.setRusForm("Он " + verb.getRusFutureHeShe());
                    return dto;
                default:
                    dto.setRusForm("Она " + verb.getRusFutureHeShe());
                    return dto;
            }
        }

        if (form.equals("FutureNegative")) {
            dto.setEngForm(pronoun.getEngPronoun() + " won't " + verb.getEngBase());
            switch (pronoun.getEngPronoun()) {
                case "I":
                    dto.setRusForm("Я не " + verb.getRusFutureI());
                    return dto;
                case "You":
                    dto.setRusForm("Ты не " + verb.getRusFutureYou());
                    return dto;
                case "We":
                    dto.setRusForm("Мы не " + verb.getRusFutureWe());
                    return dto;
                case "They":
                    dto.setRusForm("Они не " + verb.getRusFutureThey());
                    return dto;
                case "He":
                    dto.setRusForm("Он не " + verb.getRusFutureHeShe());
                    return dto;
                default:
                    dto.setRusForm("Она не " + verb.getRusFutureHeShe());
                    return dto;
            }
        }

        if (form.equals("PresentQuestion")) {
            switch (pronoun.getEngPronoun()) {
                case "I":
                    dto.setEngForm("Do I " + verb.getEngBase() + "?");
                    dto.setRusForm("Я " + verb.getRusPresentI() + "?");
                    return dto;
                case "You":
                    dto.setEngForm("Do you " + verb.getEngBase() + "?");
                    dto.setRusForm("Ты " + verb.getRusPresentYou() + "?");
                    return dto;
                case "We":
                    dto.setEngForm("Do we " + verb.getEngBase() + "?");
                    dto.setRusForm("Мы " + verb.getRusPresentWe() + "?");
                    return dto;
                case "They":
                    dto.setEngForm("Do they " + verb.getEngBase() + "?");
                    dto.setRusForm("Они " + verb.getRusPresentThey() + "?");
                    return dto;
                case "He":
                    dto.setEngForm("Does he " + verb.getEngBase() + "?");
                    dto.setRusForm("Он " + verb.getRusPresentHeShe() + "?");
                    return dto;
                default:
                    dto.setEngForm("Does she " + verb.getEngBase() + "?");
                    dto.setRusForm("Она " + verb.getRusPresentHeShe() + "?");
                    return dto;
            }
        }

        if (form.equals("PresentStatement")) {
            switch (pronoun.getEngPronoun()) {
                case "I":
                    dto.setEngForm("I " + verb.getEngBase());
                    dto.setRusForm("Я " + verb.getRusPresentI());
                    return dto;
                case "You":
                    dto.setEngForm("You " + verb.getEngBase());
                    dto.setRusForm("Ты " + verb.getRusPresentYou());
                    return dto;
                case "We":
                    dto.setEngForm("We " + verb.getEngBase());
                    dto.setRusForm("Мы " + verb.getRusPresentWe());
                    return dto;
                case "They":
                    dto.setEngForm("They " + verb.getEngBase());
                    dto.setRusForm("Они " + verb.getRusPresentThey());
                    return dto;
                case "He":
                    dto.setEngForm("He " + verb.getEngThird());
                    dto.setRusForm("Он " + verb.getRusPresentHeShe());
                    return dto;
                default:
                    dto.setEngForm("She " + verb.getEngThird());
                    dto.setRusForm("Она " + verb.getRusPresentHeShe());
                    return dto;
            }
        }

        if (form.equals("PresentNegative")) {
            switch (pronoun.getEngPronoun()) {
                case "I":
                    dto.setEngForm("I don't " + verb.getEngBase());
                    dto.setRusForm("Я не " + verb.getRusPresentI());
                    return dto;
                case "You":
                    dto.setEngForm("You don't " + verb.getEngBase());
                    dto.setRusForm("Ты не " + verb.getRusPresentYou());
                    return dto;
                case "We":
                    dto.setEngForm("We don't " + verb.getEngBase());
                    dto.setRusForm("Мы не " + verb.getRusPresentWe());
                    return dto;
                case "They":
                    dto.setEngForm("They don't " + verb.getEngBase());
                    dto.setRusForm("Они не " + verb.getRusPresentThey());
                    return dto;
                case "He":
                    dto.setEngForm("He doesn't " + verb.getEngBase());
                    dto.setRusForm("Он не " + verb.getRusPresentHeShe());
                    return dto;
                default:
                    dto.setEngForm("She doesn't " + verb.getEngBase());
                    dto.setRusForm("Она не " + verb.getRusPresentHeShe());
                    return dto;
            }
        }

        if (form.equals("PastQuestion")) {
            dto.setEngForm("Did " + pronoun.getEngPronoun().toLowerCase() + " " + verb.getEngBase() + "?");
            switch (pronoun.getEngPronoun()) {
                case "I":
                    dto.setRusForm("Я " + verb.getRusPastYouHeI() + "?");
                    return dto;
                case "You":
                    dto.setRusForm("Ты " + verb.getRusPastYouHeI() + "?");
                    return dto;
                case "He":
                    dto.setRusForm("Он " + verb.getRusPastYouHeI() + "?");
                    return dto;
                case "We":
                    dto.setRusForm("Мы " + verb.getRusPastWeThey() + "?");
                    return dto;
                case "They":
                    dto.setRusForm("Они " + verb.getRusPastWeThey() + "?");
                    return dto;
                default:
                    dto.setRusForm("Она " + verb.getRusPastShe() + "?");
                    return dto;
            }
        }

        if (form.equals("PastStatement")) {
            dto.setEngForm(pronoun.getEngPronoun() + " " + verb.getEngSimplePast());
            switch (pronoun.getEngPronoun()) {
                case "I":
                    dto.setRusForm("Я " + verb.getRusPastYouHeI());
                    return dto;
                case "You":
                    dto.setRusForm("Ты " + verb.getRusPastYouHeI());
                    return dto;
                case "He":
                    dto.setRusForm("Он " + verb.getRusPastYouHeI());
                    return dto;
                case "We":
                    dto.setRusForm("Мы " + verb.getRusPastWeThey());
                    return dto;
                case "They":
                    dto.setRusForm("Они " + verb.getRusPastWeThey());
                    return dto;
                default:
                    dto.setRusForm("Она " + verb.getRusPastShe());
                    return dto;
            }
        }

        else {
            dto.setEngForm(pronoun.getEngPronoun() + " didn't " + verb.getEngBase());
            switch (pronoun.getEngPronoun()) {
                case "I":
                    dto.setRusForm("Я не " + verb.getRusPastYouHeI());
                    return dto;
                case "You":
                    dto.setRusForm("Ты не " + verb.getRusPastYouHeI());
                    return dto;
                case "He":
                    dto.setRusForm("Он не " + verb.getRusPastYouHeI());
                    return dto;
                case "We":
                    dto.setRusForm("Мы не " + verb.getRusPastWeThey());
                    return dto;
                case "They":
                    dto.setRusForm("Они не " + verb.getRusPastWeThey());
                    return dto;
                default:
                    dto.setRusForm("Она не " + verb.getRusPastShe());
                    return dto;
            }
        }
    }

    private Verb getRandomVerb() {
        Session session = entityManager.unwrap(Session.class);
        // Получаем список всех глаголов
        List<Verb> list = session.createCriteria(Verb.class).list();
        session.close();

        // Получаем случайное число, которое станет номером индекса
        int randomIndexList = new Random().nextInt(list.size());

        // Возвращаем случайный глагол
        return list.get(randomIndexList);
    }

    private String getRandomFormOfVerb() {
        // Создаем List из всех форм глагола
        List<VerbForms> list = new ArrayList<>(Arrays.asList(
              VerbForms.FutureQuestion,
              VerbForms.FutureStatement,
              VerbForms.FutureNegative,
              VerbForms.PresentQuestion,
              VerbForms.PresentStatement,
              VerbForms.PresentNegative,
              VerbForms.PastQuestion,
              VerbForms.PastStatement,
              VerbForms.PastNegative
        ));
        // Получаем случайное число, которое станет номером индекса
        int randomIndexList = new Random().nextInt(list.size());

        // Возвращаем случайную форму глагола
        return list.get(randomIndexList).toString();
    }

    private Pronoun getRandomPronoun() {
        Session session = entityManager.unwrap(Session.class);
        // Получаем список всех местоимений
        List<Pronoun> list = session.createCriteria(Pronoun.class).list();
        session.close();

        // Получаем случайное число, которое станет номером индекса
        int randomIndexList = new Random().nextInt(list.size());

        // Возвращаем случайное местоимение
        return list.get(randomIndexList);
    }

}
