package ua.training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String [] args) {
        Integer [] values = new Integer [] {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        List<Integer> elements = Arrays.asList(values);

        Map<Integer,Integer> res = ElementsOccurrenceCounter.countElementsOccurrence(elements);

        for (Integer key : res.keySet()) {
            System.out.println(key + " - " + res.get(key));
        }

        Map<Integer, Integer> streamRes = ElementsOccurrenceCounter.countElementsOccurrenceStream(elements);

        streamRes.entrySet().stream().forEach(System.out::println);
    }
}
