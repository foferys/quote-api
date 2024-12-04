package com.prova_api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.prova_api.phrases.Phrase;
import com.prova_api.phrases.PhraseList;
import com.prova_api.services.PhraseRepository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/getPhrase")
public class FraseController {


    
    @Autowired
    private PhraseRepository phrasesRepository;

    
    
    @GetMapping("/all")
    public Map<String, List<Phrase>> getAll() {

        List<Phrase> phrases = phrasesRepository.findAll();

        Map<String, List<Phrase>> response = new HashMap<>();
        response.put("data", phrases);

        return response;
    }

    @GetMapping("/")
    public Map<String, List<Phrase>> getAllByType(@RequestParam String type) {

        
        List<Phrase> phrases = phrasesRepository.findByType(type);
        System.out.println("il tipo: " + type);

        Map<String, List<Phrase>> response = new HashMap<>();
        response.put("data", phrases);

        return response;
    }
 

    @GetMapping("/random")
    public Map<String, Phrase> getRandom() {

        Phrase phrase = phrasesRepository.findRandomPhrase();

        Map<String, Phrase> response = new HashMap<>();
        response.put("data", phrase);

        return response;
    }



    

}
