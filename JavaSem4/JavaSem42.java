package JavaSem4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class JavaSem42 {
    public static void main(String[] args) {
        String input;
        LinkedList<String> Hranilishe = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        input = "start";
        while (!input.equals("exit")) {
            input = sc.nextLine().toLowerCase(Locale.ROOT);
            if (input.equals("print")) {
                int index = Hranilishe.size() - 1;
                //Выполнение реверсом
                Collections.reverse(Hranilishe);
                System.out.println(Hranilishe);
                Collections.reverse(Hranilishe);
                //Выполнение поэлементно
                while (index >= 0) {
                    System.out.println(Hranilishe.get(index));
                    index--;
                }
            } else if (input.equals("revert") && Hranilishe.size() > 0) {
                if (Hranilishe.size() > 0) Hranilishe.remove(Hranilishe.size() - 1);

            } else {
                Hranilishe.add(input);
                // System.out.println(Hranilishe);
            }

        }
        sc.close();
    }
}