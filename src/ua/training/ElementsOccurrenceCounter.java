package ua.training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ElementsOccurrenceCounter {
    static Map<Integer, Integer> countElementsOccurrence(List<Integer> elements) {
        Map<Integer, Integer> elementOccurrence = new HashMap<>();

        for (Integer element : elements) {
            elementOccurrence.put(element, elementOccurrence.getOrDefault(element, 0) + 1);
        }

        return elementOccurrence;
    }

    static Map<Integer, Integer> countElementsOccurrenceStream(List<Integer> elements) {
        Map<Integer, Integer> elementOccurrence = new HashMap<>();

        elements.forEach(element -> elementOccurrence.put(element, elementOccurrence.getOrDefault(element, 0) + 1));

        return elementOccurrence;
    }
}
