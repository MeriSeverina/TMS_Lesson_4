package Lesson_4;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
/**
 * 1. Дана строка произвольной длины с произвольными словами.
 *   Найти самое короткое слово в строке и вывести его на экран.
 *   Найти самое длинное слово в строке и вывести его на экран.
 *   Если таких слов несколько, то вывести последнее из них.
 */
public class Task_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Напиши ниже предложение, чтобы определить самое короткое и длинное в нем слово:");
        String line = scan.nextLine();
        String longWord = "", shortWord = line;
        String longWord2 = "";
        String shortWord2 = "";
        for (String s : line.split(" ")) {
            if (s.length() > longWord.length()) longWord = s;
            if (s.length() < shortWord.length()) shortWord = s;
        }
        System.out.println("Самое длинное слово: " + longWord);
        // System.out.println("Позиция в предложении: " + (line.indexOf(longWord) + 1)); Количество символов в слове
        System.out.println("Самое короткое слово: " + shortWord);
        // System.out.println("Позиция в предложении: " + (line.indexOf(shortWord) + 1)); Количество символов в слове
        for (String s : line.split(" ")) {
            if (s.length() == longWord.length()) longWord2 = s;
            if (s.length() == shortWord.length()) shortWord2 = s;
        }
            System.out.println("2-e cамое длинное слово: " + longWord2);
            System.out.println("2-e cамое короткое слово: " + shortWord2);

    }
}















//        Scanner console = new Scanner(System.in);
//        System.out.print("Введите любую фразу: ");
//        String voice = console.nextLine();
//        String[] array = voice.split(" ");
//        String minLen = array[0];
//        for (String e : array) {
//            if (e.length() < minLen.length()) {
//                minLen = e;
//                System.out.print( "Самое короткое слово: " + minLen);
//            }
//        }