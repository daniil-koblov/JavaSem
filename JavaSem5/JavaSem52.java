//Программа определяющая правильность расстановки скобок.
package JavaSem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaSem52 {
    public static void main(String[] args) {
        Map<Character,Character> brakets = new HashMap<>();
        brakets.put('{', '}');
        brakets.put('[', ']');
        brakets.put('(', ')');
        brakets.put('<', '>');
        String input = "(123+[123])";
        ArrayList<Character> inputArray = (ArrayList<Character>) input.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        for(Character brakOpen : brakets.keySet()){
            if(!(Collections.frequency(inputArray, brakOpen) == Collections.frequency(inputArray, brakets.get(brakOpen)))){
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");
    }
}
