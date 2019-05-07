package io.github.bael.unit7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public StreamExample(String name) {
        this.name = name;
    }

    private String name;

    public List<Integer> generateList() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }

    public List<Integer> makeOddList(List<Integer> list) {
        return list.stream()
                .filter(
                        // лямбда выражение
                        integer -> integer % 2 == 0
                ).collect(Collectors.toList());

    }

    public List<String> makeNamesList(List<Integer> list) {

        String prefix = name;
        return list.stream()
                .map(
                        // лямбда выражение
                        integer -> String.format("%s: %d", prefix, integer)
                ).collect(Collectors.toList());
    }

    public List<String> changeNamesList(List<Integer> list) {
        return list.stream()
                .map(
                        // лямбда выражение
                        integer -> {
                            name = "кул хацкер";
                            return String.format("%s: %d", name, integer);
                        }
                ).collect(Collectors.toList());
    }


    public List<String> changeNamesList2(List<Integer> list) {
        String prefix = name;

        return list.stream()
                .map(
                        // лямбда выражение
                        integer -> {
                            // does not compile
                           // prefix = "кул хацкер";
                            return String.format("%s: %d", prefix, integer);
                        }
                ).collect(Collectors.toList());
    }
}
