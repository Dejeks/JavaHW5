package org.example.Homework.HW5;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите искомое слово:");
        String searchWord = scanner.nextLine();

        text = text.replaceAll("[^\\p{L}\\s]+", "");

        text = text.toLowerCase();

        String[] words = text.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        System.out.println(searchWord + " - " + wordCounts.getOrDefault(searchWord.toLowerCase(), 0));
    }
}
