package JavaSem1;

import java.util.Scanner;

public class JavaSem12 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        // System.out.print("Привет, " + name + "!");
        iScanner.close();
    }
}