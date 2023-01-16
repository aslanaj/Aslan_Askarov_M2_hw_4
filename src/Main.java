import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните поле: ");

        ArrayList<String> listA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listA.add(input.nextLine());

        }

        System.out.println("list A: " + listA);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Заполните поле: ");

        ArrayList<String> listB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listB.add(input2.nextLine());

        }
        System.out.println("list b:  " + listB);

        ArrayList<String > listC = new ArrayList<>();

        Collections.reverse(listB);
        listC.add(listA.get(0));
        listC.add(listB.get(0));
        listC.add(listA.get(1));
        listC.add(listB.get(1));
        listC.add(listA.get(2));
        listC.add(listB.get(2));
        listC.add(listA.get(3));
        listC.add(listB.get(3));
        listC.add(listA.get(4));
        listC.add(listB.get(4));

        System.out.println(listC);

        Collections.sort(listC, new Names());
        System.out.println("Сортированный лист: " + listC);




    }
}