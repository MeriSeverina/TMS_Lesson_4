package Lesson_4;

import java.util.Comparator;
import java.util.Scanner;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;

/**
 * Дана строка произвольной длины с произвольными словами.
 *   Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
 *   Если таких слов несколько, найти первое из них.
 *   Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напиши ниже предложение и я покажу слово, в котором число различных символов минимально:");
        String line = scan.nextLine();
        String[] stringByWords = line.split(" ");
        String word = stringByWords[0];
            for (String stringByWord : stringByWords) {
                if (word.chars().distinct().count() > stringByWord.chars().distinct().count()) {
                    word = stringByWord;
                }
            }
            System.out.println(word);
        }

}
