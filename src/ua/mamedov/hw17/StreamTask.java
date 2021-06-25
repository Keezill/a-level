package ua.mamedov.hw17;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamTask {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(111, "Joseph", 2),
                new Person(22, "Morgan", 44),
                new Person(3, "Adam", 6));


        List<String> streamOfNames = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("First task: " + streamOfNames);


        OptionalInt countMaxId = people.stream()
                .mapToInt(Person::getId)
                .max();
        System.out.println("Second task: " + countMaxId);


        int countLetterA = people.stream()
                .filter(s -> s.getName().contains("a"))
                .mapToInt(Person::getCount)
                .sum();
        System.out.println("Third task: " + countLetterA);


        Map<Integer, String> map = people.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName));
        System.out.println("Fourth task: " + map);
    }
}
