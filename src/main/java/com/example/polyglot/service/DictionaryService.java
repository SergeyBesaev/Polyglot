package com.example.polyglot.service;

import com.example.polyglot.dto.DictionaryVerbDTO;
import com.example.polyglot.entity.Catchphrase;
import com.example.polyglot.entity.Noun;
import javassist.bytecode.stackmap.BasicBlock;
import org.hibernate.Session;
import org.hibernate.persister.walking.internal.CompositionSingularSubAttributesHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Random;

@Service
@Transactional(readOnly = true)
public class DictionaryService {

    @PersistenceContext
    private EntityManager entityManager;

    List<DictionaryVerbDTO> listVerbDTO = entityManager.unwrap(Session.class).createCriteria(DictionaryVerbDTO.class).list();

    public List<DictionaryVerbDTO> getAllVerbs() {
        Session session = entityManager.unwrap(Session.class);
        List<DictionaryVerbDTO> list = session.createCriteria(DictionaryVerbDTO.class).list();
        session.close();
        return list;
    }

    public List<Noun> getAllNouns() {
        Session session = entityManager.unwrap(Session.class);
        List<Noun> list = session.createCriteria(Noun.class).list();
        session.close();
        return list;
    }

    public List<Catchphrase> getAllCatchPhrase() {
        Session session = entityManager.unwrap(Session.class);
        List<Catchphrase> list = session.createCriteria(Catchphrase.class).list();
        session.close();
        return list;
    }

    public Noun getRandomNoun() {
        List<Noun> list = getAllNouns();
        int rnd = new Random().nextInt(list.size());
        return list.get(rnd);
    }

    public Catchphrase getRandomCatchPhrase() {
        List<Catchphrase> list = getAllCatchPhrase();
        int rnd = new Random().nextInt(list.size());
        return list.get(rnd);
    }

    public DictionaryVerbDTO getRandomVerb() {
        List<DictionaryVerbDTO> list = getAllVerbs();
        int rnd = new Random().nextInt(list.size());
        return list.get(rnd);
    }

}
