package com.prova_api.phrases;

import java.util.List;
import java.util.Random;

public class PhraseList {

    // Lista statica di frasi inizializzata direttamente
    private static final List<String> phrases = List.of(
        "Life is beautiful.",
        "Java is amazing!",
        "Spring Boot makes development easy.",
        "Keep learning, keep growing.",
        "Coding is fun!"
    );

    public static String getRandomPhrase() {
        return phrases.get(new Random().nextInt(phrases.size()));
    }
}
