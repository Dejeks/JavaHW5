package org.example.Homework.HW5;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCounts = new HashMap<>();

        for (String employee : employees) {
            String name = employee.split("\\s+")[0];
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }

        List<Map.Entry<String, Integer>> nameEntries = new ArrayList<>(nameCounts.entrySet());

        nameEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : nameEntries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
