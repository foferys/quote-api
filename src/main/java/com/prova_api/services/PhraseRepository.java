package com.prova_api.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prova_api.phrases.Phrase;

public interface PhraseRepository extends JpaRepository<Phrase, Integer> {

    List<Phrase> findByType(String type);
    
    @Query(value = "SELECT * FROM phrases ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Phrase findRandomPhrase();


    
}
