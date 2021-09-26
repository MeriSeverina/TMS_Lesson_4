package Lesson_4;
import java.util.Scanner;

public class Task_0 {
    private String doc;
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите номер документа в формате xxxx-yyy-xxxx-yyy-xyxy, где x - это число, а y - это буква");
        String doc = str.nextLine();
        Task_0.num1(doc);
        Task_0.num2(doc);
        Task_0.num3(doc);
        Task_0.num4(doc);
        Task_0.num5(doc);
        Task_0.num6(doc);
        Task_0.num7(doc);
    }
        /**
         * 1) Вывести на экран в одну строку два первых блока по 4 цифры
         */
        protected static void num1(String doc) {
            String[] array = doc.split("-");
            System.out.print("1)  " + array[0]);
            System.out.println(" " + array[2]);
        }
        /**
         * * 2) Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
         */
        private static void num2(String doc) {
            System.out.println("2) " + doc.substring(0, 5) + "   " + doc.substring(8, 14) + "   " + doc.substring(17));
        }
        /**
         * 3) Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
         */
        private static void num3(String doc) {
            String str2 = doc.toLowerCase();
            String result2 = str2.replaceAll("[^a-zA-Z]", "");
            char[] array2 = result2.toCharArray();
            System.out.println("3) " + array2[0] + array2[1] + array2[2] + "/" + array2[3] + array2[4] + array2[5] + "/" + array2[6] + "/" + array2[7]);
        }
        /**
         * 4) Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
         * (реализовать с помощью класса StringBuilder)
         */
        private static void num4(String doc) {
            StringBuilder stringBuilder = new StringBuilder(doc.toUpperCase());
            stringBuilder.delete(0, 5);
            stringBuilder.delete(3, 8);
            stringBuilder.setCharAt(3, '/');
            stringBuilder.setCharAt(7, '/');
            stringBuilder.setCharAt(10, '/');
            stringBuilder.deleteCharAt(8);
            stringBuilder.insert(0, "Letters:");
            System.out.println("4) " + stringBuilder);
        }
        /**
         * 5) Проверить содержит ли номер документа последовательность abc и вывести
         * сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
         */
        private static void num5(String doc) {
            String string = new String(String.valueOf(doc.indexOf("abc")));
            String s = doc, sub = ("abc");
            if (s.toLowerCase().indexOf(sub) != -1) {
                System.out.println("5) Номер документа содержит последовательность букв abc");
            } else {
                System.out.println("5) Номер документа не содержит последовательность букв abc");
            }
        }
        /**
         * 6) Проверить начинается ли номер документа с последовательности 555.
         */
        private static void num6(String doc) {
            if (doc.startsWith("555")) {
                System.out.println("6) Номер документа начинается с последовательности цифр 555");
            } else {
                System.out.println("6) Номер документа не начинается с последовательности цифр 555");
            }
        }
        /**
         * 7) Проверить заканчивается ли номер документа на последовательность 1a2b.
         */
        private static void num7(String doc) {
            if (doc.endsWith("1a2b")) {
                System.out.println("7) Номер документа заканчивается на 1a2b");
            } else {
                System.out.println("7) Номер документа не заканчивается на 1a2b");
            }
        }
    }

