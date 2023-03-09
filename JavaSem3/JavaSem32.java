package JavaSem3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaSem32 {
    public static void main(String[] args) {
        String[] preList = {"Mercury", "Earth", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", 
                        "Neptune", "Pluto", "Venus", "Mars", "Mars", "Jupiter"};
        List<String>planets = Arrays.asList(preList);
        System.out.println(planets);
        Collections.sort(planets);
        System.out.println(planets);
    }
}

