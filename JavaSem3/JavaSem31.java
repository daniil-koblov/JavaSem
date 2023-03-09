
package JavaSem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSem31 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numbers.add((int)(Math.random() * (20 - 0)) + 1);
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
