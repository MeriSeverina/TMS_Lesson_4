import java.util.Scanner;

public class Main {

       public static void main(String[] args) {
/** Не верно сразу прочитала ДЗ, пропустила последний пункт, где:
 *   Все эти методы реализовать в отдельном классе в статических методах,
 *  которые на вход(входным параметром)
 * будут принимать вводимую на вход программы строку.
 * ------класс Scanner реализовала с 5 пункта
 *
 * 1) Вывести на экран в одну строку два первых блока по 4 цифры
 */

        String str = "2454-HBD-6879-ABC-5a2s";

        String[] array = str.split("-");
        System.out.print("1) " + array[0]);
        System.out.println(" " + array[2]);

        /**
         * * 2) Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
         */
        String result = str.replaceAll("[HBDABC]", " ");
        System.out.println ("2) " + result);

        /**
         * 3) Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
         */
        String str2 = "2454-HBD-6879-ABC-5a2s";
        str2 = str.toLowerCase();
        String result2 = str2.replaceAll("[^a-zA-Z]", "");
        char[] array2 = result2.toCharArray();
        System.out.println("3) "+array2[0]+array2[1]+array2[2]+"/"+array2[3]+array2[4]+array2[5]+"/"+array2[6]+"/"+array2[7]);

        /**
         * 4) Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
         * (реализовать с помощью класса StringBuilder)
         */
        String str3 = "2454-HBD-6879-ABC-5a2s";
        str3 = str.toUpperCase();
        StringBuilder sb = new StringBuilder(str3);
//           sb.delete(0,5);
//           sb.delete(13,16);
//           sb.delete(17,18);
//           sb.delete(20,21);
        String result3 = sb.toString();
        System.out.println( "4) Letters:" + result3);

        /**
        * 5) Проверить содержит ли номер документа последовательность abc и вывети
        * сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
        */
        Scanner console = new Scanner(System.in);
        System.out.println("");
        System.out.println("Введите номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy    где x - это число, а y - это буква");
        System.out.print("Ввод:");
        String numDoc = console.nextLine();
        System.out.println(numDoc.indexOf("abc"));
        String s = numDoc, sub="abc";
            if (s.indexOf(sub) != -1) {
               System.out.println("Номер документа содержит последовательность букв abc");
           } else {
               System.out.println("Номер документа не содержит последовательность букв abc");
           }
            String s2 = numDoc, sub2 = "ABC";
            if (s.indexOf(sub2) != -1){
               System.out.println("Номер документа содержит последовательность букв ABC");
           } else {
               System.out.println("Номер документа не содержит последовательность букв ABC");
           }


        /**
        * 6) Проверить начинается ли номер документа с последовательности 555.
        */
        Scanner console2 = new Scanner(System.in);
        System.out.println("");
        System.out.println("Введите номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy    где x - это число, а y - это буква");
        System.out.print("Ввод:");
        String numDoc2 = console.nextLine();
           if (numDoc2.startsWith("555")) {
               System.out.println("Номер документа начинается с последовательности цифр 555");
           }else {
               System.out.println("Номер документа не начинается с последовательности цифр 555");
           }


        /**
        * 7) Проверить заканчивается ли номер документа на последовательность 1a2b.
        */
        Scanner console3 = new Scanner(System.in);
        System.out.println("");
        System.out.println("Введите номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy    где x - это число, а y - это буква");
        System.out.print("Ввод:");
        String numDoc3 = console.nextLine();
           if (numDoc3.endsWith("1a2b")) {
               System.out.println("Номер документа заканчивается на 1a2b");
           }else {
               System.out.println("Номер документа не заканчивается на 1a2b");
           }


        }
}
