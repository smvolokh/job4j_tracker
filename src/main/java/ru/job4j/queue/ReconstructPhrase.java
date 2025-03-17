package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int n = evenElements.size();
        for (int i = 0; i < n; i++) {
            char element = evenElements.pop();
            if (i % 2 == 0) {
                result.append(element);
            }
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        int n = descendingElements.size();
        for (int i = n - 1; i >= 0; i--) {
            result.append(descendingElements.pollLast());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}