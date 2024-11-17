package com.prova_api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.prova_api.phrases.PhraseList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/getPhrase")
public class Frase {

    @GetMapping
    public Map<String, List<String>> getRandomPhrase() {
        // Otteniamo una frase casuale e la incapsuliamo in una lista
        String randomPhrase = PhraseList.getRandomPhrase();
        Map<String, List<String>> response = new HashMap<>();
        response.put("data", Collections.singletonList(randomPhrase));
        return response;
    }

    

}
