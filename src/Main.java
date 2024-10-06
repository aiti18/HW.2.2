import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Считывание 5 строк и сохранение их в Список А
        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A" + (i + 1) + ": ");
            listA.add(scanner.nextLine());
        }

        // c) Отобразить список A
        System.out.println("\nСписок A:");
        System.out.println(listA);

        // d) Считывание еще 5 строк и сохранение их в Список B
        List<String> listB = new ArrayList<>();
        System.out.println("\nВведите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B" + (i + 1) + ": ");
            listB.add(scanner.nextLine());
        }

        // Отобразить список B
        System.out.println("\nСписок B:");
        System.out.println(listB);

        // e) Объединить списки A и B в новый список C в порядке {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));  // Добавляем элементы из B в обратном порядке
        }

        // f) Отобразить список C
        System.out.println("\nСписок C после объединения:");
        System.out.println(listC);

        // g) Отсортировать список C по длине строки и вывести его
        listC.sort(Comparator.comparingInt(String::length));

        System.out.println("\nСписок C после сортировки по длине строки:");
        System.out.println(listC);
    }
}
