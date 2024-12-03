package com.prova_api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.prova_api.phrases.PhraseList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/getPhrase")
public class FraseController {

    //ignezione dipendenza con costruttore 
    private final PhraseList phraseList;
    @Autowired //-> Spring usa automaticamente l'iniezione delle dipendenze, senza bisogno di aggiungere esplicitamente @Autowired.
    public FraseController(PhraseList phraseList) {
        this.phraseList = phraseList;
    }
    /*  
        -Immutabilità: Usando un costruttore per assegnare il valore al campo final, garantisci che il campo non possa essere 
            modificato dopo la costruzione dell'oggetto.
        -Chiarezza: È evidente quali sono le dipendenze necessarie per costruire l'oggetto. Questo rende il codice più leggibile 
            e manutenibile.
        -Facilità nei test: Puoi creare facilmente un'istanza della classe e iniettare una dipendenza mock durante i test senza 
            fare affidamento su Spring.
        -Compatibilità con librerie moderne: Ad esempio, Lombok supporta la generazione di costruttori per la dependency injection, 
            semplificando ulteriormente il codice. 
    */
    

    @GetMapping
    public Map<String, List<String>> getRandomPhrase() {
        // Otteniamo una frase casuale e la incapsuliamo in una lista - (potrei farlo senza AUTOWIRED se nella classe Phrases uso
        //dei medodi statici e quindi non aver bisogno di una istanza della classe)
        String randomPhrase = phraseList.getRandomPhrase();
        Map<String, List<String>> response = new HashMap<>();
        response.put("data", Collections.singletonList(randomPhrase));
        return response;
    }

    

}
