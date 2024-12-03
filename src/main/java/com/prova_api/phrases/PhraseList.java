package com.prova_api.phrases;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PhraseList {

    // Lista statica di frasi inizializzata direttamente
    private final List<String> phrases = List.of(
        "Life is beautiful.",
        "Java is amazing!",
        "Spring Boot makes development easy.",
        "Keep learning, keep growing.",
        "Coding is fun!"
    );

    public String getRandomPhrase() {
        return phrases.get(new Random().nextInt(phrases.size()));
    }
}
