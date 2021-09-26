package Lesson_4;

import java.util.Scanner;

public class Task_3 {
    public static String line;
    public static int i;

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Напиши ниже предложение, чтобы проверить является ли любое выбранное слово в предложении полиндромом:");
            String line = scan.nextLine();
            Task_3.Palindrome(line,3);
    }
            public Task_3(String line,int i) {
                this.line=line;
                this.i=i;
            }
            public static void Palindrome(String line, int i) {
                String[] stringByWords = line.split(" ");
                try {
                    i--;
                    if (stringByWords[i].equalsIgnoreCase(String.valueOf(new StringBuilder(stringByWords[i]).reverse()))) {
                        System.out.println(stringByWords[i] + " - Палиндром");
                    } else {
                        System.out.println(stringByWords[i] + "- Не палиндром");
                    }
                } catch (Exception ex) {
                    System.out.println("Ошибка, попробуйте еще раз");
                }
            }
        }
